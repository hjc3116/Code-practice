package home.work.worktwo;

//体会 重写的好处  如何扩展方法，增加自己想要的功能
public class work07 {
  public static void main(String[] args) {
    checkingaccount checkingaccount = new checkingaccount(1000);
    checkingaccount.deposit(10);
    checkingaccount.withdraw(10);
    System.out.println(checkingaccount.getBalance());

    //测试savingsaccount
    System.out.println("\n测试savingsaccount");
    savingsaccount savingsAccount = new savingsaccount(1000);
    savingsAccount.deposit(100);//免手续费
    savingsAccount.deposit(100);//免手续费
    savingsAccount.deposit(100);//免手续费
    System.out.println(savingsAccount.getBalance());
    savingsAccount.deposit(100);//扣手续费
    //大于3次 收取手续费  应为1399
    System.out.println(savingsAccount.getBalance());
    savingsAccount.setEarn(0.1);//设置利息

    //月初，定时器自动调用一下 earnMonthlyInterest
    //重置 3次免手续费并存入利息
    savingsAccount.earnMonthlyInterest();
    System.out.println(savingsAccount.getBalance());//1399+139
    savingsAccount.deposit(100);//免手续费
    System.out.println(savingsAccount.getBalance());
  }
}

//父类
class BankAcocount {
  private double balance;

  public BankAcocount(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  //存款
  public void deposit(double amount) {
    balance += amount;
  }

  //取款
  public void withdraw(double amount) {
    balance -= amount;
  }
}

//子类 扩展  每次存款取款 扣1元手续费
class checkingaccount extends BankAcocount {
  public checkingaccount(double balance) {
    super(balance);
  }

  @Override
  public void deposit(double amount) {
    super.deposit(amount - 1);
  }

  @Override
  public void withdraw(double amount) {
    super.withdraw(amount + 1);
  }
}

//子类 每月有利息产生
class savingsaccount extends BankAcocount {
  private double earn;
  private int times = 3;

  public savingsaccount(double balance) {
    super(balance);
  }

  public int getTimes() {
    return times;
  }

  public void setTimes(int times) {
    this.times = times;
  }

  public double getEarn() {
    return earn;
  }

  public void setEarn(double earn) {
    this.earn = earn;
  }

  //每个月初，统计上个月的利息，同时将times初始化
  public void earnMonthlyInterest() {
    times = 3;
    //调用父类存款方法，把利息存入
    super.deposit(getBalance() * earn);
  }

  @Override
  public void deposit(double amount) {
    //判断是否还可以免手续费
    if (times > 0) {
      super.deposit(amount);
    } else {
      super.deposit(amount - 1);//1块转入银行
    }
    times--;
  }

  @Override
  public void withdraw(double amount) {
    if (times > 0) {
      super.withdraw(amount);
    } else {
      super.withdraw(amount + 1);
    }
    times--;
  }
}

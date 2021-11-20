package com.Enapsulation;

public class Account {
  public static void main(String[] args) {
    //方法1 直接用构造器进行初始化参数
    Accounttest account = new Accounttest("jack", 42, "231145");
    //方法2 调用方法进行赋值
    account.setName("jack");
    account.setBalance(41);
    account.setPassword("123432");
    System.out.println(account.info());

  }
}

class Accounttest {
  private String name;
  private double balance;
  private String password;


  //此处是为第5行代码的赋值所写
  public Accounttest() {
  }

  public Accounttest(String name, double balance, String password) {
    //注意格式，只有这样才能在赋值参数的时候 进行验证，否则私密属性将无用
    this.setName(name);
    this.setBalance(balance);
    this.setPassword(password);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() >= 2 && name.length() <= 4) {
      this.name = name;
    } else {
      System.out.println("请输入2-4个字的名字");
      this.name = "hjc";
    }
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    if (balance > 20) {
      this.balance = balance;
    } else {
      System.out.println("余额小于20！");
      this.balance = 20;
    }
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    if (password.length() == 6) {
      this.password = password;
    } else {
      System.out.println("请输入6位密码！");
      this.password = "321234";
    }
  }

  public String info() {
    return "姓名" + name + "余额" + balance + "密码" + password;
  }
}


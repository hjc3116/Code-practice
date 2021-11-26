package home.work.worktwo;

public class work05 {
  public static void main(String[] args) {
    staff01 jack = new staff01(2000, "jack");
    jack.setSalMonth(10);//设置工资 月份： 动态修改，有默认值也可以改
    jack.printsal();

    Peasant smith = new Peasant(3000, "smith");
    smith.printsal();

    Teacher01 hjc = new Teacher01(4000, "hjc");
    hjc.setSalMonth(14);
    hjc.setClassday(300);
    hjc.setClasssalary(1000);
    hjc.printsal();

    science zns = new science(5000, "终南山");
    zns.setBonus(200000);
    zns.printsal();
  }

}

class worker {
  private double salary;
  private String name;
  private int salMonth = 12;

  public worker(double salary, String name) {
    this.salary = salary;
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalMonth() {
    return salMonth;
  }

  public void setSalMonth(int salMonth) {
    this.salMonth = salMonth;
  }

  public void printsal() {
    System.out.println("姓名:" + name + "年工资:" + (salary * salMonth));
  }
}

//工人
class staff01 extends worker {
  public staff01(double salary, String name) {
    super(salary, name);
  }

  @Override
  public void printsal() {
    System.out.print("工人 ");
    super.printsal();
  }
}

//农民
class Peasant extends worker {
  public Peasant(double salary, String name) {
    super(salary, name);
  }

  @Override
  public void printsal() {
    System.out.print("农民 ");
    super.printsal();
  }
}

//老师
class Teacher01 extends worker {
  private int classday;
  private double classsalary;
  //用set，get方法 设置 而不用 构造器设置 可以灵活修改

  public Teacher01(double salary, String name) {
    super(salary, name);
  }

  public int getClassday() {
    return classday;
  }

  public void setClassday(int classday) {
    this.classday = classday;
  }

  public double getClasssalary() {
    return classsalary;
  }

  public void setClasssalary(double classsalary) {
    this.classsalary = classsalary;
  }

  //方法重写
  @Override
  public void printsal() {
    System.out.print("老师 ");
    System.out.println("姓名:" + getName() + "年工资:"
                           + (getSalMonth() * getSalary() + classday * classsalary));

  }
}

//科学家
class science extends worker {
  private double bonus;

  public science(double salary, String name) {
    super(salary, name);
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public void printsal() {
    System.out.print("科学家 ");
    System.out.println("姓名：" + getName() + "年工资：" +
                           (getSalary() * getSalMonth() + bonus));
  }
}
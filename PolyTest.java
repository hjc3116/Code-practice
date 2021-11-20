package com.Poly;

/**
 * @author
 */
public class PolyTest {
  public static void main(String[] args) {
    worker tom = new worker("tom", 2000);
    manager milan = new manager("milan", 20000, 49999);
    PolyTest polyTest = new PolyTest();
    polyTest.showEmployee(tom);
    polyTest.showEmployee(milan);

    polyTest.testwork(tom);
    polyTest.testwork(milan);

  }

  public void showEmployee(Employee e) {
    System.out.println("姓名 " + e.getName() + "年薪 " + e.getAnnuals());
  }

  ///添加一个方法，testWork ,如果是普通员工，则调用work方法，
  // 如果是经理，则调用manage方法
  public void testwork(Employee e) {
    if (e instanceof worker) {
      //向下转型
      ((worker) e).work();
    } else if (e instanceof manager) {
      //向下转型
      ((manager) e).manage();
    } else {
      System.out.println("不做处理。");
    }
  }
}

//父类
class Employee {
  private String name;
  private int Annual;

  //构造
  public Employee(String name, int Annual) {
    this.name = name;
    this.Annual = Annual;
  }

  //设置接口
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAnnual() {
    return Annual;
  }

  public void setAnnual(int Annual) {
    this.Annual = Annual;
  }

  public double getAnnuals() {
    return 12 * Annual;
  }
}

//子类
class worker extends Employee {
  public worker(String name, int Annual) {
    super(name, Annual);
  }

  public void work() {
    System.out.println("工人" + getName());
  }

  @Override
  public double getAnnuals() {
    //调用父类getAnnuals（）方法
    return super.getAnnuals();
  }
}

//子类
class manager extends Employee {
  private double bonus;

  public manager(String name, int Annual, double bonus) {
    super(name, Annual);
    this.bonus = bonus;
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public void manage() {
    System.out.println("经理" + getName());
  }

  @Override
  public double getAnnuals() {
    return super.getAnnuals() + bonus;
  }
}


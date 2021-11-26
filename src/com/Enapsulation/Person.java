package com.Enapsulation;

public class Person {
  public static void main(String[] args) {
    Person1 person1 = new Person1("hjc", 149, 4534);
    person1.setName("hjc");
    person1.setAge(30);
    person1.setSalary(40);
    System.out.println(person1.info());
  }
}

class Person1 {
  public String name;
  private int age;
  private double salary;

  //可以将set方法写在构造器中，这样仍然可以保护数据 进行验证
  public Person1(String name, int age, double salary) {
    //不写this 也可以
    setName(name); //等价 this.setName(name)
    setAge(age);
    setSalary(salary);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() >= 2 && name.length() <= 6) {
      this.name = name;
    } else {
      System.out.println("名字长度不正确");
      this.name = "无名人";
    }
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    //判断 输入的数据是否合理
    if (age > 0 && age < 120) {
      this.age = age;
    } else {
      System.out.println("请输入1-120");
      this.age = 18;
    }
  }

  public double getSalary() {
    //可以在这里增加对当前对象的权限判断
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String info() {
    return "姓名" + name + "年龄" + age + "薪水" + salary;
  }
}

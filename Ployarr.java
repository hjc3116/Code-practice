package com.Poly;

public class Ployarr {
  public static void main(String[] args) {
    Persons[] person = new Persons[5];
    person[0] = new Persons("jack", 20);
    person[1] = new Student("mary", 14, 100);
    person[2] = new Student("smith", 24, 90);
    person[3] = new Teacher("wang", 34, 8090);
    person[4] = new Teacher("zhao", 44, 5090);

    for (int i = 0; i < person.length; i++) {
      //person【i】根据运行类型进行改变
      //动态绑定机制
      person[i].say();
      //无法调用子类特有的方法
      System.out.println(person[i].say());

      //判断person【i】的运行类型是不是Student
      if (person[i] instanceof Student) {
        //向下转型
        //把父类Person转为子类Student
        Student student = (Student) person[i];
        student.learning();
        //或者：((Student)person[i]).learning();
      } else if (person[i] instanceof Teacher) {
        Teacher teach = (Teacher) person[i];
        teach.teach();
      } else {
        System.out.println("类型有误");
      }
    }
  }
}

//父类
class Persons {
  private String name;
  private int age;

  public Persons(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String say() {
    return name + "\t" + age;
  }
}

//子类
class Student extends Persons {
  private double score;

  public Student(String name, int age, double score) {
    super(name, age);
    this.score = score;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  @Override
  public String say() {
    return super.say() + " score=" + score;
  }

  public void learning() {
    System.out.println("学生正在学习" + getName());
  }
}

//子类
class Teacher extends Persons {
  private double salary;

  public Teacher(String name, int age, double salary) {
    super(name, age);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String say() {
    return super.say() + " salary=" + salary;
  }

  public void teach() {
    System.out.println("老师正在教书" + getName());
  }

}
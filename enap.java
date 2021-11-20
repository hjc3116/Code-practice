package com.summarize;

public class enap {
  public static void main(String[] args) {
    A a = new A();
    a.setAge(400);
    a.setName("jack");
    System.out.println(a.say());
    A b = a;
    System.out.println(b .equals(a) );
    "hello".equals("abc");
  }
}

class A {
  private String name;
  private int age;

  public A() {
  }

  public A(String name, int age) {
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
    if (age < 100) {
      this.age = age;
    } else {
      System.out.println("输入错误");
      this.age = 18;
    }
  }

  public String say() {
    return name + age;
  }
}

class B extends A {
  private double score;

  public B(String name, int age, double score) {
    super(name, age);
    this.score = score;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }
}
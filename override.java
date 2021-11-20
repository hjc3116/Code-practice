package com.extend;

public class override {

  private String name;
  private int age;

  public override(String name, int age) {
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
    return "\t姓名" + name + "年龄" + age;
  }
}

class Steudnt extends override {
  private String id;
  private double score;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public Steudnt(String name, int age, String id, double score) {
    super(name, age);
    this.id = id;
    this.score = score;
  }

  @Override
  public String say() {
    return super.say() + "\t身份： " + id + "\t分数： " + score;
  }

}

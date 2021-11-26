package com.extend.improve;

//父类  graduate 和 pupil的 父类
public class student {
  //共有的属性
  public String name;
  public int age;
  public double score;

  //共有的方法
  public void setScore(double score) {
    this.score = score;
  }

  public void showinfo() {
    System.out.println("大学生" + name + "年龄" + age + "成绩" + score);
  }
}

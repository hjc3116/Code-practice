package com.extend;

public class Graduate {
  public String name;
  public int age;
  public double score;

  public void setScore(double score) {
    this.score = score;
  }

  public void testing() {
    System.out.println("小学生" + name + "正在考试");
  }

  public void showinfo() {
    System.out.println("大学生" + name + "年龄" + age + "成绩" + score);
  }
}

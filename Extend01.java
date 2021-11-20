package com.extend;

public class Extend01 {
  public static void main(String[] args) {
    Pupil pupil = new Pupil();
    pupil.name = "小明";
    pupil.age = 10;
    pupil.testing();
    pupil.setScore(60);
    pupil.showinfo();

    Graduate graduate = new Graduate();
    graduate.name = "大明";
    graduate.age = 20;
    graduate.testing();
    graduate.setScore(80);
    graduate.showinfo();

  }
}

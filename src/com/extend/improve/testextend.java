package com.extend.improve;

import com.extend.Graduate;

public class testextend {
  public static void main(String[] args) {
    pupil pupil = new pupil();
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

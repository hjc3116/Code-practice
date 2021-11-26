package com.innerclass.innerclass_anonymous;

/**
 * @author Administrator
 */
public class innerclassexercise {
  public static void main(String[] args) {
    //当做实参直接传递
    f1(new IL() {
      @Override
      public void show() {
        System.out.println("这是show");
      }
    });

    //传统方式实现IL 还要创建一个类 太繁琐
    f1(new picture());
  }

  //静态方法
  public static void f1(IL il) {
    il.show();
  }
}

//接口
interface IL {
  void show();
}

class picture implements IL {
  @Override
  public void show() {
    System.out.println("这是一幅画");
  }
}
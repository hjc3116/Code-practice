package com.codeblock;

public class sample {
  c cam1=new c("c成员初始化");
  static c cam = new c("静态成员c初始化");
  static{
    System.out.println("static 块执行");
  }
  sample(){
    System.out.println("sample默认构造器被调用");
  }

  public static void main(String[] args) {
    //首先执行静态属性 和静态代码块
    //然后执行普通属性和普通代码块

    sample a = new sample();
  }
}
class c{
  c(String s){
    System.out.println(s);
  }
  c(){
    System.out.println("c默认构造器函数被调用");
  }
}
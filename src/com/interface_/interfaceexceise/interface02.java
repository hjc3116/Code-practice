package com.interface_.interfaceexceise;

/**
 * @author Administrator
 */
public interface interface02 {
  //写属性
  public int n=10;

  //写方法
  //在接口中，抽象方法，可以省略abstract关键字
  //一个普通类实现接口，必须把接口中的方法都实现
  public void hi();
  public void he();

  //在jkd8口，可以有默认实现方法,需要使用default关键字
  default public void lo(){
    System.out.println("lo");
  }

  //在jdk8后，可以有静态方法
  static void ok(){
    System.out.println("ok");
  }
}

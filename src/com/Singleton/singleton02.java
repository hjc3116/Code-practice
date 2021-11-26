package com.Singleton;

/**
 * @author Administrator
 * 懒汉式
 * //1.将构造器私有化
 * //2.定义一个静态static属性
 * //3.提供一个公共public的static的方法返回一个Cat对象
 * //4.懒汉式，只有当用户使用getInstance方法时，菜返回cat对象，之后再次调用，会返回上次
 * //创建的对象，从而保证单例
 */
public class singleton02 {
  public static void main(String[] args) {
    Cat instance = Cat.getInstance();
    System.out.println(instance);

    //再次调用getInstance
    //不会创建新对象，直接返回instance对象
    Cat instance2 = Cat.getInstance();
    System.out.println(instance2);


  }
}

//希望在程序运行过程中 只能创建一个cat对象
//使用单例模式
class Cat {
  private String name;
  private static Cat cat;//cat默认为null
  //饿汉式
  //private static cat Cat = new Cat("")

  private Cat(String name) {//1.将构造器私有化
    this.name = name;
  }

  public static Cat getInstance() {
    if (cat == null) {//如果还没有创建cat对象
      cat = new Cat("小可爱");
    }
    return cat;
  }

  @Override
  public String toString() {
    return "Cat{" +
               "name='" + name + '\'' +
               '}';
  }
}
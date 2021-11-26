package com.Singleton;

/**
 * @author Administrator
 *   //如何保证我们只能创建一个单例（对象）------饿汉式
 *   //1.将构造器私有化
 *   //2.在类的内部直接创建一个（对象）
 *   //3.提供一个公共的static的方法返回gf对象
 *   //通过方法可以获取对象
 */

public class singleton01 {
  public static void main(String[] args) {
    //这不是单例
    //    Girlfriend xh = new Girlfriend("小红");
    //    Girlfriend xm = new Girlfriend("小明");

    //通过方法可以获取对象
    Girlfriend in = Girlfriend.getInstance();
    System.out.println(in);

    //in2和in是同一个对象
    Girlfriend in2 = Girlfriend.getInstance();
    System.out.println(in2);

    System.out.println(in.equals(in2));
  }
}

class Girlfriend{
  private  String name;


  //只要类加载了 就会创建gf
  //为了能够返回gf对象，需要将其修饰为static
  private static Girlfriend gf = new Girlfriend("小红");//2.在类的内部直接创建一个（对象）


  private  Girlfriend(String name) {//1.将构造器私有化
    this.name = name;
  }

  //如果不是static方法 则需要在主方法中创建一个对象
  public static Girlfriend getInstance(){//3.提供一个公共的static的方法返回gf对象
    return gf;
  }

  @Override
  public String toString() {
    return "Girlfriend{" +
               "name='" + name + '\'' +
               '}';
  }
}

package com.innerclass.innerclass_anonymous;



/**
 * @author Administrator
 */
public class innerclass_anonymous01 {
  public static void main(String[] args) {
    outer11 outer11 = new outer11();
    outer11.method();
  }
}
class outer11{
  private int n11 =10;
  public void method(){
    //基于几口的匿名内部类
    //1.需求 ：想使用接口IA,并创建对象
    //传统方式，写一个类 实现该接口，并创建对象
    IA tigers = new tiger();
    tigers.cry();

    //2.需求 tiger类 只用一次 以后不再使用
    //3.用传统方式太繁琐，使用匿名内部类简化开发
    IA tiger = new IA(){
      @Override
      public void cry() {
        System.out.println("老虎叫");
      }
    };

    System.out.println("tiger运行类型="+ tiger.getClass());
    tiger.cry();
    //4.tiger的编译类型：IA
    //5.tiger的运行类型：就是匿名内部类XXXX =>outer11$1
//
//       class XXXX implements IA{
//        @Override
//        public void cry() {
//           System.out.println("老虎叫");
//           }
//       }
    // 6.jdk底层在创建匿名内部类 outer$1，立即马上就创建了outer$1实例
    //并且把地址返回给tiger
    //7.匿名内部类 使用一次后就不能再使用


    //基于类的匿名内部类
    B b = new B("jack"){
      @Override
      public void test() {
        System.out.println("匿名内部类重写了test方法");
      }
    };
    //B b = new B("jack"); 创建对象与内部类的区别
    //1.B 编译类型 B
    //2.B 运行类型 outer11$2
    //底层会创建匿名内部类
//    class outer11$2 extends B{
//      @Override
//      public void test() {
//        System.out.println("匿名内部类重写了test方法");
//      }
//    }
    //同时也直接返回了匿名内部类outer11$2的对象
    System.out.println("B对象的运行类型"+b.getClass());
    b.test();

    //基于抽象类的匿名内部类
    C c = new C(){
      //抽象类 必须实现方法
      @Override
      void eat() {
        System.out.println("小狗吃骨头");
      }
    };
    c.eat();
  }
}

class tiger implements IA{
  @Override
  public void cry() {
    System.out.println("老虎叫");
  }
}

class dog implements IA{
  @Override
  public void cry() {
    System.out.println("小狗叫");
  }
}

//接口
interface IA{
  public void cry();
}

class B{
  public  B(String name){

  }
  public void test(){}
}

abstract class C{
  abstract void eat();
}
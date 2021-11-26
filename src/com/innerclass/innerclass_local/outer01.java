package com.innerclass.innerclass_local;

public class outer01 {
  public static void main(String[] args) {
    outer02 outer02 = new outer02();
    outer02.m1();
  }
}
class outer02 {//外部类
  private int n1=100;
  private void m2(){
    System.out.println("m2");
  }

    public void m1(){

      //局部内部类是定义在外部类的局部位置上，通常在方法
      class inner03{//局部内部类
        //可以直接访问外部类的所有成员，包括私有的
        int n1=800;
        public void f1(){
          System.out.println("n1内部类="+n1);//访问外部类成员n1（私有的n1）
          m2();
          //如果外部类和内部类的成员重名，默认按照就近原则
          //如果想访问外部类的成员 使用 （外部类名.this.成员） 访问
          System.out.println("n1外部类="+outer02.this.n1);
        }
      }

      /**
       * 作用域只在所在方法m1（）或代码块中
       */
      class outer05 extends inner03{
      }
      //外部类可以在方法中创建内部类的对象实例，然后调用方法即可
      //注意 必须在作用域内 创建
      inner03 inner=new inner03();
      inner.f1();
    }


}

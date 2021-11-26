package com.Abstract;

/**抽象类————模板设计模式
 * @author
 */

public class Abexercise {
  public static void main(String[] args) {
    AAA aaa = new AAA();
    aaa.cal();

    BBB bbb = new BBB();
    bbb.cal();

  }
}

abstract  class template{//抽象类————模板设计模式
  public abstract void job();//抽象方法
  public void cal(){//实现方法，调用job()
    //得到开始时间
    long start = System.currentTimeMillis();
    job();
    //得到结束时间
    long end = System.currentTimeMillis();
    System.out.println("执行时间"+ (end-start));
  }
}
class AAA extends template{
  @Override
  public void job(){//重写抽象方法job()
    int num = 0;
    for (int i = 0; i < 80000; i++) {
      num += i;
    }
  }
}

class BBB extends template{
  @Override
  public void job(){
    int num = 0;
    for (int i = 0; i < 8880000; i++) {
      num += i;
    }
  }
}
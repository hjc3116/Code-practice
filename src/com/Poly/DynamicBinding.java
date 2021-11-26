package com.Poly;


/**
 * @author
 */
public class DynamicBinding {
  public static void main(String[] args) {
    father a = new son();
    System.out.println(a.sum());
    System.out.println(a.sum1());
  }
}

class father {
  public int i = 10;

  public int sum() {
    //情况一：giti()方法触发动态绑定机制，因为a的运行类型是son，所以
    // 这里调用子类son的geti()方法
    return geti() + 10;//20 + 10
  }

  public int sum1() {
    return i + 10;//属性没哟动态绑定机制，哪里申明哪里使用，放回当前类的值
    //即 10 +10
  }

  public int geti() {
    return i;
  }
}

class son extends father {
  public int i = 20;

  @Override
  //情况一：假如注销此sum（）方法，则会去调用父类的sum（）方法，
  public int sum() {
    return i + 20;
  }

  @Override
  //情况二：假如注销此sum1（）方法，则会去调用父类的sum1（）方法
  public int sum1() {
    return i + 10;
  }

  @Override
  public int geti() {
    return i;//属性没有动态绑定机制，返回当前类的值 20
  }
}
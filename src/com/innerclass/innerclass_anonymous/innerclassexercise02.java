package com.innerclass.innerclass_anonymous;

/**
 * @author Administrator
 */
public class innerclassexercise02 {
  public static void main(String[] args) {
    cellphone aa = new cellphone();
    aa.alarmclock(new bell() {
      @Override
      public void ring() {
        System.out.println("懒猪起床了");
      }
    });

    aa.alarmclock(new bell() {
      @Override
      public void ring() {
        System.out.println("小伙伴");
      }

    });
  }
}
//接口
interface bell {
  void ring();
}

class cellphone {
  public void alarmclock(bell a) {
    a.ring();
  }

}

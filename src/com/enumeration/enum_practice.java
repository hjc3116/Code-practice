package com.enumeration;

/**
 * @author hjc
 */
public class enum_practice {
  public static void main(String[] args) {
    for(week w:week.values()){
      System.out.println(w);
    }
  }
}

enum week{
  MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
  THURSDAY("星期四"),
  FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
  private String name;

  private week(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return  name ;
  }
}
/**
 *
 */
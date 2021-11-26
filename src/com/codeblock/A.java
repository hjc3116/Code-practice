package com.codeblock;

public class A {
  public static void main(String[] args) {
    System.out.println("total="+b.total);
    System.out.println("total="+b.total);
  }
}
class b{
  public static  int total;
  static{
    total=100;
    System.out.println("in static block");
  }
}

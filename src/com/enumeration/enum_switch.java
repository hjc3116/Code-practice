package com.enumeration;

/**
 * @author hjc
 */
public class enum_switch {
  public static void main(String[] args) {
    Color2 Var = Color2.BLUE;

    switch(Var) {
      case RED:
        System.out.println("红色");
        break;
      case GREEN:
        System.out.println("绿色");
        break;
      case BLUE:
        System.out.println("蓝色");
        break;
      default:
    }
  }
}
enum Color2
{
  RED, GREEN, BLUE;
}
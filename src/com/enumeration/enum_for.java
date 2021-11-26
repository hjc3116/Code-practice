package com.enumeration;

/**
 * @author hjc
 */
public class enum_for {
  public static void main(String[] args) {
    for (Color1 myVar : Color1.values()) {
      System.out.println(myVar);
    }
  }


}
enum Color1
{
  RED, GREEN, BLUE;
}

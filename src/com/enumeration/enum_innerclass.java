package com.enumeration;

/**
 * @author hjc
 */
public class enum_innerclass {
  //每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 public static final 的。
  enum Color
  {
    RED, GREEN, BLUE;
  }

  // 执行输出结果
  public static void main(String[] args)
  {
    Color c1 = Color.RED;
    System.out.println(c1);
  }
}

package com.enumeration;

/**
 * @author hjc
 * values() 返回枚举类中所有的值。
 * ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
 * valueOf()方法返回指定字符串值的枚举常量。
 */
public class enum_methods {
  public static void main(String[] args)
  {
    // 调用 values()
    Color4[] arr = Color4.values();

    // 迭代枚举
    for (Color4 col : arr)//或者直接 for (Color4 col : Color4.values())
      //执行流程，依次从arr中取出数据，赋值给col，如果取出完毕，则退出for循环
    {
      // 查看索引
      System.out.println(col + " at index " + col.ordinal());
    }

    // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
    System.out.println(Color4.valueOf("RED"));
    // System.out.println(Color.valueOf("WHITE"));


/**
执行以上代码输出结果为：

RED at index 0
GREEN at index 1
BLUE at index 2
RED
 */

  }
}

enum Color4
{
  RED, GREEN, BLUE;
}
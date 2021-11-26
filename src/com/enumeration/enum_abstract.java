package com.enumeration;

/**
 * @author hjc
 * 枚举类中的抽象方法实现，需要枚举类中的每个对象都对其进行实现。
 */
public class enum_abstract {
  public static void main(String[] args) {
    for (Color5 c:Color5.values()){
      System.out.print(c.getColor5() + "、");
    }
  }
}
enum Color5{
  RED{
    @Override
    public String getColor5(){//枚举对象实现抽象方法
      return "红色";
    }
  },
  GREEN{
    @Override
    public String getColor5(){//枚举对象实现抽象方法
      return "绿色";
    }
  },
  BLUE{
    @Override

    public String getColor5(){//枚举对象实现抽象方法
      return "蓝色";
    }
  };

  public abstract String getColor5();//定义抽象方法
}
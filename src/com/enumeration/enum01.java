package com.enumeration;

/**
 * @author hjc
 */
public class enum01 {
  public static void main(String[] args) {
    season spring = new season("春天","温暖");
    season winter = new season("冬天","温暖");
    season summer = new season("夏天","温暖");
    season autumn = new season("秋天","温暖");
    spring.getDesc();
    System.out.println(spring);
    //因为对季节而言，他的对象是固定的只有4个，不会有更多
    //因此这样的设计不好，不能体现季节是固定的四个对象
    //而且这样的设计还能修改对象属性，不安全！

    //枚举类 可以解决此问题
    System.out.println(season2.AUTUMN);
    System.out.println(season2.SPRING);
    System.out.println(season2.SUMMER);
    System.out.println(season2.WINTER);

  }
}
//传统方式
class season{
  private  String name;
  private  String desc;

  public season(String name, String desc) {
    this.name = name;
    this.desc = desc;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  @Override
  public String toString() {
    return "season{" +
               "name='" + name + '\'' +
               ", desc='" + desc + '\'' +
               '}';
  }
}

//自定义枚举
//
// 将构造器私有化，目的防止 直接NEW
// 去掉setXxxx方法，防止属性被修改
// 在season内部，直接创建固定的对象
// 优化 可以加入final修饰符
class season2{
  private  String name;
  private  String desc;

  //在season内部，直接创建固定的对象
  // 优化 可以加入final修饰符
  public static final season2 SPRING = new season2("春天","温暖");
  public static final season2 WINTER = new season2("冬天","寒冷");
  public static season2 SUMMER = new season2("夏天","炎热");
  public static season2 AUTUMN = new season2("秋天","凉爽");


  // 将构造器私有化，目的防止 直接NEW
  private  season2(String name, String desc) {
    this.name = name;
    this.desc = desc;
  }

  // 去掉setXxxx方法，防止属性被修改
  public String getName() {
    return name;
  }
  public String getDesc() {
    return desc;
  }

  @Override
  public String toString() {
    return "season2{" +
               "name='" + name + '\'' +
               ", desc='" + desc + '\'' +
               '}';
  }
}
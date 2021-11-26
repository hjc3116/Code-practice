package com.enumeration;

/**
 * @author hjc
 * 构造函数只能使用 private 访问修饰符，所以外部无法调用
 * 如果使用enum实现枚举，要求将定义常量对象，写在最前面
 *
 * 1.toString:Enum类已经重写过了，返回的是当前对象
 * 名,子类可以重写该方法，用于返回对象的属性信息
 * 2. name:返回当前对象名(常量名)，子类中不能重写3. ordinal:返回当前对象的位置号，默认从0开始
 * 4. values:返回当前枚举类中所有的常量
 * 5. valueOf:将字符串转换成枚举对象,要求字符串必须为已有的常量名，否则报异常!
 * 6. compareTa: 比较两个枚举常量,比较的就是位置号!
 */
public class enum_keywords {
  public static void main(String[] args) {
    System.out.println(season3.AUTUMN);
    season3 c1=season3.SUMMER;
    c1.color();
    
    //name
    System.out.println(c1.name());
    
    //valueOf
    season3 summer=season3.valueOf("SUMMER");
    System.out.println("SUMMER"+summer);

    //compareTo
    //return season3.AUTUMN编号3 - season3.SUMMER编号2
    System.out.println(season3.AUTUMN.compareTo(season3.SUMMER));
    System.out.println(season3.SPRING.compareTo(season3.SUMMER));
    System.out.println(season3.WINNER.compareTo(season3.SUMMER));


  }
}

enum season3{
  /**
   * agree
   */
  /**
   * reject
   */
  //多个常量对象，使用，号间隔
  //如果使用enum实现枚举，要求将定义常量对象，写在最前面
      //与传统对比
      // public static final season2 SPRING = new season2("春天","温暖");
  SPRING("春天","温暖"),
  WINNER("冬天","寒冷"),
  SUMMER("夏天","炎热"),
  AUTUMN("秋天","凉爽");

  private  String name;
  private  String desc;

  //构造函数只能使用 private 访问修饰符，所以外部无法调用
  private season3(String name, String desc) {
    this.name = name;
    this.desc = desc;
  }

  public void color(){
    System.out.println("color");
  }
  @Override
  public String toString() {
    return "season3{" +
               "name='" + name + '\'' +
               ", desc='" + desc + '\'' +
               '}';
  }


}
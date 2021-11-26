package com.interface_.interface_and_extend;

/**
 * @author Administrator
 */

/**悟空想像鱼一样游泳
  //不可以继承鱼类，但是可以通过接口获得鱼的游泳能力
  //通过接口可以不断 增强悟空的能力 （扩展）
  //实现接口是对java单继承机制的补充
 */
@SuppressWarnings("all")
public class extendsvsinterface {
  public static void main(String[] args) {
    littlemonkey wukong=new littlemonkey("悟空");
    wukong.climbing();

    wukong.swimming();//通过接口实现 而不是继承
  }

}

//猴子
class monkey{
  private String name;
  public void climbing(){
    System.out.println(name + "猴子爬树");
  }

  public monkey(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

//继承 并使用接口
class littlemonkey extends monkey implements fishable{
  public littlemonkey(String name) {
    super(name);
  }
  @Override
  public void climbing() {
    super.climbing();
  }

  @Override
  public void swimming() {
    System.out.println(getName() +"会飞");
  }
}

//接口  鱼的游泳技能
interface  fishable{
  void swimming();
}
package home.work.worktwo;

public class work06 {
  public static void main(String[] args) {
    new Demo().test01();
    new Demo("John").test01();

  }
}

class Test01 {
  String name = "Rose";

  Test01() {
    System.out.println("Test");
  }

  Test01(String name) {//name john
    this.name = name;//这里把父类的name改成了john，因为属性没有动态绑定机制
  }
}

class Demo extends Test01 {
  String name = "Jcak";

  Demo() {
    super();
    System.out.println("Demo");
  }

  Demo(String s) {
    super(s);
  }

  public void test01() {
    System.out.println(super.name);
    System.out.println(this.name);
  }
}
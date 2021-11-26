package lydx.bao;

public class childgame {
  public static void main(String[] args) {
    Child child= new Child("白骨精");
    child.join();

    Child child2= new Child("狐狸精");
    child2.join();


    Child child3= new Child("老鼠精");
    child3.join();

    //类变量可以通过类名来访问
    System.out.println(Child.count);
  }

}

class Child{
  private String name;
  public static  int count = 0;

  public Child(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void join() {
    System.out.println(name + " 加入了游戏。。。");
  }
}

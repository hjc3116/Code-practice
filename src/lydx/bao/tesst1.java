package lydx.bao;

public class tesst1 {
  public static void main(String[] args) {
    Person01 p1 = new Person01("hjc", 43);
    Person01 p2 = new Person01("cjj", 3);
    Person01 p3 = new Person01("hc", 4);

    System.out.println("p1 p2 比较结果" + p1.compare(p2));
    System.out.println("p1 p2 比较结果" + p3.compare(p2));

  }

}

class Person01 {
  String name;
  int age;

  //创建构造器
  public Person01(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public boolean compare(Person01 p) {
//    if(this.name.equals(p.name) && this.age == p.age){
//      return true;
//    }else{
//      return false;
//    }
    //简化
    return this.name.equals(p.name) && this.age == p.age;
  }

}

package home.work.workone;

public class work1 {
  public static void main(String[] args) {

    A01 p = new A01();
    double[] sums = {};
    Double res = p.max(sums);
    if (res != null) {
      System.out.println(res);
    } else {
      System.out.println("输入有误");
    }

    A02 p1 = new A02();
    System.out.println(p1.find(new String[]{"hjc", "wm"}, "hjc"));


    double[] arr = {12, 31, 43};
    A03 p2 = new A03();
    double[] newarr = p2.copyarr(arr);
    for (int i = 0; i < newarr.length; i++) {
      System.out.println(newarr[i] + "\t");
    }

    Circle p3 = new Circle(3);
    System.out.println(p3.area());

    Cale p4 = new Cale(4, 5);
    Cale p5 = new Cale(8, 2.9);
    System.out.println(p4.sum() + "\n" + p4.getsum() + "\n" + p4.min() + "\n" + p4.chu());
    System.out.println(p5.sum() + "\n" + p5.getsum() + "\n" + p5.min() + "\n" + p5.chu());

    Circles c = new Circles();
    PassObject p6 = new PassObject();
    p6.printAreas(c, 5);

    A01 a01 = new A01();

  }
}

//输出某个double数组的最大值
class A01 {

  public Double max(double[] sums) {
    //输入数组不能为空，且长度大于0
    if (sums != null && sums.length > 0) {
      double max = sums[0];
      for (int i = 1; i < sums.length; i++) {
        max = Math.max(max, sums[i]);
      }
      return max;
    } else {
      return null;
    }
  }

  public String max() {
    return "输入有误";
  }
}

//查找某字符串数组中的元素，并返回，找不到返回-1
class A02 {
  public int find(String[] char_num, String str) {
    for (int i = 0; i < char_num.length; i++) {
      //判断字符串是否相等 要用equals
      if (str.equals(char_num[i])) {
        return i;
      }
    }
    return -1;
  }

  public String find(String str) {
    return "请输入字符串数组";
  }
}

//copy一个数组并输出
class A03 {

  public double[] copyarr(double[] arr) {
    double[] newarr = new double[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newarr[i] = arr[i];
    }
    return newarr;
  }
}

//输入半径 得到圆的面积和周长
class Circle {
  double r;

  public Circle(double r) {
    this.r = r;
  }

  public double area() {
    return Math.PI * r * r;
  }

  public double len() {
    return 2 * Math.PI * r;
  }
}

//
class Cale {
  double num1;
  double num2;

  public Cale(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public double sum() {
    return this.num1 + this.num2;
  }

  public double getsum() {
    return this.num1 * this.num2;
  }

  public double min() {
    return this.num1 - this.num2;
  }

  public double chu() {
    if ((this.num1 / this.num2) == 0) {
      System.out.println("除数为0");
    }
    return (this.num1 / this.num2);
  }
}

//设计dog类，有名字，颜色，年龄属性，定义输出方法show显示其信息
class Dog {
  String name;
  String color;
  int age;

  public Dog(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;

  }
}

//
class Employee {
  String name;
  char gender;
  int age;
  char zhiwei;
  double sla;

  public Employee(String name, char gender, int age, char zhiwei, double sla) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.zhiwei = zhiwei;
    this.sla = sla;
  }

  public Employee(String name, char gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public Employee(char zhiwei, double sla) {
    this.zhiwei = zhiwei;
    this.sla = sla;
  }
}

//
class Circles {
  double radius;

  public double findArea() {
    return Math.PI * radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}

class PassObject {
  public void printAreas(Circles c, int times) {
    System.out.println("radius\tarea");
    for (int i = 1; i <= times; i++) {
      //修改c对象的半径值
      c.radius = i;
      // 如果Circles是私密类  则需要用如下方法 修改
      c.setRadius(i);
      System.out.println(c.radius + "\t" + (double) i + "\t" + c.findArea());
    }
  }
}
//



































































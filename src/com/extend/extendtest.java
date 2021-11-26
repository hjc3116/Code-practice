package com.extend;

public class extendtest {
  public static void main(String[] args) {
    System.out.println("==============test01");
    son son = new son();
    System.out.println(son.name + son.getAge());

    System.out.println("==============test02");
    B b = new B();

    System.out.println("==============test03");
    E e = new E();

    System.out.println("==============test04");
    PC pc = new PC("intel", 400, 300, "huashuo");
    Notepad notepad = new Notepad("amd", 100, 200, "white");
    pc.printinfo();
    notepad.printinfo();
  }
}

//test01
class gradfather {
  String name = "grad";
  String hobby = "guapi";
  int age = 48;
}

class father extends gradfather {
  String name = "father";
  private int age = 28;

  public int getAge() {
    return age;
  }
}

class son extends father {
  String name = "son";
}

//test02
class A {
  public A() {
    System.out.println("a");
  }

  public A(String name) {
    System.out.println("a name");
  }
}

class B extends A {
  public B() {
    this("abc");
    System.out.println("b");
  }

  public B(String name) {
    super();//默认存在
    System.out.println("b name");
  }
}

//test03
class C {
  C() {
    System.out.println("woshic");
  }
}

class D extends C {
  D() {
    System.out.println("wishid");
  }

  D(String name) {
    super();//默认存在
    System.out.println(name + "whishid");
  }
}

class E extends D {
  E() {
    this("hello");
    System.out.println("woshie");
  }

  E(String name) {
    super("haha");
    System.out.println("woshie");
  }
}

//test04
class Computer {
  private String CPU;
  private double jol;
  private double sdd;


  public Computer(String CPU, double jol, double sdd) {
    this.CPU = CPU;
    this.jol = jol;
    this.sdd = sdd;
  }

  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    if (CPU.length() >= 2 && CPU.length() <= 4) {
      this.CPU = CPU;
    } else {
      System.out.println("CPU长度不正确");
      this.CPU = "AMD";
    }
  }

  public double getJol() {
    return jol;
  }

  public void setJol(double jol) {
    this.jol = jol;
  }

  public double getSdd() {
    return sdd;
  }

  public void setSdd(double sdd) {
    this.sdd = sdd;
  }

  public String getGetDetails() {
    return "\tcpu: " + CPU + "\t内存: " + jol + "\t硬盘: " + sdd;
  }
}

class PC extends Computer {
  private String brandName;

  PC(String CPU, double jol, double sdd, String brandName) {
    super(CPU, jol, sdd);
    this.brandName = brandName;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public void printinfo() {
    System.out.println(getGetDetails() + "\tBrandName" + brandName);
  }
}

class Notepad extends Computer {
  private String color;

  public Notepad(String CPU, double jol, double sdd, String color) {
    super(CPU, jol, sdd);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void printinfo() {
    System.out.println(getGetDetails() + "\tNotepad" + color);
  }
}



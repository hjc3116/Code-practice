package com.interface_.interfaceexceise;

public class interface022 {
  public static void main(String[] args) {
    A a = new A();
    a.hi();
  }
}
class A implements interface02{
  @Override
  public void hi() {
    System.out.println("hi()");
  }

  @Override
  public void he() {

  }
}
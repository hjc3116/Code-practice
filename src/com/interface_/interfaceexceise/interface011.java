package com.interface_.interfaceexceise;

/**
 * @author Administrator
 */
public class interface011 {
  public static void main(String[] args) {
    //创建手机 相机计算机对象‘
    camera camera = new camera();
    phone phone = new phone();
    computer computer = new computer();

    computer.work(phone);//把手机接入到计算机

    System.out.println("=================");
    computer.work(camera);
  }
}

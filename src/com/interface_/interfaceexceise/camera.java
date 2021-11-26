package com.interface_.interfaceexceise;

public class camera implements usbinterface{
  //实现接口，九十八接口方法实现
  @Override
  public void start() {
    System.out.println("相机开始工作");
  }

  @Override
  public void stop() {
    System.out.println("相机停止工作");
  }
}

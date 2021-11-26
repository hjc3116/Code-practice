package com.interface_.interfaceexceise;
//实现usbinterface

//phone类需要实现interface接口
public class phone implements usbinterface{

  @Override
  public void start() {
    System.out.println("手机开始工作");
  }

  @Override
  public void stop() {
    System.out.println("手机停止工作");
  }
}

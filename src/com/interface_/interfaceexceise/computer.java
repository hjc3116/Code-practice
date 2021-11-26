package com.interface_.interfaceexceise;

public class computer {
  //编写一个方法
  public void work(usbinterface usb){
    //通过接口来调用方法
    usb.start();
    usb.stop();
  }
}

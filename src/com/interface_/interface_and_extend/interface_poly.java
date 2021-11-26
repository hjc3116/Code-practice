package com.interface_.interface_and_extend;

public class interface_poly {
  public static void main(String[] args) {
    //接口的多态体现
    //接口类型的变量i01可以指向  实现了i接口的类的对象实例
    i i01 = new monster();
    i01 = new car();

    //继承体现的多态
    //父类类型的变量a 可以指向 继承aaa的子类的对象实例
    aaa a = new bbb();
    a = new ccc();


    //多态数组 ___接口类型数组
    usb[] usbs = new usb[2];
    usbs[0] = new phone_();
    usbs[1] = new camera_();

    for (int i = 0; i < usbs.length; i++) {
      usbs[i].work();//动态绑定

      if(usbs[i] instanceof phone_){//判断他的运行类型是phone_
        ((phone_) usbs[i]).call();
      }
    }
  }
}
//接口
interface i {
}

class monster implements i {
}

class car implements i {
}

//继承
class aaa {
}

class bbb extends aaa {
}

class ccc extends aaa {
}


//多态数组
interface usb {
  void work();
}

class phone_ implements usb {
  @Override
  public void work() {
    System.out.println("手机工作中");
  }

  public void call(){
      System.out.println("打电话");

  }
}

class camera_ implements usb {
  @Override
  public void work() {
    System.out.println("相机工作中");
  }
}

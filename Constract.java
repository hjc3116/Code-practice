package program.smallchange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Constract {
  //属性
  boolean loop = true;
  Scanner scanner = new Scanner(System.in);
  String key = "";

  String details = "-----------------零钱通明细---------------------";
  double money = 0;
  double balance = 0;
  double smoney = 0;
  Date date = null; //date 是java.util.Date类型，表示日期
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
  //可以用于日期格式化的

  //菜单界面
  public void  mainMenu(){
    do {
      System.out.println("==========零钱通菜单===========");
      System.out.println("\t\t1 零钱通明细");
      System.out.println("\t\t2 收益入账");
      System.out.println("\t\t3 消费");
      System.out.println("\t\t4 退     出");

      System.out.println("(请选择1-4): ");
      key = scanner.next();

      //使用switch 分支控制
      switch (key) {
        case "1":
          this.detail();
          break;
        case "2":
          this.income();
          break;
        case "3":
          this.pay();
          break;
        case "4":
          this.excit();
          break;
        default:
          System.out.println("选择有误");
      }
    } while (loop);
    System.out.println("显示零钱通菜单。。。");
  }

  //零钱通明细
  public void detail(){
    System.out.println(details);
  }
  //完成收益入账
  public void income(){
    System.out.println("收益入账金额：");
    money = scanner.nextDouble();
    //money的值范围应该校验
    //条件一
    if(money < 0) {
      System.out.println("收益金额需要大于0");
      return;//退出方法 不在执行后面的代码
    }
    //条件二
    if(money>10000){
      System.out.println("你不可能赚这么多");
      return;//退出方法 不在执行后面的代码
    }
    balance += money;
    //拼接收益入账信息到details
    date = new Date();//获取当前日期
    // System.out.println(sdf.format(date));
    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
  }
  //消费
  public void pay(){
    System.out.println("消费金额：");
    smoney = scanner.nextDouble();
    if(smoney<0){
      System.out.println("消费需大于0");
      return;
    }
    if(smoney>balance){
      System.out.println("余额不足");
      return;
    }
    balance = balance - smoney;
    date = new Date();//重新获取当前日期
    details += "\n消费支出\t" + -smoney + "\t" + sdf.format(date) + "\t" + balance;
    return;
  }
  //退出
  public void excit(){
    //用户输入4退出时，给出提示"你确定要退出吗? y/n"，必须输入正确的y/n ,否则循环输入指令，直到输入y或者n
    //思路分析
    //(1）定义一个变量 choice，接收用户的输入
    //(2）使用while + break,来处理接收到的输入时y或者n
    //退出while后，在判断choice是y还是n，就可以决定是否退出
    String choice = "";
    while (true){
      System.out.println("你确定退出么？y/n");
      choice = scanner.next();
      if("y".equals(choice) || "n".equals(choice)){
        //必须输入y或者n 否则 一直循环
        break;
      }
    }
    //尽量一段代码 完成一个功能
    //当用户退出while后 进行判断
    if(choice.equals("y")){
      loop = false;
    }
  }
}




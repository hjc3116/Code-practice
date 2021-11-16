package lydx.bao;

public class test {
  public static void main(String[] args) {
    fangfa01 t = new fangfa01();
    int sum = t.calculate(3,4);
    System.out.println(sum);
    System.out.println(t.calculate(1,2,3));
    System.out.println(t.calculate(1.1,2));
    System.out.println(t.calculate(1,2.2));
    //输出sums结果
    System.out.println(t.sum(1,5,7,8,4,4,9));
    int arr[] = {1,2,3,4};
    System.out.println(t.sum(0,arr));

    System.out.println(t.xc("xiaoming",80.2,80.2));
  }
}
class fangfa01 {
  //下面4个方法构成了重载
  //两个整数的和
  public int calculate(int n1, int n2) {
    return (n1 + n2);
  }

  //一个浮点一个整数的和
  public double calculate(double n1, int n2) {
    return (n1 + n2);
  }

  //一个整数一个浮点的和
  public double calculate(int n1, double n2) {
    return (n1 + n2);
  }

  //3个整数的和
  public int calculate(int n1, int n2, int n3) {
    return (n1 + n2 + n3);
  }

  //int...  表示 接收的是可变参数，类型是INT，可以接受0-多个变量
  //形参列表中，可变参数必须放在最后
  public int sum(int n1,int ... sums){
    //sums可以当作一个数组
    int res = 0;
    for(int i = 0; i < sums.length; i++){
      res += sums[i];
    }
  return res;
  }

  public String  xc(String a, double ... cj){
      double sum = 0;
      for(int i = 0; i < cj.length; i++){
        sum += cj[i];
      }
      return a + "有" + cj.length + "课程的成绩总分为" + sum;
  }
  

}

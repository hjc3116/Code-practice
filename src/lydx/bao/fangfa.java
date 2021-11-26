package lydx.bao;

class Person {
  String name;
  int age;
}

public class fangfa {
  /**
   * 求和
   */
  private void math() {
    int sum = 0;
    int yiqian = 1000;
    for (int i = 1; i <= yiqian; i++) {
      sum += i;
    }
    System.out.println("result = " + sum);
  }

  public void getmath() {
    this.math();
  }

  /**
   * 求前n项之和
   */
  public void math02(int n) {
    //（int n） 接收一个int参数，用户可以输入
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("result02 = " + sum);
  }

  public int summath(int[] a, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
    return sum;
  }

  /**
   * 求2数之和，返回一个指
   */
  public int getsum(int num1, int num2) {
    //可接收多个参数
    int sum = num1 + num2;
    return sum;
  }

  /**
   * 求和求差，返回2个值
   */
  public int[] getsum1(int n1, int n2) {

    int[] resarr = new int[2];
    resarr[0] = n1 + n2;
    resarr[1] = n1 - n2;
    return resarr;

  }

  /**
   * 判断一个数的奇偶
   */
  public boolean jugment(int n1) {

//        方法1：
//        if(n1%2 == 0){
//            return true;
//        }else{
//            return false;
//        }

//        方法2：
//        return n1 % 2 !=0 ? true: false;
    return n1 % 2 == 0;
  }

  /**
   * 循环打印某char类型数据
   */
  public void print(int row, int col, char c) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(c);
      }
      System.out.println();
    }

  }

  /**
   * 方法的参数调用(指针)
   */
  public void test(Person test) {
    //注意与public void test (int test )区别
    test.age = 1000;
  }

  /**
   * 递归，求第n个斐波那契数的值  1,1,2,3,5,6,13.。。。。。。n
   */
  public int fbnqs(int n) {
    if (n >= 1) {
      if (n == 1 || n == 2) {
        return 1;
      } else {
        return fbnqs(n - 1) + fbnqs(n - 2);
      }
    } else {
      System.out.println("请输入大于1 的数");
    }
    return -1;
  }

  /**
   * 猴子偷桃
   */
  public int houzi(int n) {
    if (n == 10) {
      return 1;
    } else if (n >= 1 && n <= 9) {
      return (houzi(n + 1) + 1) * 2;
    } else {
      System.out.println("请输入大于0的数");
      return -1;
    }

  }

  /**
   * 迷宫 二维数组
   */
  public void map01() {
    int[][] maps = new int[8][7];
    for (int i = 0; i < 7; i++) {
      maps[0][i] = 1;
      maps[7][i] = 1;
    }
    for (int i = 0; i < 8; i++) {
      maps[i][0] = 1;
      maps[i][6] = 1;
    }
    maps[3][1] = 1;
    maps[3][2] = 1;

    System.out.println("当前地图情况");
    for (int i = 0; i < maps.length; i++) {
      for (int j = 0; j < maps[i].length; j++) {
        System.out.print(maps[i][j] + " ");
      }
      System.out.println();
    }
    fangfa s = new fangfa();
    s.findway(maps, 1, 1);
    System.out.println("\n找路情况");

    for (int i = 0; i < maps.length; i++) {
      for (int j = 0; j < maps[i].length; j++) {
        System.out.print(maps[i][j] + " ");
      }
      System.out.println();
    }

    int sum01 = 0;
    //输出所走步数，以便比较各策略效率
    sum01 = s.p;
    System.out.println(sum01);
  }

  /**
   * 1.findway方法就是专内来找出迷宫的路径
   * 2．如果找到，就返回true ,否则返尚false
   * 3. map就是二维数组，即表示迷宫
   * 4. i,j就是老鼠的位置，初始化的位置为(1,1)
   * 5．因为我们是递归的找路，所以我先规定map数组的各个值的含义
   * 0表示可以走  1表示障碍物  2已经走过，表示可以走  3表示走过，但是走不通是死路
   * 6.当map【6】【5】 = 2说明找到通路，可以结束，否则继续找
   * 7. 先确定老鼠找路策略 下->右->上->左
   */

  int p = 0;

  //计数变量 在类中设置，注意作用域
  public boolean findway(int[][] map, int i, int j) {

    if (map[6][5] == 2) {

      return true;
    } else {
      if (map[i][j] == 0) {
        map[i][j] = 2;
        p++;
        if (findway(map, i + 1, j)) {
          return true;
        } else if (findway(map, i, j + 1)) {
          return true;
        } else if (findway(map, i - 1, j)) {
          return true;
        } else if (findway(map, i, j - 1)) {
          return true;
        } else {
          map[i][j] = 3;
          return false;
        }
      } else {
        return false;
      }
    }
  }

  /**
   * 罗汉塔
   */
  String js;

  public void move(int num, char a, char b, char c) {
    if (num == 1) {

      System.out.println(a + "->" + c);
    } else {
      move(num - 1, a, c, b);
      System.out.println(a + "->" + c);
      move(num - 1, b, a, c);
    }
  }


  /**
   * 八皇后
   */
  public void bahuanghou() { //创建棋盘
    int[][] maps = new int[8][8];
    System.out.println("当前八皇后棋盘情况");
    //输出棋盘
    for (int i = 0; i < maps.length; i++) {
      for (int j = 0; j < maps[i].length; j++) {
        System.out.print(maps[i][j] + " ");
      }
      System.out.println();
    }
    fangfa s = new fangfa();
    s.find(maps, 0, 0);
    System.out.println("\n找路情况");

    for (int i = 0; i < maps.length; i++) {
      for (int j = 0; j < maps[i].length; j++) {
        System.out.print(maps[i][j] + " ");
      }
      System.out.println();
    }
  }

  public boolean find(int[][] map_s, int i, int j) {
    if (map_s[i][j] != 0) {
      return true;
    } else {
      return false;
    }
  }


  /**
   * 重载
   */
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


  /**
   * 可变参数
   */
  public int sum(int... sums) {
    //sums可以当作一个数组
    int res = 0;
    for (int i = 0; i < sums.length; i++) {
      res += sums[i];
    }
    return res;
  }

  /**
   * 可变参数 封装
   */
  public String xc(String a, double... cj) {
    double sum = 0;
    for (int i = 0; i < cj.length; i++) {
      sum += cj[i];
    }
    return a + "有" + cj.length + "课程的成绩总分为" + sum;
  }


/** 构造器
 * //构造器的调用
 * @param 正确的调用：fangfa p1 = new fangfa(23,"jak")
 * @param 错误的调用： p1.fangfa(23,"jak")
int age;
String name;
public fangfa(int p, String n){
name = n;
age = p;
}
 */

}































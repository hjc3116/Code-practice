package lydx.bao;

public class test {
/** 迷宫 二维数组*/
public void  map01 (){
  int [][] maps = new int [8][7];
  for (int i = 0; i < 7; i++){
    maps[0][i] = 1;
    maps[7][i] = 1;
  }
  for(int i = 0; i < 8; i++){
    maps[i][0] = 1;
    maps[i][6] = 1;
  }
  maps[3][1] = 1;
  maps[3][2] = 1;

  System.out.println("当前地图情况");
  for(int i = 0; i <maps.length; i++){
    for(int j = 0; j <maps[i].length; j++){
      System.out.print(maps[i][j] + " ");
    }
    System.out.println();
  }
  fangfa s = new fangfa();
  s.findway(maps,1,1);
  System.out.println("\n找路情况");

  for(int i = 0; i <maps.length; i++){
    for(int j = 0; j <maps[i].length; j++){
      System.out.print(maps[i][j] + " ");
    }
    System.out.println();
  }

  int sum01 = 0;
  //输出所走步数，以便比较各策略效率
  sum01 = s.p;
  System.out.println(sum01);
}
/**1.findway方法就是专内来找出迷宫的路径
 * 2．如果找到，就返回true ,否则返尚false
 * 3. map就是二维数组，即表示迷宫
 * 4. i,j就是老鼠的位置，初始化的位置为(1,1)
 * 5．因为我们是递归的找路，所以我先规定map数组的各个值的含义
 0表示可以走  1表示障碍物  2已经走过，表示可以走  3表示走过，但是走不通是死路
 * 6.当map【6】【5】 = 2说明找到通路，可以结束，否则继续找
 * 7. 先确定老鼠找路策略 下->右->上->左
 */

int p = 0;
//计数变量 在类中设置，注意作用域
public boolean findway(int[][]map , int i, int j) {

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
    }else{
      return false;
    }
  }
}
}

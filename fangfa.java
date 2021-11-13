package lydx.bao;

class Person {
String name;
int age;
}
public class fangfa {
/**求和*/
    private void math() {
        int sum = 0;
        int yiqian = 1000;
        for (int i = 1; i <= yiqian; i++) {
            sum += i;
        }
        System.out.println("result = " + sum);
    }
    public void getmath(){
        this.math();
    }

/**求前n项之和*/
    public void math02(int n){
        //（int n） 接收一个int参数，用户可以输入
        int sum = 0;
        for(int i = 1 ; i <= n ; i ++ ){
            sum += i;
        }
        System.out.println("result02 = " + sum);
    }

/**求2数之和，返回一个指*/
    public int getsum(int num1, int num2){
        //可接收多个参数
        int sum = num1 + num2;
        return sum;
    }

/**求和求差，返回2个值*/
    public int[] getsum1(int n1, int n2){

        int[] resarr = new int[2];
        resarr[0] = n1 + n2;
        resarr[1] = n1 - n2;
        return resarr;

    }

/**判断一个数的奇偶*/
    public boolean jugment(int n1){

//        方法1：
//        if(n1%2 == 0){
//            return true;
//        }else{
//            return false;
//        }

//        方法2：
//        return n1 % 2 !=0 ? true: false;
        return n1 % 2  ==0;
    }

/**循环打印某char类型数据*/
    public void print(int row , int col, char c){
        for(int i = 0;i < row; i++){
            for(int j = 0;j < col; j++){
                System.out.print(c);
            }
            System.out.println();
        }

    }

/**方法的参数调用(指针)*/
    public void test(Person test){
    //注意与public void test (int test )区别
        test.age = 1000;
    }

/** 递归，求第n个斐波那契数的值  1,1,2,3,5,6,13.。。。。。。n*/
    public int fbnqs(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fbnqs(n - 1) + fbnqs(n - 2);
            }
        }else{
            System.out.println("请输入大于1 的数");
        }
        return -1;
    }
}





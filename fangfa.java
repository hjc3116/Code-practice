package lydx.bao;

public class fangfa {
    public static void main(String[]args){

        fangfa p1 = new fangfa();
        p1.math();
        p1.math02(10);//调用math02函数，并赋值10给他

        p1.getsum(10,20);//调用setsum函数，同时赋值 num1=10，num2=20;num
        int returnsum = p1.getsum(10,20);//把函数getsum 返回的值，赋给变量returnsum
        System.out.println("返回的值 = " + returnsum);
    }

    public void math() {
        int sum = 0;
        for(int i = 1 ; i <= 1000 ; i ++ ){
            sum += i;
        }
        System.out.println("result = " + sum);
    }

    public void math02(int n){
        //（int n） 接收一个int参数，用户可以输入
        int sum = 0;
        for(int i = 1 ; i <= n ; i ++ ){
            sum += i;
        }
        System.out.println("result02 = " + sum);
    }

    public int getsum(int num1, int num2){
        //可接收多个参数
        int sum = num1 + num2;
        return sum;
    }
}


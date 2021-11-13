package lydx.bao;
/**
 * @author L
 */
class a{
    public static void main(String[] args) {
/**
        fangfa a = new fangfa();
        int[] b = a.getsum1(2, 4);
        System.out.println("差=" + b[1]);
        System.out.println("和=" + b[0]);
*/

/**
        fangfa b1 = new fangfa();//创建新类 不然无法调用class fangfa里的方法
        b1.getmath();
        b1.math02(10);//调用math02函数，并赋值10给他
        b1.getsum(10, 20);//调用setsum函数，同时赋值 num1=10，num2=20;num
        int returnsum = b1.getsum(10, 20);//把函数getsum 返回的值，赋给变量returnsum
        System.out.println("返回的值 = " + returnsum);
*/

/**
        fangfa c = new fangfa();
        boolean d = c.jugment(7);
        System.out.println(d);
        // 或者 直接利用返回的boolean值进行判断
        if (c.jugment(7)) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }
*/

/**
        fangfa e = new fangfa();
        e.print(4,5,'#');
*/

/**
        Person a  = new Person();
        a.name = "hjc";
        a.age = 10;

        fangfa t = new fangfa();
        t.test(a);
        System.out.println("main 的p.age = " + a.age);
*/
        fangfa t = new fangfa();
        int res = t.fbnqs(7);
        System.out.println("res= "+ res);

    }
}






package lydx.bao;

public class animal {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.name = "xiaohua";
        cat1.age = 12;
        cat1.high = 180.4;
        cat1.star="white";
        System.out.println("" + cat1.name + cat1.age + cat1.high + cat1.star);
    }

    static class Cat{
        String name;
        int age;
        double high;
        String star;
    }
}
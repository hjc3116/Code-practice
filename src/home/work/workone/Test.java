package home.work.workone;

public class Test {
  int count = 9;

  public static void main(String[] args) {
    Test p1 = new Test();
    p1.count1();

    Test p2 = new Test();
    p2.count2();
    p2.count2();

  }

  public void count1() {
    count = 10;
    System.out.println(count);
  }

  public void count2() {
    System.out.println(count++);
  }
}
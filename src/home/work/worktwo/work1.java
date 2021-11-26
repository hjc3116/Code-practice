package home.work.worktwo;

public class work1 {
  public static void main(String[] args) {
    Person[] person = new Person[3];
    person[0] = new Person("jack", 24, "worker");
    person[1] = new Person("mali", 34, "homeworker");
    person[2] = new Person("mary", 12, "student");

    for (int i = 0; i < person.length; i++) {
      //打印默认对象的.toString（）
      System.out.println(person[i]);
    }

    //使用冒泡排序
    Person tmp;//临时变量，用于交换
    for (int i = 0; i < person.length - 1; i++) {//外层循环
      for (int j = 0; j < person.length - 1 - i; j++) {//内层循环
        //并按住奥age从大到小 进行排序，如果前面的人的age<后面人的年龄就交换
        if (person[i].getAge() < person[i + 1].getAge()) {
          tmp = person[i];
          person[i] = person[i + 1];
          person[i + 1] = tmp;
        }
      }
    }
    System.out.println("排序后的效果");
    for (int i = 0; i < person.length; i++) {
      System.out.println(person[i]);
    }
  }
}

class Person {
  private String name;
  private int age;
  private String job;

  public Person(String name, int age, String job) {
    this.name = name;
    this.age = age;
    this.job = job;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  //输出person的所有信息
  public String toString() {
    return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", job='" + job + '\'' +
               '}';
  }
}
package home.work.worktwo;

//重写父类Object的equals（）方法，判断测试类中的2个对象是否相等
public class work09 {
  public static void main(String[] args) {
    doctor1 doc01 = new doctor1("jcak", 12, "医生", '男', 20000);
    doctor1 doc02 = new doctor1("jcak", 12, "医生", '男', 20000);

    System.out.println(doc01.equals(doc02));

  }
}
class doctor1 {
  private String name;
  private int age;
  private String job;
  private char gender;
  private double salary;

  public doctor1(String name, int age, String job, char gender, double salary) {
    this.name = name;
    this.age = age;
    this.job = job;
    this.gender = gender;
    this.salary = salary;
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

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
@Override
  public boolean equals(Object obj) {
    //判断两个比较对象是否相同
    if (this == obj){
      return true;
    }
    //判断 obj 是否是doctor类型或其子类
  if(!(obj instanceof doctor1)){
    return false;
  }
  //向下转型,因为obj的运行类型是doctor1或其子类型
  doctor1 doc = (doctor1)obj;
  return this.name.equals(doc.name) && this.age==doc.age&&
             this.gender==doc.gender&&this.job.equals(doc.job)&&
             this.salary== doc.salary;

  }
}

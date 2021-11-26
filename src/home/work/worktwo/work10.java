package home.work.worktwo;

/**
 * @author
 */
//向下，向上转型，综合题
public class work10 {
  public static void main(String[] args) {
    Person_work10[] person = new Person_work10[4];
    person[0] = new Student_work10("jack",14,'男',24);
    person[1] = new Student_work10("smith",16,'女',34);
    person[2]= new Teacher_work10("hjc",24,'男',4);
    person[3]= new Teacher_work10("lxy",32,'女',10);

    //输出信息
    Student_work10 student=new Student_work10("jack",14,'男',24);
    student.printinfo();
    System.out.println("--------------------------------------------");

    Teacher_work10 teacher=new Teacher_work10("hjc",24,'男',4);
    teacher.printinfo();
    System.out.println("--------------------------------------------");

    Student_work10 student1=(Student_work10)person[0];
    ((Student_work10) person[0]).printinfo();

    Teacher_work10 teacher1=(Teacher_work10)person[2];
    ((Teacher_work10) person[2]).printinfo();

    //调用学生和老师 各自特有的方法
    System.out.println("=============================================");
    work10 work10 = new work10();
    work10.choice1(person[2]);
    work10.choice1(person[1]);
    work10.choice1(person[3]);
    work10.choice1(person[0]);
    //化繁为简
    System.out.println("============================================");
    for (int i = 0; i < person.length; i++) {
      work10.choice1(person[i]);

    }


    for (int i = 0; i <person.length ; i++) {
      System.out.println(person[i]);
    }
    //按年龄从大到小排序
    for (int i = 0; i <person.length-1 ; i++) {
      for (int j = 0; j < person.length-1-i;j++){
        Person_work10 tmp;
        if(person[j].getAge()<person[j+1].getAge()){
          tmp = person[j];
          person[j] = person[j+1];
          person[j+1]= tmp;
        }
      }
    }
    System.out.println("\n=================排序后=================");
    for (int i = 0; i <person.length ; i++) {
      System.out.println(person[i]);
    }
  }


  public void choice1(Person_work10 a){
    if(a instanceof Student_work10){
      //向下转型一
      Student_work10 student2=(Student_work10)a;
      student2.study();
    }else if(a instanceof Teacher_work10){
      //向下转型二
      ((Teacher_work10)a).teach();
    }else{
      System.out.println("不做操作");
    }
  }
}

//父类 Person_work10
class Person_work10{
  private String name;
  private int age;
  private char gender;

  public Person_work10(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
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

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  //方法
  public String play(){
    return getName()+"爱玩足球";
  }

  @Override
  public String toString() {
    return "Person_work10{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", gender=" + gender +
               '}';
  }
}

//子类Student_work10
class Student_work10 extends Person_work10{
  private int stu_id;

  public Student_work10(String name, int age, char gender, int stu_id) {
    super(name, age, gender);
    this.stu_id = stu_id;
  }

  public int getStu_id() {
    return stu_id;
  }

  public void setStu_id(int stu_id) {
    this.stu_id = stu_id;
  }
  //方法
  public void study(){
    System.out.println("我会好好学习");
  }
  @Override
  public String play(){
    return getName()+"爱玩足球";
  }

  public void printinfo() {
    System.out.println("姓名："+getName());
    System.out.println("年龄："+getAge());
    System.out.println("学号："+getStu_id());
    System.out.println("性别："+getGender());
    study();
    System.out.println(play());
  }
}
//子类 Teacher_work10
class Teacher_work10 extends Person_work10{
  private int work_age;

  public Teacher_work10(String name, int age, char gender, int work_age) {
    super(name, age, gender);
    this.work_age = work_age;
  }

  public int getWork_age() {
    return work_age;
  }

  public void setWork_age(int work_age) {
    this.work_age = work_age;
  }
  //方法
  public void teach(){
    System.out.println("我会认真教学");
  }
  @Override
  public String play(){
    return getName()+"爱玩象棋";
  }
  public void printinfo() {
    System.out.println("姓名："+getName());
    System.out.println("年龄："+getAge());
    System.out.println("工龄："+getWork_age());
    System.out.println("性别："+getGender());
    teach();
    System.out.println(play());
  }
}

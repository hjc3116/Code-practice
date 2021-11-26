package home.work.worktwo;

/**
 * @author Administrator
 */
public class work02 {
  public static void main(String[] args) {
    Teacher teacher = new Teacher("jack", 20, 3000, "高级", 1.3);
    teacher.introduce();
  }

}

class Teacher {
  private String name;
  private int age;
  private double salary;
  private String post;
  private double grade;

  public Teacher(String name, int age, double salary, String post, double grade) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.post = post;
    this.grade = grade;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void introduce() {
    System.out.println("姓名 " + getName() + "nl " + getAge() + "zw " + getPost() + "xs " + getSalary() + "grade " + grade);
  }
}

class Professor extends Teacher {
  public Professor(String name, int age, double salary, String post, double grade) {
    super(name, age, salary, post, grade);
  }

  @Override
  public void introduce() {
    System.out.println("姓名" + getName() + "nl" + 1.3 * getAge() + "zw" + getPost() + "xs" + getSalary());
  }
}

class FuProfessor extends Teacher {
  public FuProfessor(String name, int age, double salary, String post, double grade) {
    super(name, age, salary, post, grade);
  }

  @Override
  public void introduce() {
    System.out.println("姓名" + getName() + "nl" + 1.2 * getAge() + "zw" + getPost() + "xs" + getSalary());
  }
}

class JProfessor extends Teacher {
  public JProfessor(String name, int age, double salary, String post, double grade) {
    super(name, age, salary, post, grade);
  }

  @Override
  public void introduce() {
    System.out.println("姓名" + getName() + "nl" + 1.1 * getAge() + "zw" + getPost() + "xs" + getSalary());
  }
}


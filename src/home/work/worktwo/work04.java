package home.work.worktwo;


public class work04 {
  public static void main(String[] args) {
    manager employee = new manager("hjc", 300, 27, 1.2);
    employee.setBonus(1000);
    employee.salary_output();

    staff staff = new staff("jack", 100, 20, 1);
    staff.salary_output();
  }
}

class Employee {
  private String name;
  private double salary;
  private int day;
  private double grade;

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public Employee(String name, double salary, int day, double grade) {
    this.name = name;
    this.salary = salary;
    this.day = day;
    this.grade = grade;
  }

  public void salary_output() {
    System.out.println(getName() + "工资" + getGrade() * getDay() * getSalary());
  }
}

class manager extends Employee {
  private double bonus;//奖金不确定 之后用setBonus进行设置

  public manager(String name, double salary, int day, double grade) {
    super(name, salary, day, grade);
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public void salary_output() {
    System.out.println("经理" + getName() + "工资" + (1000 + getGrade() * getDay() * getSalary()));
  }
}

class staff extends Employee {
  public staff(String name, double salary, int day, double grade) {
    super(name, salary, day, grade);
  }

  @Override
  public void salary_output() {
    System.out.print("普通员工");
    //因为和父类方法一样
    super.salary_output();
  }
}
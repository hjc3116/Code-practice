package home.work.worktwo;

public class work08 {
  public static void main(String[] args) {
    label black = new label(3000, 9000, "black");
    System.out.println(black.info());

  }
}
class point{
  private double x;
  private double y;

  public point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

}

class label extends point{
  private String labeledpoint;

  public label(double x, double y, String labeledpoint) {
    super(x, y);
    this.labeledpoint = labeledpoint;
  }

  public String getLabeledpoint() {
    return labeledpoint;
  }

  public void setLabeledpoint(String labeledpoint) {
    this.labeledpoint = labeledpoint;
  }
  public String info() {
    return getX()+","+getY()+","+getLabeledpoint();
  }

}
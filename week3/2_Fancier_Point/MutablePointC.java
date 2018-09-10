// An implementation of the MutablePoint interface.
//
public class MutablePointC implements MutablePoint {

    // These are the instance variables.
    private double x;
    private double y;

    // This is the constructor. 
    public MutablePointC(double x, double y) {
      this.x = x;
      this.y = y;
    }

    // These are the getters. They return the values stored
    // in the member variables, x and y.
    public double getX() { return this.x; }
    public double getY() { return this.y; }

    // These are the setters which must be implemented from MutablePoint.
    // They change the value of the member variables, x and y.
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    // This version of move works by MUTATING the values of the state variables.
    public void move(double dx, double dy) {
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
    }

    // Return true if the two points are equal.
    public boolean equals(Point o) {
      return (this.getX() == o.getX()) && (this.getY() == o.getY());
    }

    // Create a string (x,y) for the point.
    public String toString() { return "(" + this.getX() + ", " + this.getY() + ")"; }

    public static void main(String[] args) {

      // Test out your code.
      MutablePoint p = new MutablePointC(2.0, 3.0);
      System.out.format("p = %s\n", p.toString());
      p.move(.1, .2);
      System.out.format("p = %s\n", p.toString());
    }
}

// An implementation of the ImmutablePoint interface.
//

public class ImmutablePointC implements ImmutablePoint {

    // These are the instance variables.
    private double x;
    private double y;

    // This is the constructor.
    public ImmutablePointC(double x, double y) {
      this.x = x;
      this.y = y;
    }

    // These are the getters.
    public double getX() { return this.x; }
    public double getY() { return this.y; }

    // This version of move works by creating a new Point object.
    // You do not change the values of the instance calling the method.
    public PointC move(double dx, double dy) {
        return new PointC(this.x + dx, this.y + dy);
    }

    // Return true if the two points are equal.
    public boolean equals(Point o) {
      return (this.getX() == o.getX()) && (this.getY() == o.getY());
    }

    // Create a string (x,y) for the point.
    public String toString() { return "(" + this.getX() + ", " + this.getY() + ")"; }

    public static void main(String[] args) {

      // Test out your code!
      ImmutablePoint p = new ImmutablePointC(2.0, 3.0);
      Point q = p.move(.1, .2);
      System.out.format("p = %s\n", p.toString());
      System.out.format("q = %s\n", q.toString());
    }
}

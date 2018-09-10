// An implementation of the Point interface.
//
public class PointC implements Point {

    // These are called "instance variables".
    // The can also be called "member variables" or "fields".
    // They record the state of the object, which in this case
    // represents a point, with an x and a y coordinate.
    private double x;
    private double y;

    // This is the constructor. When you create a PointC object,
    // you will call this with an x and y argument, and it will
    // initialize the values of the member variables, above.
    public PointC(double x, double y) {
      this.x = x;
      this.y = y;
    }

    // These are the getters. They return the values stored
    // in the member variables, x and y. We use getters in
    // order to abide by the principle of encapsulation.
    public double getX() { return this.x; }
    public double getY() { return this.y; }


    // Return true if the two points are equal.
    public boolean equals(Point o) {
      return (this.getX() == o.getX()) && (this.getY() == o.getY());
    }

    // Create a string (x,y) for the point.
    public String toString() { return "(" + this.getX() + ", " + this.getY() + ")"; }

    public static void main(String[] args) {

      // Test out your code!
      Point p = new PointC(2.0, 3.0);
      System.out.format("p = %s\n", p.toString());
      Point p2 = new PointC(4.0, 1.0);
      if (p.equals(p2)) {
        System.out.println("p and p2 are the same.");
      } else {
        System.out.println("p and p2 are not the same");
      }

    }
}

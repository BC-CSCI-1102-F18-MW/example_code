// An implementation of the Point interface with comparable
//
public class PointC implements Point {

    // Instance variables
    private double x;
    private double y;

    // Constructor
    public PointC(double x, double y) {
      this.x = x;
      this.y = y;
    }

    // Getters
    public double getX() { return this.x; }
    public double getY() { return this.y; }


    // Return true if they two points are equal.
    public boolean equals(Point o) {
      return (this.getX() == o.getX()) && (this.getY() == o.getY());
    }

    // Create a string (x,y) for the point.
    public String toString() { return "(" + this.getX() + ", " + this.getY() + ")"; }


    // Calculate the distance between a point and the origin.
    public double distance() {
        double x = this.getX();
        double y = this.getY();
        return Math.sqrt(x * x + y * y);
    }

    // Implement your compareTo() method from the Comparable interface.
    // Here we'll say that a point is "bigger" if it's farther away from the origin.
    public int compareTo(Point other) {
	double difference = this.distance() - other.distance();
	if (difference > 0) {
	    return 1;
	} else if (difference < 0) {
	    return -1;
	} else {
	    return 0;
	}
    }

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
      
      int result = p.compareTo(p2);
      if (result == 1) {
	  System.out.println(p.toString() + " is farther away than " + p2.toString());
      } else if (result == -1) {
	  System.out.println(p2.toString() + " is farther away than " + p.toString());
      } else {
	  System.out.println(p2.toString() + " and " + p.toString() + " are equally far away");
      }
    }
}

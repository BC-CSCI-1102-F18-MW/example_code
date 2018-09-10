public class DemoVariablesMeasures {

  // instance (member) variables
  double length;
  double width;

  // static variables
  static double inchesInAFoot = 12.0;

  public DemoVariablesMeasures(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getLength() { return this.length; }
  double getWidth() { return this.width; }

  // This method contains local variables f and convertedF
  public static double convertToFeet(double f) {
      double convertedF = f / inchesInAFoot;
      return convertedF;
  }

  public static void main (String[] args) {
      DemoVariablesMeasures dvm = new DemoVariablesMeasures(81, 23);
      System.out.println("Your object is " + dvm.getLength() + " inches in length.");
      System.out.println("That is " + convertToFeet(dvm.getLength()) + " feet in length.");

  }
}

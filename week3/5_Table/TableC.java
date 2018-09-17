public class TableC implements Table {

  // instance variables
  double height;
  String material;
  int numLegs;

  // constructor
  TableC (double height, String material, int numLegs) {
    this.height = height;
    this.material = material;
    this.numLegs = numLegs;
  }

  public double getHeight() {
    return this.height;
  }
  public String getMaterial() {
    return this.material;
  }
  public int getNumLegs() {
    return this.numLegs;
  }

  public boolean isItTooTall(double personHeight) {
    if (personHeight < this.getHeight()) {
      return true;
    } else {
      return false;
    }
  }

  public static void main (String[] args) {
    TableC t = new TableC(32.5, "wood", 4);
    if (t.isItTooTall(31.5)) {
      System.out.println("Too tall!");
    }
    System.out.println(t);
  }
}

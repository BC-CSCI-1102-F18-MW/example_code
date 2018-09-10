public class ApplePie implements Dessert {

  // Here are the implementations of the three
  // methods from the Dessert interface.
  public boolean sweet(){
    return true;
  }

  public String smells() {
    return "Delicious!";
  }

  public int calories(){
    return 400;
  }

  // Here is a main function that calls the three methods.
  public static void main (String[] args) {
    ApplePie ap = new ApplePie();

    if (ap.sweet() == true) {
      System.out.println("This is sweeeeeet!");
    } else {
      System.out.println("This is savory.");
    }

    System.out.format("Apple Pie has %d calories\n", ap.calories());
    System.out.format("Apple Pie smells %s\n", ap.smells());

  }
}

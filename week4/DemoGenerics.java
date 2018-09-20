import java.util.ArrayList;

public class DemoGenerics {
  public static void main (String[] args) {


    ArrayList<String> places = new ArrayList<String>();
    places.add("Brighton");
    places.add("Allston");
    places.add("Chestnut Hill");
    for (String p : places) {
      System.out.println("I used to live in " + p);
    }

    ArrayList<Integer> someints = new ArrayList<Integer>();
    someints.add(5);              // autobox int -> Integer
    int q = someints.get(0) + 5;  // unbox Integer -> int
  }

}

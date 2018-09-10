import edu.princeton.cs.algs4.StdIn;

// Class demonsrtating control structures in Java

public class DemoControl {
  public static void main (String[] args) {

    // EXAMPLE FOR LOOPS
    System.out.println("FOR LOOPS");

    // starting at 0
    for (int i = 0; i <= 5; i++) {
      System.out.format("iteration number %d\n", i);
    }

    // starting at 5 and incrementing by 2
    System.out.println();
    for (int i = 5; i <= 10; i+=2) {
      System.out.format("iteration number %d\n", i);
    }
    System.out.println();
    System.out.println();

    // EXAMPLE WHILE LOOP
    System.out.println("WHILE LOOP");

    // find the first "t" in a String
    String s = "September";
    String[] letters = s.split("");
    int f = 0;
    while (!letters[f].equals("t")) {
      f++;
    }
    System.out.println("Found a t at index " + f);
    System.out.println();

    // EXAMPLE DO-WHILE LOOPS

    // get user input while user types C
    String userinput = "";
    do {
      System.out.println("Type C to continue");
      userinput = StdIn.readString();
    } while (userinput.equals("C"));


    // EXAMPLE IF/ELSE STATEMENT
    System.out.println("IF ELSE");
    int a = 5;
    int b = Integer.parseInt(args[0]);

    if (a == b) {
      System.out.println("a and b are equal!");
    } else if (a > b) {
      System.out.println("a is bigger than b");
    } else {
      System.out.println("b is bigger than a");
    }

    // EXAMPLE SWITCH STATEMENT
    System.out.println("Enter your favorite animal:");
    String animal = StdIn.readString();
    switch(animal) {
      case "dog":
        System.out.println("Woof");
        break;
      case "cat":
        System.out.println("Meow");
        break;
      case "parrot":
        System.out.println("Polly want a cracker");
        break;
      default:
        System.out.println("Squeak");
      }




  }
}

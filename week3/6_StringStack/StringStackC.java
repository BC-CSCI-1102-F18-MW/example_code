import java.util.*;
import edu.princeton.cs.algs4.StdIn;

public class StringStackC implements StringStack {

  // static variable setting max size of stack
  private static final int CAPACITY = 1000;

  // Instance variables.
  private int N;                // The number of Strings in the stack.
  private String[] theStack;

  // A constructor.
  StringStackC() {
    this.N = 0;
    this.theStack = new String[CAPACITY];
  }

  // push
  public void push(String item) {
    this.theStack[this.N] = item;
    this.N++;
  }

  // pop
  public String pop() {
    String s = this.theStack[this.N-1];
    this.N--;
    return s;
  }

  // peek
  public String peek() {
    return "foo";
  }

  // isEmpty
  public boolean isEmpty() {
    return true;
  }

  // toString
  public String toString() {
    return "My stack!";
  }

  // main
  public static void main(String[] args) {

    StringStackC mystack = new StringStackC();
    mystack.push("dog");
    mystack.push("cat");
    System.out.println(mystack.pop());
    // Unit test. Reads strings from stdin then prints them
    // in reverse order.
    //
    /*StringStack ss = new StringStackC();

    while(!StdIn.isEmpty()) {
      String name = StdIn.readString();
      ss.push(name);
    }
    while(!ss.isEmpty()) {
      String name = ss.pop();
      System.out.println(name);
    }*/
  }
}

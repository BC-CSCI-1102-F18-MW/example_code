import java.util.*;
import edu.princeton.cs.algs4.StdIn;

public class StringStackC implements StringStack {

  // Class (static) variable
  // Tells us the maximum capacity of a stack.
  private static final int CAPACITY = 1000;

  // Instance variables.
  //
  private int N;                // The number of Strings in the stack.
  private String[] theStack;    // The array that stores the strings.

  // A constructor.
  //
  public StringStackC() {
    this.N = 0;
    this.theStack = new String[CAPACITY];
  }

  // push: add an element to the top of the stack
  public void push(String item) {

    // check to make sure you don't exceed the capacity
    if (this.N == CAPACITY)
      throw new RuntimeException("Stack Overflow.");
    else
      this.theStack[this.N++] = item; // N++ says: "use the current value, then add 1"
  }

  // pop: take the element off the top of the stack
  public String pop() {

    // Make sure the stack is not empty
    if (this.isEmpty())
      throw new NoSuchElementException("Stack Underflow.");
    else {
      // N-1 is the index for the element at the top of the stack
      // --N says "decrement N by one then use its value"
      String item = this.theStack[--this.N];

      // Don't forget to set the element you just removed to null
      this.theStack[this.N] = null;
      return item;
    }
  }

  // peek: look at top element, but don't remove it
  public String peek() {

    // Make sure the stack is not empty.
    if (this.isEmpty())
      throw new java.util.NoSuchElementException("Stack Underflow.");
    else
      return this.theStack[this.N - 1]; // don't decrement N this time!!
  }

  // isEmpty()
  public boolean isEmpty() { return this.N == 0; }

  // toString() here uses helpful StringBuilder class
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for(int i = this.N - 1; i >= 0; i--)
      sb.append(this.theStack[i].toString() + "\n");

    return sb.toString();
  }

  public static void main(String[] args) {

    // Unit test. Reads strings from stdin then prints them
    // in reverse order.
    //
    StringStack ss = new StringStackC();

    while(!StdIn.isEmpty()) {
      String name = StdIn.readString();
      ss.push(name);
    }
    while(!ss.isEmpty()) {
      String name = ss.pop();
      System.out.println(name);
    }
  }
}

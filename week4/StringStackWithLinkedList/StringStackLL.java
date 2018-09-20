public class StringStackLL implements StringStack {

  // Instance variables for a linked list stack.
  // The top of the stack (most recently added node)
  // is pointed at by first.
  Node first;
  int n;

  // Inner class for Node
  private class Node {
    String item;
    Node next;
  }

  // push: add element to beginning of LL
  public void push(String s) {
    Node oldfirst = first;
    first = new Node();
    first.item = s;
    first.next = oldfirst;
    n++;
  }

  // pop: remove element from beginning of LL
  public String pop() {
    String top = first.item;
    first = first.next;
    n--;
    return top;
  }

  // peel: look at element at beginning of LL
  public String peek() {
      return first.item;
  }

  // print out the sequence from bottom to top
  public String toString() {
    String s = "";
    for (Node x = first; x != null; x = x.next) {
      s = x.item + " " + s;
    }
    return s;
  }

  // is stack empty?
  public boolean isEmpty() {
    return (n == 0);
  }

  // return stack size
  public int getSize() {
    return n;
  }


  public static void main (String[] args) {
    StringStackLL ssll = new StringStackLL();

    ssll.push("(");
    System.out.println(ssll.peek());
    ssll.push("2");
    ssll.push("+");
    ssll.push("7");
    ssll.push(")");

    System.out.println(ssll.toString());
    System.out.println(ssll.getSize());

  }

}

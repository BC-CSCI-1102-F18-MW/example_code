/*************************************************************************
 *  Compilation:  javac ResizingArrayStack.java
 *  Execution:    java ResizingArrayStack < input.txt
 *  Data files:   http://algs4.cs.princeton.edu/13stacks/tobe.txt
 *
 *  Stack implementation with a resizing array.
 *  Modified to suppress warnings and make less confusing.
 *
 *************************************************************************/

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  The <tt>ResizingArrayStack</tt> class represents a last-in-first-out (LIFO) stack
 *  of generic items.
 *  It supports the usual <em>push</em> and <em>pop</em> operations, along with methods
 *  for peeking at the top item, testing if the stack is empty, and returning the size.
 *  <p>
 *  This implementation uses a resizing array, which double the underlying array
 *  when it is full and halves the underlying array when it is one-quarter full.
 *  The <em>push</em> and <em>pop</em> operations take constant amortized time.
 *  The <em>size</em>, <em>peek</em>, and <em>is-empty</em> operations takes
 *  constant time in the worst case.
 *  <p>
 *  For additional documentation, see <a href="/algs4/13stacks">Section 1.3</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class ResizingArrayStack<Item> implements Stack<Item> {
    private Item[] a;         // array of items
    private int N;            // number of elements on stack


    /**
     * Initializes an empty stack.
     */
    public ResizingArrayStack() {

      @SuppressWarnings("unchecked")
      Item[] temp = (Item[]) new Object[2];
      a = temp;
    }

    /**
     * Is this stack empty?
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * Returns the number of items in the stack.
     */
    public int size() { return N; }


    // resize the underlying array holding the elements
    private void resize(int capacity) {
      assert capacity >= N;
      @SuppressWarnings("unchecked")
      Item[] temp = (Item[]) new Object[capacity];
      for (int i = 0; i < N; i++) {
        temp[i] = a[i];
      }
      a = temp;
  }

    /**
     * Adds the item to this stack.
     * @param item the item to add
     */
    public void push(Item item) {
        if (N == a.length) resize(2*a.length);    // double size of array if necessary
        a[N++] = item;                            // add item
    }

    /**
     * Removes and returns the item most recently added to this stack.
     * @return the item most recently added
     * @throws java.util.NoSuchElementException if this stack is empty
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = a[N-1];
        a[N-1] = null;                              // to avoid loitering
        N--;
        // shrink size of array if necessary
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }


    /**
     * Returns (but does not remove) the item most recently added to this stack.
     * @return the item most recently added to this stack
     * @throws java.util.NoSuchElementException if this stack is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return a[N-1];
    }



    /**
     * Unit tests the <tt>Stack</tt> data type.
     */
    public static void main(String[] args) {
        Stack<String> s = new ResizingArrayStack<String>();
        s.push("strawberries");
        s.push("blueberries");
        s.push("elderberries");
        s.push("cloudberries");
        System.out.println("The length of this stack is " + s.size());
        System.out.println("The top of the stack is " + s.peek());
        System.out.println("The whole LIFO stack is as follows:");
        while (!s.isEmpty()) {
          System.out.println(s.pop());
        }

    }
}

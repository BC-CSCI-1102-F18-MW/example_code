import java.util.*;

public class QueueDoubleLL<Item> implements Queue<Item> {

  // Member variables for the QueueLL Class
  // These are what makes your linked list.
  Node first;  // points at first node
  Node last;   // points at last node
  int n;          // size of LL

  // Inner class definition of Node
  class Node {
    // Node member variables.
    // Remember: for a doubly-linked list we need *two*
    // pointers: one for next and one for prev.
    Item info;
    Node next;   // pointer to next node
    Node prev;   // pointer to previous node

    // Node constructor
    // This lets us create a note with a value for info.
    Node(Item info, Node next, Node prev) {
      this.info = info;
      this.next = next;
      this.prev = prev;
    }
  }

  // Constructor for QueueDoubleLL class to initialize the queue.
  QueueDoubleLL() {
    this.first = null;
    this.last = null;
    this.n = 0;
  }

  // Methods from Queue interface

  // Put something at the end of the Queue
  public void enqueue (Item item) {

    // create a new node for the incoming info
    Node newlast = new Node(item, null, null);

    // If last is pointing at nothing...
    // ... in other words, if the queue is empty...
    // make first point at the new node you created
    if (last == null) {
      first = newlast;
    }

    // otherwise...
    else {
      // your original last.next needs to point to newlast
      // your newlast.prev needs to point to the original last
      newlast.prev = last;
      last.next = newlast;
    }

    // And in all cases, last needs to point to newlast
    last = newlast;
    n++;  // don't forget to increase the size of the queue by 1
  }


  // remove from front of queue
  public Item dequeue() {

    // If the queue is empty, just throw an exception
    if (size() == 0) {
      throw new NoSuchElementException("Empty queue");
    }

    // You are returning whatever is in the Item field.
    Item toreturn = first.info;

    // Now you need to actually remove the first Node.
    // Just make first point to the second node.
    first = first.next;

    // If first is still pointing at something (i.e., the list is not empty)
    // make sure its prev isn't pointing at something.
    // prev should be null on the first node.
    if (first != null) {
      first.prev = null;
    }

    // Now, perhaps when you did this, there was no second node.
    // In that case, you need to worry about last, which would have
    // been pointing to the node you just deleted. It needs to
    // point instead to null, since you have and empty list.

    if (first == null) {
      last = null;
    }
    n--;
    return toreturn;
  }

  public int size() {
    return n;
  }
  public boolean isEmpty() {
    return (n==0);
  }

  // test you code in the main()
  public static void main(String[] args) {

      Queue<String> myq = new QueueDoubleLL<String>();

      myq.enqueue("California");
      myq.enqueue("Arizona");
      myq.enqueue("Nevada");

      System.out.println("The queue is length: " + myq.size());
      while (!myq.isEmpty()) {
        System.out.format("dequeuing %s\n", myq.dequeue());
      }
      System.out.println("The queue is now length: " + myq.size());

  }

}

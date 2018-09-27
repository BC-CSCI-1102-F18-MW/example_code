import java.util.*;  // importing this so we can throw some exceptions

public class QueueSingleLL<Item> implements Queue<Item> {

  // Member variables for the QueueLL Class
  // These are what makes your linked list.
  Node first;     // points at first node
  Node last;      // points at last node
  int n;          // size of LL

  // Inner class definition of Node
  class Node {

    // Node member variables.
    Item info;
    Node next;   // pointer to next node

    // Node constructor.
    // This lets us create a Node with a value and pointers.
    Node(Item info, Node next) {
      this.info = info;
      this.next = next;
    }
  }

  // Constructor for QueueLL class.
  // Set member variables to null or 0.
  public QueueSingleLL() {
    this.first = null;
    this.last = null;
    this.n = 0;
  }

  // Methods from Queue interface

  // Put something at the end of the Queue
  public void enqueue (Item item) {

    // Create a new node for the incoming info.
    Node newlast = new Node(item, null);

    // If last is pointing at nothing, your list is currently empty.
    // Make first point at the new node, since there will be only one node.
    // You'll make last point at this node, too, but outside the if logic.
    if (last == null) {
      first = newlast;
    }

    // If last is not null, this means that you don't have an empty list.
    // In this case, your last.next needs to point to newlast
    else {
      last.next = newlast;
    }

    // And in all cases, last needs to point to newlast
    last = newlast;
    n++;  // don't forget to increase the size of the queue by 1
  }


  // remove from front of queue
  public Item dequeue() {

    // If the queue is empty, just throw an exception.
    if (size() == 0) {
      throw new NoSuchElementException("Empty queue");
    }

    // Remember that you are returning whatever is in the Item field
    Item toreturn = first.info;

    // Now you need to actually remove the first Node.
    // Make first point to the second node.
    first = first.next;

    // Now perhaps when you did this, there was no second node.
    // i.e., perhaps first.next was null.
    // In that case, you need to worry about last, which would have
    // been pointing to the node you just deleted.
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

  // This method demonstrates how you can proceed through a linked list.
  // You would want to use something similar to this to insert or remove
  // a node from the middle of a linked list.
  public boolean findItem (Item item) {
      for (Node x = first; x != null; x = x.next) {
	       if (x.info.equals(item)) {
            return true;
	         }
      }
      return false;
  }

  // Finally, a main method showing how it all works.
  public static void main(String[] args) {

      // Create your linked list queue.
      // I am not using the interface name here because
      // I created a new method (findItem) that's not in the interface.
      QueueSingleLL<String> myq = new QueueSingleLL<String>();

      // Add some items to the queue.
      myq.enqueue("California");
      myq.enqueue("Arizona");
      myq.enqueue("Nevada");

      // Look for "Arizona"!
      if (myq.findItem("Arizona")) {
	       System.out.println("Found Arizona!");
      }

      // Print out the queue by dequeuing everything.
      while (!myq.isEmpty()) {
        System.out.format("%s\n", myq.dequeue());
      }

  }

}

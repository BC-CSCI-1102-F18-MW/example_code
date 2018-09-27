import java.util.*;

public class QueueFixedArray<Item> implements Queue<Item> {
  // static variables
  int CAPACITY = 10;

  // instance variables
  Item[] storage;
  int size;

  // constructor
  public QueueFixedArray () {
    // You want to create an array, but you aren't allowed to
    // create an array of a generic type, so this is a way around that.
    // Create an array of Object size 1 that you then cast to Item
    @SuppressWarnings("unchecked")
    Item[] temp = (Item[]) new Object[CAPACITY];
    this.storage = temp;
    this.size = 0;
  }

  // Interface methods
  // add to end: easy
  public void enqueue (Item item) {
    if (size == CAPACITY) {
      throw new RuntimeException("Stack Overflow.");
    }

    // Easy: add the item to the next available place.
    storage[size] = item;
    size++;

  }

  // remove from beginning: more complicated
  public Item dequeue() {
    if (isEmpty()) {
      throw new NoSuchElementException("Stack Underflow.");
    }
    // It gets ugly here because you need to create new array
    // that does not include the first element and starts
    // at the second element.
    Item toreturn = storage[0]; // save out the item you'll return

    // trick to let you create an array of a reference type
    @SuppressWarnings("unchecked")
    Item[] temp = (Item[]) new Object[CAPACITY];

    // Starting from the second element of your storage array,
    // copy each item over to the new temp array.
    for (int i = 1; i < size; i++) {
      temp[i-1] = storage[i];
    }

    // Decrement size.
    size--;

    // Make your storage instance variable point at temp.
    storage = temp;
    return toreturn;

  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return (size ==0);
  }

  // Main for testing.
  public static void main (String[] args) {
    QueueFixedArray<String> myq = new QueueFixedArray<String>();
    myq.enqueue("dog");
    myq.enqueue("table");
    myq.enqueue("coffee");
    System.out.println("The queue now has size " + myq.size());
    while (!myq.isEmpty()) {
      System.out.println(myq.dequeue());
    }
    System.out.println("The queue now has size " + myq.size());
  }
}

public class FancyQueueDoubleLL<Item> extends QueueDoubleLL<Item> {

  // This removes an element from a doubly-linked list
  public boolean removeNode (Item searchfor){

    // If you have an empty Queue, just return false.
    if (size()==0) {
      return false;
    }

    // If the first item matches, then just call dequeue()
    if (first.info.equals(searchfor)) {
      dequeue();
      return true;
    }

    // Otherwise, start to look at each of the nodes.
    // Create a Node that points at first, and then move
    // it along the linked list.
    for (Node search = first; search != null; search = search.next) {

      // if you find the item you're interested in at the current node
      if (search.info.equals(searchfor)) {

        // make the next Node's prev pointer point at the previous node
        if (search.next != null) {
          search.next.prev = search.prev;
        }

        // make the previous Node's next pointer point at the following node
        if (search.prev != null) {
          search.prev.next = search.next;
        }

        // Don't forget to decrease the length of the queue by 1
        n--;

        // Return true, meaning that the Node was removed
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

      FancyQueueDoubleLL<String> myq = new FancyQueueDoubleLL<String>();

      myq.enqueue("California");
      myq.enqueue("Arizona");
      myq.enqueue("Nevada");
      System.out.println("The queue is length: " + myq.size());

      System.out.println("Trying to remove New York");
      if (myq.removeNode("New York")) {
        System.out.println("Success!");
      }
      System.out.println("The queue is length: " + myq.size());


      System.out.println("Trying to remove California");
      if (myq.removeNode("California")) {
        System.out.println("Success!");
      }
      System.out.println("The queue is length: " + myq.size());


      System.out.println("Trying to remove Nevada");
      if (myq.removeNode("Nevada")) {
        System.out.println("Success!");
      }
      System.out.println("The queue is length: " + myq.size());

      System.out.println("Trying to remove Arizona");
      if (myq.removeNode("Arizona")) {
        System.out.println("Success!");
      }
      System.out.println("The queue is length: " + myq.size());

      System.out.println("Trying to remove Vermont");
      if (myq.removeNode("Vermont")) {
        System.out.println("Success!");
      }
      System.out.println("The queue is length: " + myq.size());


  }
}

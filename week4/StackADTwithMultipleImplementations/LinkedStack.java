// Linked list implementation of generic Stack interface

import java.util.*;

public class LinkedStack<T> implements Stack<T> {

  // instance variables
  private Node<T> top;  // same as what we've been calling first
  private int n;        // size of stack

  // inner class for Node
  private class Node<T> {
    T info;           // same as what we've been calling item
    Node<T> next;

    // constructor for Node
    private Node(T info, Node<T> next) {
      this.info = info;
      this.next = next;
    }
  }

  // constructor for this class
  public LinkedStack() {

    this.top = null;
    this.n = 0;
  }

  // is stack empty?
  public boolean isEmpty() { return this.n == 0; }

  // return stack size
  public int size() { return this.n; }

  // push = add Node to front of LL
  public void push(T item) {
    this.top = new Node<T>(item, this.top);
    this.n++;
  }

  // pop = remove Node at front of LL
  public T pop() {

    if(this.isEmpty())
      throw new NoSuchElementException("pop: Stack Underflow");

    T item = this.top.info;
    this.n--;
    this.top = this.top.next;
    return item;
    }

  // peek = look at info in Node at front of LL
  public T peek() { return this.top.info; }

  // Returh string representation of stack
  public String toString() {

    StringBuilder sb = new StringBuilder();
    Node current = top;
    while (current != null) {
      sb.append(current.info + " ");
      current = current.next;
    }
    return sb.toString();
  }

  // main with unit tests
  public static void main(String[] args) {

    Stack<Integer> is = new LinkedStack<Integer>();

    is.push(343);
    is.push(686);
    System.out.format("stack = %s\n", is.toString());
  }
}

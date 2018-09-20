// An API for a Stack of any type, T
//
public interface Stack<T> {

  void push(T s);
  T pop();
  T peek();
  boolean isEmpty();
  int size();
  String toString();
}

// Implementation of the Point interface

interface Point {

  // These are the getters.
  // They will return member variables that
  // representing the x and y coordinates of
  // the point. Those will be defined in the
  // implementation of the interface.
  public double getX();
  public double getY();

  // These are the other methods that must be
  // implemented for any class that implements
  // this interface.
  public boolean equals(Object other);
  public String toString();

}

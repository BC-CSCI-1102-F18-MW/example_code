// Interface for a MutablePoint data type

// This interface extends the Point interface.
// You only need to list methods here that are
// not already in the Point interface.

// When you implement this interface you have to
// implement everything here *and* everything in
// the interface it extends, Point.

interface MutablePoint extends Point{

  // These are the setters.
  // They let you change the member variables.
  public void setX(double x);
  public void setY(double y);

  // These are the other methods that must be
  // implemented for any class that implements
  // this interface (in addition to the ones in Point).
  public void move(double dx, double dy);



}

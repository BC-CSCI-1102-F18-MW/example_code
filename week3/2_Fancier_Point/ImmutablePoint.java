// Interface for an ImmutablePoint data type

interface ImmutablePoint extends Point {

  // This interface extends the Point interface.
  // You only need to list methods here that are
  // not already in the Point interface.

  // When you implement this interface you have to
  // implement everything here *and* everything in
  // the interface it extends, Point.

  // These only method you need to list here is move.
  // You don't need setters because you are going to
  // create a new Point when you call move.
  public Point move(double dx, double dy);


}

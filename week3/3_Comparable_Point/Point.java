// Point interface that extends Comparable

public interface Point extends Comparable<Point>  {

  public double getX();
  public double getY();

  public boolean equals(Object other);
  public String toString();

  // New method not in last Point interface for
  // calculating distance to the origin.
  public double distance();

}



// Ex. 0.11.
// A copy of this file is in XYPoints10.java


// Determine if a point is inside a squre
// with the lower left corner at the origin.

class XYPoint {

    double x;
    double y;

    public boolean isWithin (int side)
    {
	return
	    x <= side && x >= 0 &&
	    y <= side && y >= 0;
    }
}

public class XYPoints10 {

    public static void main (String[] argv)
    {
	XYPoint p = new XYPoint ();
	p.x = 2; p.y = 3;
	boolean yes = p.isWithin (5); // 5 is the square's side
	System.out.println (yes);

	XYPoint q = new XYPoint ();
	q.x = 5; q.y = 7;
	yes = q.isWithin (5); // 5 is the square's side
	System.out.println (yes);
	
    }

}

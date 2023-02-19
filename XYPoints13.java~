class XYPoint {
    double x;
    double y;
}

class XYLine {

    XYPoint start;
    XYPoint end;

    public void printSlope ()
    {
	double s = (end.y - start.y) / (end.x - start.x);
	System.out.println ("Slope = " + s);
    }
}

public class XYPoints12 {

    public static void main (String[] argv)
    {
	XYPoint p = new XYPoint ();
	p.x = 2; p.y = 3;

	XYPoint q = new XYPoint ();
	q.x = 5; q.y = 7;

	XYLine L = new XYLine ();
	L.start = p;
	L.end = q;
	L.printSlope ();
    }
}

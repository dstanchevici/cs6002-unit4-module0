class XYPoint {
    double x;
    double y;
    XYPoint point;
}

public class XYPoints15 {

    public static void main (String[] argv)
    {
	XYPoint p = new XYPoint ();
	p.x = 2; p.y = 3;

	p.point = new XYPoint ();
	p.point.x = 5;
	p.point.y = 7;

	p.point.point = new XYPoint ();
	p.point.point.x = 3;
	p.point.point.y = 8;

	XYPoint q = p;
	System.out.println (q.x);

	q = q.point;
	System.out.println (q.x);

	q = q.point;
	System.out.println (q.x);

	q = q.point;
	System.out.println (q);

    }
}

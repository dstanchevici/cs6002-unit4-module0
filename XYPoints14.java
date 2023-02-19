class XYPoint {
    double x;
    double y;
    XYPoint point;
}

public class XYPoints14 {

    public static void main (String[] argv)
    {
	XYPoint p = new XYPoint ();
	p.x = 2; p.y = 3;

	p.point = new XYPoint ();
	p.point.x = 5;
	p.point.y = 7;
    }
}

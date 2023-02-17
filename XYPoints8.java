class XYPoint {

    double x;
    double y;
    double d;
}

public class XYPoints8 {

    public static void main (String[] argv)
    {
	XYPoint p = new XYPoint ();
	p.x = 2; p.y = 3;

	XYPoint q = new XYPoint ();
	q.x = 5; q.y = 7;

	p.d = Math.sqrt (p.x*p.x + p.y*p.y);
	System.out.println (p.d);

	q.d = Math.sqrt (q.x*q.x + q.y*q.y);
	System.out.println (q.d);
	
    }

}

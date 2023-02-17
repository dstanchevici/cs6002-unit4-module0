import java.util.*;

public class XYPoints4 {

    public static void main (String[] argv)
    {
	double[] x = {2, 5, 5};
	double[] y = {3, 7, 3};

	double[] d = distance (x,y);
	System.out.println (Arrays.toString(d));
    }

    static double[] distance (double[] a, double[] b)
    {
	double[] c = new double [a.length];
	for (int i=0; i<a.length; i++) {
	    c[i] = Math.sqrt (a[i]*a[i] + b[i]*b[i]);
	}
	return c;
    }

}


class Famous3Initials {

    char first, second, third;
    int birthYear;
    Famous3Initials point;

    public void print ()
    {
	System.out.println ("" + first + second + third + ", born " + birthYear);
    }

}


public class AnotherExample3 {

    public static void main (String[] argv)
    {
	Famous3Initials f = new Famous3Initials ();
	f.first = 'J';
	f.second = 'F';
	f.third = 'K';
	f.birthYear = 1917;
	f.print ();
	System.out.println ("------");

	// ADD YOUR CODE HERE to create the 3 additional objects.
	f.point = new Famous3Initials ();
	f.point.first = 'F';
	f.point.second = 'D';
	f.point.third = 'R';
	f.point.birthYear = 1882;

	f.point.point = new Famous3Initials ();
	f.point.point.first = 'L';
	f.point.point.second = 'B';
	f.point.point.third = 'J';
	f.point.point.birthYear = 1908;

	f.point.point.point = new Famous3Initials ();
	f.point.point.point.first = 'M';
	f.point.point.point.second = 'L';
	f.point.point.point.third = 'K';
	f.point.point.point.birthYear = 1929;
	
	Famous3Initials p = f; // 1.

	while (p != null) {
	    p.print();
	    p = p.point;
	}	
    }

}

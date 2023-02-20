
class Famous3Initials {

    char[] initials = new char [3];
    int birthYear;
    Famous3Initials point;

    public void print ()
    {
	String s = "";
	for (char c: initials) s += c;
	System.out.println (s + ", born " + birthYear);
    }

}


public class AnotherExample4 {

    public static void main (String[] argv)
    {
	Famous3Initials f = new Famous3Initials ();
	f.initials[0] = 'J';
	f.initials[1] = 'F';
	f.initials[2] = 'K';
	f.birthYear = 1917;
	f.print ();

	f.point = new Famous3Initials ();
	f.point.initials[0] = 'F';
	f.point.initials[1] = 'D';
	f.point.initials[2] = 'R';
	f.point.birthYear = 1882;

	f.point.point = new Famous3Initials ();
	f.point.point.initials[0] = 'L';
	f.point.point.initials[1] = 'B';
	f.point.point.initials[2] = 'J';
	f.point.point.birthYear = 1908;

	f.point.point.point = new Famous3Initials ();
	f.point.point.point.initials[0] = 'M';
	f.point.point.point.initials[1] = 'L';
	f.point.point.point.initials[2] = 'K';
	f.point.point.point.birthYear = 1929;
	
    }

}

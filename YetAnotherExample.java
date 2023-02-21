// Unit 4, Module 0, Ex. 28

class Thing {
    int data;
    Thing nextThing;
}

public class YetAnotherExample {

    public static void main (String[] argv)
    {
	Thing first = new Thing ();
	first.data = 1;

	Thing last = first;

	for (int i=2; i<=5; i++) {
	    last = addSomeThing (last, i);
	}

	Thing p = first;
	while (p != null) {
	    System.out.println (p.data);
	    System.out.println ("Thing's link to nextThing=" +p.nextThing + "\n");
	    p = p.nextThing;
	}
    }

    static Thing addSomeThing (Thing t, int x)
    {
	Thing n = new Thing ();
	n.data = x;
	t.nextThing = n;
	return n;
    }
}

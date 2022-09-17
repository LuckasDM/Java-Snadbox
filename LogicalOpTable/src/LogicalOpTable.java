// This is 2-2 a truth table for logical operators.

public class LogicalOpTable {

	public static int booleanToInt(boolean value) {
        // Convert true to 1 and false to 0.
        return value ? 1 : 0;
    }
	
	public static void main(String[] args) {
		
		boolean p,q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		System.out.print(booleanToInt(p) + "\t" + booleanToInt(q) + "\t");
		System.out.print(booleanToInt(p&q) + "\t" + booleanToInt(p|q) + "\t");
		System.out.println(booleanToInt(p^q) + "\t" + booleanToInt(!p));
		
		p = true; q = false;
		System.out.print(booleanToInt(p) + "\t" + booleanToInt(q) + "\t");
		System.out.print(booleanToInt(p&q) + "\t" + booleanToInt(p|q) + "\t");
		System.out.println(booleanToInt(p^q) + "\t" + booleanToInt(!p));
		
		p = false; q = true;
		System.out.print(booleanToInt(p) + "\t" + booleanToInt(q) + "\t");
		System.out.print(booleanToInt(p&q) + "\t" + booleanToInt(p|q) + "\t");
		System.out.println(booleanToInt(p^q) + "\t" + booleanToInt(!p));
		
		p = false; q = false;
		System.out.print(booleanToInt(p) + "\t" + booleanToInt(q) + "\t");
		System.out.print(booleanToInt(p&q) + "\t" + booleanToInt(p|q) + "\t");
		System.out.println(booleanToInt(p^q) + "\t" + booleanToInt(!p));
	}

}

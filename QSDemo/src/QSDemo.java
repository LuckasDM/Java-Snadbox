
public class QSDemo {

	public static void main(String[] args) {
		char a[] = {'f','y','h','j','a','q','c','b','l','s','z','h','r'};
		int i;
		
		System.out.print("Orginal array: ");
		for (i=0; i < a.length; i++)
			System.out.print(a[i]);
		
		System.out.println();
		
		//now, sort the array
		Quicksort.qsort(a);
		
		System.out.print("Sorted array: ");
		for(i=0; i < a.length; i++)
			System.out.print(a[i]);	

	}

}

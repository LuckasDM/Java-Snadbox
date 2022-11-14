// a simple generic class with two type parameters: T and V
public class TwoGen<T, V> {
	T ob1;
	V ob2;

	// Pass the constructor reference to object of type T and V
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	// Show types of T and V.
	void showTypes() {
		System.out.println("Type of T is " + ob1.getClass().getName());

		System.out.println("Type of T is " + ob2.getClass().getName());
	}

	T getob1() {
		return ob1;
	}

	V getob2() {
		return ob2;
	}
}
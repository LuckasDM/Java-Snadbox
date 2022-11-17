
public class LambdaArgumentDemo {

	// This method has a functional interface as the type of its first parameter.
	// Thus, it can be passed a reference to any instance of that interface,
	// including an instance created by a lambda expression. The second parameter
	// specifies the string to operate on.

	static String changeStr(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lambda Expression Expand Java";
		String outStr;

		System.out.println("Here is input string: " + inStr);

		// Define a lambda expression that reverses the contents
		// of a string and assign it to a StringFunc reference variable.

		StringFunc reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		// Pass reverse to the first argument to changeStr()
		// Pass the input string as the second argument.

		outStr = changeStr(reverse, inStr);
		System.out.println("The string reversed: " + outStr);

	}

}

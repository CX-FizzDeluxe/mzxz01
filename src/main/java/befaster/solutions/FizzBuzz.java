package befaster.solutions;

public class FizzBuzz {

	public static String fizzBuzz(Integer number) {
		String numStr = String.valueOf(number);
		if ((number % 5 == 0 || numStr.contains("5"))
				&& (number % 3 == 0 || numStr.contains("3")))
			return "fizz buzz";
		if (number % 5 == 0 || numStr.contains("5"))
			return "buzz";
		if (number % 3 == 0 || numStr.contains("3"))
			return "fizz";
		return numStr;
	}

}

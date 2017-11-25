package befaster.solutions;

public class FizzBuzz {

	public static String fizzBuzz(Integer number) {
		if (number % 3 == 0 && number % 5 == 0)
			return "fizz buzz";
		if (number % 5 == 0)
			return "buzz";
		if (number % 3 == 0)
			return "fizz";
		return String.valueOf(number);
	}

}

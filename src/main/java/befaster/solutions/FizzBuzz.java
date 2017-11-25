package befaster.solutions;

public class FizzBuzz {

	public static boolean singleDigitNumber(String number) {
		if (number.length() == 1)
			return true;
		char c = number.charAt(0);
		for (int i = 1; i < number.length(); i++) {
			if (number.charAt(i) != c)
				return false;
		}
		return true;
	}

	public static String deluxeSuffix(Integer number, String digit) {
		if (number.toString().contains(digit))
			return number % 2 == 0 ? " deluxe" : " fake deluxe";
		return "";
	}

	public static String fizzBuzz(Integer number) {
		String numStr = String.valueOf(number);
		if ((number % 5 == 0) && (number % 3 == 0)) {
			if (numStr.contains("3") && numStr.contains("5")) {
				return "fizz buzz"
						+ (number % 2 == 0 ? " deluxe" : " fake deluxe");
			}
			return "fizz buzz";
		}
		if (number % 5 == 0)
			return "buzz" + deluxeSuffix(number, "5");
		if (number % 3 == 0)
			return "fizz" + deluxeSuffix(number, "3");
		return numStr;
	}

}

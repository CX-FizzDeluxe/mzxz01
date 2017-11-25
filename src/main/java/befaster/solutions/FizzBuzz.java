package befaster.solutions;

public class FizzBuzz {

	public static boolean singleDigitNumber(String number){
		if (number.length()==1)
			return true;
		char c = number.charAt(0);
		for(int i = 1;i<number.length();i++){
			if (number.charAt(i)!=c)
				return false;
		}
		return true;
	}

	public static String fizzBuzz(Integer number) {
		String numStr = String.valueOf(number);
		StringBuilder sb = new StringBuilder();
		if ((number % 5 == 0 || numStr.contains("5"))
				&& (number % 3 == 0 || numStr.contains("3")))
			sb.append("fizz buzz");
		if (number % 5 == 0 || numStr.contains("5"))
			sb.append("buzz");
		if (number % 3 == 0 || numStr.contains("3"))
			sb.append("fizz");
		if (number>10 && singleDigitNumber(numStr))
			sb.append(" deluxe");
		return sb.toString();
	}

}

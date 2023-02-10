package exercise;

public class ArithmeticDemo {

	public static void main(String[] args) {
		int result = 1 + 2;
		// result is now 3
		System.out.println("1 + 2 = " + result);
		int original_result = result;
		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
		
		result = result - 1;
		// result is now 2
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;
		
		result = result * 2;
		// result is now 4
		System.out.println(original_result + " * 2 = " + result);
		original_result = result;
		
		result = result / 2;
		// result is now 2
		System.out.println(original_result + " / 2 = " + result);
		original_result = result;
		
		result = result % 7;
		// result is now 3
		System.out.println(original_result + " % 7 = " + result);
	}
}

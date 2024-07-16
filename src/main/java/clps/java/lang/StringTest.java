package clps.java.lang;

public class StringTest {
	
	public static void main(String[] args) {
		String input = "abcd123";
		getFloat(input);
		input = "abcd123.456";
		getFloat(input);
		input = "abcd123.4";
		getFloat(input);
		input = "abcd123.41";
		getFloat(input);
		input = null;
		getFloat(input);
		input = "";
		getFloat(input);
		input = "   ";
		getFloat(input);
	}
	
	static String getFloat(String input) {
		System.out.println("The input String is: '" + input + "'");
		String result = "";
		if (input == null || "".equals(input.trim())) {
			System.out.println("Please input the String!");
			return "";
		}
		String numbers = "0123456789";
		for(int idx=0; idx<input.length(); idx++) {
			char tmpChar = input.charAt(idx);
			if(numbers.indexOf(tmpChar) < 0) {
				continue;
			} else {
				result = input.substring(idx);
				break;
			}
		}
		//format the output String
		char dotChar = '.';
		int dotIndex = result.indexOf(dotChar);
		if (dotIndex > 0) {
			if (result.length() - dotIndex > 3) {
				result = result.substring(0, dotIndex + 3);
			} else if(result.length() - dotIndex == 2) {
				result = result + "0";
			}
		} else {
			result = result + ".00";
		}
		System.out.println("The output String is: '" + result + "'");
		System.out.println("----------------------------------------------");
		return result;
	}

}

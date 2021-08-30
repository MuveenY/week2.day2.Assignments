package week2.day2.Assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Tes12Le79af65";
		int sum = 0;
		String text1 = text.replaceAll("\\D", "");
		System.out.println(text1);
		
		char[] charArray = text1.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			int num = Character.getNumericValue(charArray[i]);
			sum = sum + num;
		}

		System.out.println("Sum of Digits : " + sum);
	}

}

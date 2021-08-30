package week2.day2.Assignments;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";

		String[] splitArray = text.split(" ");
		System.out.println(splitArray.length);
		int count = 0;
		for (int i = 0; i < splitArray.length; i++) {
			count++;
			for (int j = i + 1; j < splitArray.length; j++) {
				if (splitArray[i].equals(splitArray[j])) {
					count++;
					splitArray[j] = "";
				}
			}
			if (count >= 1) {
				System.out.print( splitArray[i] + " ");
			}

		}

	}

}

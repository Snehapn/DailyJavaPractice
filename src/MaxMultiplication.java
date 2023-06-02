import java.util.*;

public class MaxMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 1, 2, 7, 3, 6 };
		maxMultiplication(a);
	}

	public static void maxMultiplication(int a[]) {
		// find smallest, 2ndsmallest. largest, 2ndlargeat
		int maxMultiplication = 0;

		int smallestNum = a[0] < a[1] ? a[0] : a[1];
		int secSmallestNum = a[0] < a[1] ? a[1] : a[0];
		int largestNum = a[0] > a[1] ? a[0] : a[1];
		int secLargestNum = a[0] > a[1] ? a[1] : a[0];

		for (int i = 2; i < a.length; i++) {

			if (a[i] < smallestNum) {
				secSmallestNum = smallestNum;
				smallestNum = a[i];
			}

			else if (a[i] < secSmallestNum) {
				secSmallestNum = a[i];
			}

			if (a[i] > largestNum) {
				secLargestNum = largestNum;
				largestNum = a[i];
			}

			else if (a[i] > secLargestNum) {
				secLargestNum = a[i];
			}

		}

		int multiplication1 = smallestNum * secSmallestNum;
		int multiplication2 = largestNum * secLargestNum;
		if (multiplication1 > multiplication2) {
			maxMultiplication = multiplication1;
		} else {
			maxMultiplication = multiplication2;

		}
		System.out.println(maxMultiplication);
	}

}

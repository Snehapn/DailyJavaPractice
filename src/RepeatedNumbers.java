import java.security.AlgorithmConstraints;
import java.util.*;

public class RepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// No of time repeat numbers and find unique number

		List<Integer> al = new ArrayList<>();
		repNumbers(a, al);
	}

	public static void repNumbers(int a[], List<Integer> al) {
		// if number is not present in arrayList then add arraylist
		// if number is present in arraylist then increase the count

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				if(k==1) {
					System.out.println(a[i]+" is a unique number.");
				}
				System.out.println(a[i] + " is repeating " + k + " times.");

			}

		}

	}

}

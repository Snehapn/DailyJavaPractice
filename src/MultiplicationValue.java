import java.util.*;

public class MultiplicationValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 1, 3, 10, 7, 5, 8, 6 };

		multiplicationOf2Numbers(a, 30);
	}

	public static void multiplicationOf2Numbers(int a[], int value) {
		// if num/a[i] ==0 && it is contain in hashset then print
		// if above condition is not true add in hashset
		int i = 0;
		Set<Integer> set = new HashSet<>();

		while (i < a.length) {
			int num = value / a[i];

			if ((value % a[i]) == 0 && set.contains(num)) {
				System.out.println(num + " " + a[i]);
			}

			else {
				set.add(a[i]);
			}
			i++;
		}

	}

}

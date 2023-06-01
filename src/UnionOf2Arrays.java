import java.util.*;

public class UnionOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = { 2, 2, 3, 4, 4, 4, 7, 8, 98, 98, 100 };
		int a2[] = { 1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10, 11, 12, 98, 101 };

		List<Integer> al = new ArrayList<>();
		unionArray(a1, a2, al);

		System.out.println(al);
	}

	public static void unionArray(int a1[], int a2[], List<Integer> al) {
		int i = 0;
		int j = 0;
		// repeat digit then go to next digit
		// if a1[i] > a2[j] - add a2 in al, increase j, repeat logic
		// if a1[i] < a2[j] - add a1 in al, increase i, repeat logic
		// if a1[i] = a2[j] - add a1 in al, increase i,j both.

		while (i < a1.length && j < a2.length) {

			while (i < (a1.length - 1) && a1[i] == a1[i + 1]) {
				i++;
			}

			while (j < (a2.length - 1) && a2[j] == a2[j + 1]) {
				j++;
			}

			if (a1[i] > a2[j]) {
				al.add(a2[j]);
				j++;
			}

			else if (a1[i] < a2[j]) {
				al.add(a1[i]);
				i++;
			}

			else {
				al.add(a1[i]);
				i++;
				j++;
			}

		}

		while (i < a1.length) {
			while (i < (a1.length - 1) && a1[i] == a1[i + 1]) {
				i++;
			}

			al.add(a1[i]);
			i++;
		}

		while (j < a2.length) {
			while (j < (a2.length - 1) && a2[j] == a2[j + 1]) {
				j++;
			}

			al.add(a2[j]);
			j++;
		}
	}

}

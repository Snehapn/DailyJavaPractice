import java.util.*;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = { 2, 2, 3, 4, 4, 4, 7, 8, 100 };
		int a2[] = { 1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10, 11, 12, 98, 100 };

		List<Integer> al = new ArrayList<>();
		intersectionOfArray(a1, a2, al);
		System.out.println(al);
	}

	public static void intersectionOfArray(int a1[], int a2[], List<Integer> al) {
		int i = 0;
		int j = 0;
		// if repeating number, increase i
		// if a1[i] = a2[j] , add in al, increase i &j
		// else increase i,j

		while (i < a1.length && j < a2.length) {

			while (i < (a1.length - 1) && a1[i] == a1[i + 1]) {
				i++;
			}
			while (j < (a2.length - 1) && a2[j] == a2[j + 1]) {
				j++;
			}

			if (a1[i] == a2[j]) {
				al.add(a1[i]);
				i++;
				j++;
			}

			else if (a1[i] < a2[j]) {
				i++;
			} else {
				j++;
			}

		}

	}

}

import java.util.*;

public class RepeatedNumbersHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		repnums(a);
	}

	public static void repnums(int a[]) {

		Map<Integer, Integer> hmap = new HashMap<>();

		for (int i = 0; i < a.length; i++) {

			if (hmap.containsKey(a[i])) {
				hmap.put(a[i], hmap.get(a[i]) + 1);
			}

			else {
				hmap.put(a[i], 1);
			}

		}
		System.out.println(hmap);
	}

}

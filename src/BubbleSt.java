import java.util.Arrays;

public class BubbleSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 5, 0, -9, 1 };
		bubblesort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void bubblesort(int a[]) {

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i = -1;
			}
		}

	}

}

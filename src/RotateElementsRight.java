import java.util.Arrays;

public class RotateElementsRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int D = 1;
		rotateElementsToRight(a, D);
	}

	public static void rotateElementsToRight(int a[], int D) {
		int j = 0;

		while (j < D) {
			int i = a.length - 1;
			int temp;
			temp = a[a.length - 1];

			while (i < a.length) {
				if (i > 0) {
					a[i] = a[i - 1];
					i--;
				} else {
					a[i] = temp;
					break;
				}
			}
			j++;
		}
		System.out.println(Arrays.toString(a));

	}
}

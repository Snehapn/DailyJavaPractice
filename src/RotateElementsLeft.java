import java.util.Arrays;

public class RotateElementsLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int D = 3;
		rotateElementsToLeft(a, D);
	}

	public static void rotateElementsToLeft(int a[], int D) {
		int j = 0;
		int temp;

		while (j < D) {
			int i = 0;
			temp = a[0];

			while (i < a.length) {
				if (i < a.length - 1) {
					a[i] = a[i + 1];
					i++;
				} else {
					a[a.length - 1] = temp;
					break;
				}
			}
			j++;
		}

		System.out.println(Arrays.toString(a));
	}

}

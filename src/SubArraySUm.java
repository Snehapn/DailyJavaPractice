
public class SubArraySUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 2, 5, 3, 1, 8 };
		int k = 9;
		subArraySum(a, k);
	}

	public static void subArraySum(int a[], int k) {

		int start = 0;
		int end = 0;
		int windowSum = 0;

		while (start < a.length && end < a.length) {
			windowSum = windowSum + a[end];

			if (windowSum == k) {
				System.out.println(start + " " + end);
			}

			while (windowSum > k) {
				windowSum = windowSum - a[start];
				start++;

				if (windowSum == k) {
					System.out.println(start + " " + end);
				}

			}
			end++;

		}

	}
}

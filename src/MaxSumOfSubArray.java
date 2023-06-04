
public class MaxSumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 2, 0, 4, 1 };
		int k = 3;
		subArraySum(a, k);

	}

	public static void subArraySum(int a[], int k) {
		// 1 for loop to calculate sum
		// store sum in maxSum if sum> maxSum
		int i = 0;
		int sum = 0;
		int maxSum = 0;
		while (i < (a.length-k+1)) {

			for (int j = i; j < k + i; j++) {
				sum = sum + a[j];

			}
			if (sum > maxSum) {
				maxSum = sum;
			}
			i++;
			sum=0;
		}
		System.out.println(maxSum);

	}

}

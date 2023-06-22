import java.util.Arrays;

public class MaximumPlatforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
//		int dep[] = { 910, 1120, 1130, 1200,  1900, 2000 };

		maximumPlatforms(arr, dep);
	}

	public static void maximumPlatforms(int arr[], int dep[]) {

		Arrays.sort(arr);
		Arrays.sort(dep);

		int i = 0;
		int j = 0;
		int count = 0;
		int maxCount = 0;

		while (i < arr.length && j < dep.length) {
			if (arr[i] <= dep[j]) {
				count++;
				if (count > maxCount) {
					maxCount = count;
				}
				i++;
			} else if (arr[i] > dep[j]) {
				count--;
				j++;
			}
		}
		System.out.println(maxCount);
	}

}

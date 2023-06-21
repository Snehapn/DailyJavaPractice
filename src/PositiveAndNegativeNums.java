import java.util.Arrays;

public class PositiveAndNegativeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -1, 2, -7, 4, 5, 6, -3, 8, 9 };

		int start=0;
		int end = a.length-1;
		int temp;
		while(true) {
			while(a[start]<0 && start<end) {
				start++;
			}
			while(a[end]>0 && start<end) {
				end--;
			}
			if(start<end) {
				temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			else {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}

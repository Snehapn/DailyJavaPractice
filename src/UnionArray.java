import java.util.*;

public class UnionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 4, 2, 3, 5, 4, 2, 3 };
		int arr2[] = { 9, 1, 7, 2, 4, 2, 1, 2 };

		Set<Integer> set = new HashSet<>();
		unionOfArrays(arr1, arr2, set);
		System.out.println(set);
	}

	public static void unionOfArrays(int arr1[], int arr2[], Set<Integer> set) {
		int i=0;
		int j=0;
		// set for arr1
		// add elements from arr2 in same hash set.
		while(i<arr1.length) {
			set.add(arr1[i]);
			i++;
		}
		
		while(j<arr2.length) {
			set.add(arr2[j]);
			j++;
		}
		
		
	}

}

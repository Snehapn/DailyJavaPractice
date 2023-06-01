import java.util.*;

public class IntersectionOfUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 4, 2, 3, 5, 4, 2, 3 };
		int arr2[] = { 9, 1, 7, 2, 4, 2, 1, 2 };
		Set<Integer> set = new HashSet<>();
		intersectionArray(arr1, arr2, set);
		System.out.println(set);
	}

	public static void intersectionArray(int arr1[], int arr2[], Set<Integer> set) {
		// add elements in temp set from 1st array
		// now check if temp set element is present in arr2 or not, if present then add
		// in final set

		int i = 0;
		int j = 0;
		Set<Integer> tempSet = new HashSet<>();

		while (i < arr1.length) {
			tempSet.add(arr1[i]);
			i++;
		}

		while (j < arr2.length) {
			if (tempSet.contains(arr2[j])) {
				set.add(arr2[j]);
			}
			j++;
		}
	}

}

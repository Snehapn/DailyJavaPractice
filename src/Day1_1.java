
public class Day1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3 };
		occuranceNumber(a, 5);
	}

	public static void occuranceNumber(int[] a, int num) {
		int start = 0;
		while (start < a.length) {

			if (a[start] == num) {
				System.out.println("Index is " +start +".");
				break;
			}
			int diff = a[start] - num;
			start = start + diff;

		}

	}

}

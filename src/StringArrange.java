
public class StringArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "1001101";

		char[] a = s.toCharArray();

		int start = 0;
		int end = a.length - 1;
		char temp;
		while (true) {

			while (a[start] == '1' && start < end) {
				start++;
			}
			while (a[end] == '0' && start < end) {
				end--;
			}

			if (start < end) {
				temp = a[start];
				a[start] = a[end];
				a[end] = temp;

			} else {
				break;
			}
		}
		System.out.println(a);
		

	}
}

import java.util.Arrays;

public class Stocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p[] = { 7, 1, 5, 3, 6, 4 };
		maxProfit(p);
	}

	public static void maxProfit(int p[]) {

		int start = 0;
		int profit = 0;
		int maxProfit = 0;
		while (start < p.length) {

			for (int i = start + 1; i < p.length; i++) {
				if (p[i] > p[start]) {
					profit = p[i] - p[start];
					if (profit > maxProfit) {
						maxProfit = profit;
					}
				}
			}
			start++;
		}

		System.out.println(maxProfit);

	}

}

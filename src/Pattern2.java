
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPattenrows(4);
	}
	
	public static void printPattenrows(int num) {
		int k=0;
		for (int i=num; i>=0; i--) {
			for (int j=1; j<=i; j++) {
				k++;
				System.out.print(k);
				System.out.print("\t");

			}
			System.out.println();
		}
	}

}

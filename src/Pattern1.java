
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPattenrows(5);
	}
	
	public static void printPattenrows(int num) {
		
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
				System.out.print("\t");

			}
			System.out.println();

		}
	}

}

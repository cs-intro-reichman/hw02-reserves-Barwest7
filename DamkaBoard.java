/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int userInput = Integer.parseInt(args[0]);
		for (int i=1; i<=userInput; i++) {
			if (i%2==0)
				System.out.print(" ");
			for (int j=0; j<userInput; j++) {
				System.out.print("* ");
			}
			if (i%2==1)
				System.out.print(" ");
			System.out.println();
		}

	}
}

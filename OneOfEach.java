
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int counter = 0;
		int randomNum = -1;
		char bOrG = 'a';
		boolean girlFlag = false;
		boolean boyFlag = false;

		// Run as long as youd ont have at least 1 of each gender
		while (!boyFlag || !girlFlag) {
			
			// Generate a randoum number: 0 or 1 (50% chance for each)
			randomNum = (int)(Math.random() * 2);

			// Decide tentatively that 0 is for girl and 1 is for boy
			if (randomNum==1) {
				bOrG = 'b';
				boyFlag = true;
			}
			else if (randomNum==0) {
				bOrG = 'g';
				girlFlag = true;
			}

			System.out.print(bOrG + " ");
			counter++;
		}
		System.out.println();
		System.out.println("You made it... and you now have " + counter + " children.");
	}
}

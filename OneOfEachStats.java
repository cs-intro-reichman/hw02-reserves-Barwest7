import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  

		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		int counterOfChildren = 0;
		char bOrG = 'a';
		boolean girlFlag = false;
		boolean boyFlag = false;

		double totalNumOfChildren = 0;
		int familiesOfTwo = 0;
		int familiesOfThree = 0;
		int familiesOfFour = 0;
		double average;
		String mostCommon = "";

		// Run for as many times as the user requested
		for (int i=0; i<T; i++) {

					// Run as long as youd ont have at least 1 of each gender
			while (!boyFlag || !girlFlag) {
			
				// Generate a randoum number: 0 or 1 (50% chance for each)
				int randomNum = (int)(generator.nextDouble()*2);

				// Decide tentatively that 0 is for girl and 1 is for boy
				if (randomNum==1) {
					bOrG = 'b';
					boyFlag = true;
				}
				else if (randomNum==0) {
					bOrG = 'g';
					girlFlag = true;
				}

			counterOfChildren++;
			totalNumOfChildren++;
			}

			if (counterOfChildren == 2)
				familiesOfTwo++;
			else if (counterOfChildren == 3)
				familiesOfThree++;
			else
				familiesOfFour++;
			girlFlag = false;
			boyFlag = false;
			counterOfChildren = 0;
		}

		average = totalNumOfChildren/T;

		if (familiesOfFour > familiesOfThree && familiesOfFour > familiesOfTwo)
			mostCommon = " 4 or more.";
		else if (familiesOfThree > familiesOfFour && familiesOfThree > familiesOfTwo)
			mostCommon = "3.";
		else 
			mostCommon = "2.";

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familiesOfTwo);
		System.out.println("Number of families with 3 children: " + familiesOfThree);
		System.out.println("Number of families with 4 or more children: " + familiesOfFour);
		System.out.println("The most common number of children is " + mostCommon);
	}
}

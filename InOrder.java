/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		
		// Start random number as -999
		int rand1 = -999;
		
		// Start last value as 11 (bigger than greatest in range)
		int last = -1;
		
		// Print the first generated number anyway
		// Keep generating numbers in the range as long as the number generated is smaller than the last generated number
		do {
			rand1 = (int)(Math.random() * 10);
			if (last <= rand1) {
				last = rand1;
				System.out.print(rand1 + " ");
			}
		}
		while (last <= rand1);
	}
}

/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int userInput = Integer.parseInt(args[0]);
		String printLucky = userInput + " is a perfect number since " + userInput + " = 1";
		int counter = 1;
		
		for (int i=2; i<userInput; i++) {
			if (userInput%i==0) {
				printLucky += " + " + i;
				counter += i;
			}
		}
		
		if (counter == userInput) 
			System.out.println(printLucky);
		
		else 
			System.out.println(userInput +  " is not a perfect number");
	}
}

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String userText = args[0];
		int n = userText.length();
		boolean isNeven = (n%2==0);
		String newString = "";
		
		for (int i=n-1; i>=0; i--) {
			newString += userText.charAt(i);
		}
	
		System.out.println(newString);
		if (isNeven)
			System.out.println("The middle character is " + userText.charAt((n-1)/2));
		else
			System.out.println("The middle character is " + userText.charAt((n/2)));
		
	}
}

import java.util.Scanner;

public class Excercise3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        String s;
        do {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            s = input.nextLine();
            if (!isNumeric(s)) {
                System.out.println("Please enter a number...");
            }
        } while (!isNumeric(s));

        if (isPalindrome(s)) {

            System.out.println(s + " is a palindrome");
        } else {

            System.out.println(s + " is not a palindrome");
        }
    }

    public static boolean isNumeric(String string) {

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) < '0' || string.charAt(i) > '9') {
                return false;
            }

        }

        return true;
    }


    public static boolean isPalindrome(String string) {

        // high index
        int high = string.length() - 1;

        for (int i = 0; i < string.length(); i++, high--) {
            if (string.charAt(i) != string.charAt(high)) {
                return false;
            }
        }

        return true;
	}

}

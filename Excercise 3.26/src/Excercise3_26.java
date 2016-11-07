import java.util.Scanner;

public class Excercise3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean isDivByFiveAndSix = (number % 5 == 0) && (number % 6 == 0);
        boolean isDivByFiveOrSix = (number % 5 == 0) || (number % 6 == 0);
        boolean isDivByFiveOrSixButNotBoth = (number % 5 == 0) ^ (number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + isDivByFiveAndSix);
        System.out.println("Is " + number + " divisible by 5 or 6? " + isDivByFiveOrSix);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + isDivByFiveOrSixButNotBoth);
	}

}

import java.util.Scanner;

public class Excercise3_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter weight and price for package 1: ");
	        double weight1 = input.nextDouble();
	        double price1 = input.nextDouble();

	        System.out.print("Enter weight and price for package 2: ");
	        double weight2 = input.nextDouble();
	        double price2 = input.nextDouble();

	        if (price1 * 1.0D / weight1 >= price2 * 1.0D / weight2) {
	            System.out.println("Package 1 has a better price.");
	        } else {
	            System.out.println("Package 2 has a better price.");
	        }
	}

}

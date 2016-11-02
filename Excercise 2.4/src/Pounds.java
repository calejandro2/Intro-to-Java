import java.util.Scanner;
public class Pounds {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number in pounds:  ");

	        double pounds = input.nextDouble();
	        double kilograms = pounds * 0.454;

	        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
	}

}

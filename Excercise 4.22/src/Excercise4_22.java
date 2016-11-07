import java.util.Scanner;

public class Excercise4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = input.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = input.nextLine();
        input.close();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is NOT a substring of " + s1);
        }
	}

}

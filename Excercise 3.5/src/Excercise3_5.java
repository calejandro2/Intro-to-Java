import java.util.Scanner;


public class Excercise3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter today's day: ");
	        int todayNumber = input.nextInt();

	        System.out.print("Enter the number of days elapsed since today: ");
	        int daysAfterNumber = input.nextInt();

	        int futureDayNumber = (todayNumber + daysAfterNumber) % 7;

	        // Assigning date names to a string
	        String todayDayString = findDate(todayNumber);
	        String futureDayString = findDate(futureDayNumber);

	        System.out.println("Today is " + todayDayString + " and the future day is " + futureDayString);
	    }

	    public static String findDate(int date) {

	        String todayString;

	        switch (date) {
	            case 0:
	                todayString = "Sunday";
	                break;
	            case 1:
	                todayString = "Monday";
	                break;
	            case 2:
	                todayString = "Tuesday";
	                break;
	            case 3:
	                todayString = "Wednesday";
	                break;
	            case 4:
	                todayString = "Thursday";
	                break;
	            case 5:
	                todayString = "Friday";
	                break;
	            case 6:
	                todayString = "Saturday";
	                break;
	            default:
	                todayString = "Invalid Day";
	        }

	        return todayString;
	}

}

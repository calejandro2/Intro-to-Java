import java.util.Scanner;

public class LatitudeLongtitude {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        input.close();

        // Solving for the distance between the two points
        // Formula: d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

        double radius = 6371.01;

        double distance = radius *
                Math.acos( Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                           Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                           Math.cos(Math.toRadians(y1 - y2)));


        System.out.printf("The distance between the two points is %f km", distance);
	}

}

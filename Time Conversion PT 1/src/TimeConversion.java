import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in); 
		double o_time = 0, n_time = 0;  

		while(true) { 
		System.out.println("Please enter time"); 
		int time = in.nextInt(); 

		if(time ==9999) 
		break; 
		else if(time > 2400){ 
		//TODO: PRINT ERROR 
		continue; 
		} 

		String amOrPm="am"; 
		int minute = time%100;
		int hour = (time/100);  

		if(time >= 1200) 
		amOrPm="pm"; 

		System.out.print(hour + ":" + minute + amOrPm); 
		} 
	}

}

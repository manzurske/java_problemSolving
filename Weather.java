package Practice;

import java.util.Scanner;

public class Weather {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Today's temperature is: " );
		int temperature = scanner.nextInt();
		
		scanner.close();
		
		if (temperature <= 40) {
			System.out.println("Today's weather is freezing cold!");
		}
		
		else if (temperature > 40 && temperature <= 70) {
			System.out.println("Today's weather is cold!");
		}
		
		else if (temperature > 70 && temperature <= 85) {
			System.out.println("Today's weather is comfortable!");
		}
	
		else if (temperature > 85 && temperature <= 95) {
			System.out.println("Today's weather feels warm!");
		}
		
		else if (temperature > 95 && temperature <= 100) {
			System.out.println("Today's weather very hot!");
		}
		else  {
			System.out.println("Today's weather feels extreme hot!");
		}
	
	}

}
 
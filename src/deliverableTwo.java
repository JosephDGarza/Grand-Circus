import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;

class deliverableTwo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String firstDate = "";	//first date inputed by user
		String secondDate = ""; //second date inputed by user
		int days = 0; 			//Integer set for days
		int months = 0;			//Integer set for months
		int years = 0;			//Integer set for years
		
		System.out.println("Enter a date in YYYY-MM-DD format:");

		firstDate = scnr.nextLine(); //Assigns user input to string

		LocalDate dateOne = LocalDate.parse(firstDate); //Date based on user input
		
		
		/*
		System.out.println(dateOne);
		*/
		
		System.out.println("Enter a second date in YYYY-MM-DD format:");

		secondDate = scnr.nextLine();

		LocalDate dateTwo = LocalDate.parse(secondDate);
		
		Period difference = dateOne.until(dateTwo);	//Grabs the time difference between 2 dates.
		
		//Tested to ensure difference was accurate
		/*
		System.out.println(difference);
		*/
		
		days = difference.getDays(); 		// Gets the number for days
		months = difference.getMonths(); 	// Gets the number for months
		years = difference.getYears();		// Gets the number for years

		System.out.println("Your time difference is: " + years + " years " + months + " months and " + days + " days.");
	
	}
}
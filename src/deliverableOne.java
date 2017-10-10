import java.util.Scanner;

public class deliverableOne {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x = 0; //digit 1 of userInputOne
		int y = 0; //digit 2 of userInputOne
		int z = 0; //digit 3 of userInputOne
		int a = 0; //digit 1 of userInputTwo
		int b = 0; //digit 2 of userInputTwo
		int c = 0; //digit 3 of userInputTwo
		int XA = 0;
		int YB = 0;
		int ZC = 0;
		
		boolean result = true;
		
		
		
		String k = "";
		
		int userInputOne = 0;
		int userInputTwo = 0;
		System.out.println("Enter a 3 digit number"); // Assigning userInput Two
		userInputOne = scnr.nextInt();
		System.out.println("Enter a second 3 digit number"); // Assigning userInputTwo
		userInputTwo = scnr.nextInt();
		
		
		
		while ((userInputOne > 999) || (userInputTwo > 999)) { //using the while loop to prevent numbers past 3 digits. Couldn't create a solution to prevent less than 3 digits as I would like it to continue to work from -999 - 099. 
			System.out.println("Please enter ONLY 3 digits"); 
			userInputOne = scnr.nextInt();
			System.out.println("Enter a second 3 digit number"); 
			userInputTwo = scnr.nextInt();
		}
		
		while ((userInputOne < -999) || (userInputTwo <- 999)) {
			System.out.println("Please enter ONLY 3 digits"); 
		userInputOne = scnr.nextInt();
		System.out.println("Enter a second 3 digit number"); 
		userInputTwo = scnr.nextInt();
	}
		
		
		
		/*  test out to ensure integers are assigned properly before diving in too far.
		System.out.println(userInputOne);
		System.out.println(userInputTwo);
		*/
	x = userInputOne/100; 		//This will return the first digit by dividing it by 100 and leaving no remainder. IE - 650/100 = 6.5. Toss the change, we have 6
	y = userInputOne%100/10; 	//This will return the second digit by gathering the remainder after dividing by 100, then dividing it by 10 to grab the second digit and throw away the change. IE 623/100 = 6 with 23 left over. Toss the 6. 23/10 = 2.3. Toss the change, we have 2
	z = userInputOne%100%10;	//This will return the third digit by gathering the remainder of dividing by 100, then the remained of dividing by 10. IE - 567/100 = 5.67. Toss the 5. Remainder of 67/10 = 6.7. Toss the 6 and we have 7 left over.
	
	a = userInputTwo/100;
	b = userInputTwo%100/10;
	c = userInputTwo%100%10;
	
	//Testing values to be accurate
	/*
	System.out.println(userInputOne);
	System.out.println(userInputTwo);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	*/
	XA = x + a;
	YB = y + b;
	ZC = z + c;
	
	
	//Tested values
	/*
	System.out.println(XA + " " + YB + " " + ZC);
	*/
	
	if ((XA == YB) && (YB == ZC)) {

		result = true;
		}

	else {
		result = false;
					
	}
	System.out.println(result);
	
	}
	}
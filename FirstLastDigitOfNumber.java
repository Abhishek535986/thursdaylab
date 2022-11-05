package basicprogram;

import java.util.Scanner;

public class FirstLastDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,firstdigit=0,lastdigit,temp;  //initialize variable
		Scanner SC= new Scanner(System.in);     //create object
		System.out.println("Enter the number :");   //take input
		number =SC.nextInt();     //store variable
		temp=number;
		
	    lastdigit =number%10;    //finding last digit 
	    System.out.println("The last digit of a number "+number+" is:"+lastdigit);  //output
	    
	    while(number!=0)  //condition number is not equal to zero
	    {
	    	firstdigit =number%10;   //finding first digit
	    	number =number/10;
	    }
	    System.out.println("The first digit of a number "+temp+" is:"+firstdigit);  //output
	    SC.close();
		

	}

}

package basicprogram;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,fact=1;   //initialize variable
		Scanner SC=new Scanner(System.in);   //create object
		System.out.println("Enter the number :");   //take input
		n=SC.nextInt();   //store variable
		
		for(int i=1;i<=n;i++)   //condition
		{
			fact=fact*i;   //calculation
		}
		System.out.println("The factorial of a number "+n+" is:"+fact);  //result
		SC.close();

	}

}

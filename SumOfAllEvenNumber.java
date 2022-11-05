package basicprogram;

import java.util.Scanner;

public class SumOfAllEvenNumber {
	
	public static void main(String []args)
	{
		int i,n,sum=0;   //initialize variable
		
		Scanner SC=new Scanner(System.in);    //create object
		System.out.println("Enter the number :");   //taking input
		n=SC.nextInt();    //storing variable
		 
		for(i=2;i<=n;i++)   //condition
		{
			if(i%2==0)      //for check even number
			{
			  sum =sum+i;
			}  
		}
		System.out.println("The Sum of all even number from 1 to "+n+" is: "+sum);   //output
		SC.close();
	}

}

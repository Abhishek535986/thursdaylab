package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String name,rev=" ";   //initialize variable
		Scanner SC=new Scanner(System.in);
		
		System.out.println("Enter the String :");  //taking input
		name =SC.nextLine();   //storing variable
		
		int length=name.length();    //counting length of a string
		
		for(int i=length-1;i>=0;i--)    //condition
		{
			rev=rev+name.charAt(i);    //storing value
		}
		System.out.println("The reverse of a string is :"+rev);   //output

	}

}

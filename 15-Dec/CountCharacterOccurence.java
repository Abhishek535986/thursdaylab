package String;

import java.util.Scanner;

public class CountCharacterOccurence {
	
	public static void main(String args[])
	{
		String name;   //initialize variable
		char ch;
		int count=0;
		Scanner SC=new Scanner(System.in);
		
		System.out.println("Enter the string :");   //taking input
		name =SC.nextLine();
		
		System.out.println("Enter the character to find the occurence :");   //for search
		ch=SC.next().charAt(0);
		
		
		for(int i=0;i<name.length();i++)    //condition checking
		{
			if(name.charAt(i)==ch)
			{
				count++;
			}
		}
		
		System.out.println("Occurunce of specific char is :"+count);    //output
	}

}

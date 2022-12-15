//WAp to compare two string

package String;

import java.util.Scanner;

public class CompareTwoString {

	public static void main(String[] args) {
		
		String str1,str2;
		
		Scanner SC=new Scanner(System.in);
		
		System.out.print("Enter the first string :");
		str1=SC.nextLine();
		
		System.out.print("Enter the second string :");
		str2=SC.nextLine();
		
		if(str1.equals(str2))
		{
			System.out.println("Both String are same");
		}
		else
		{
			System.out.println("Both String are not same");
		}
		
	}

}

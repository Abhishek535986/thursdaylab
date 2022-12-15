//WAP to Join Two String 

package String;

import java.util.Scanner;

public class JoiningTwoString {

	public static void main(String[] args) {
		
		String Name,Title,Store;  //intialize variable
		
		Scanner SC= new Scanner(System.in);  //creating object
		System.out.println("Enter the name of a string :");   //taking input
		Name =SC.nextLine();   //storing variable
		
		System.out.println("Enter the title of a string :");  
		Title =SC.nextLine();
		
		Store =Name + " " +Title;   //adding two string
		System.out.println("After joining two string is :"+Store);   //output
		

	}

}

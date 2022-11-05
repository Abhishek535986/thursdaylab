package basicprogram;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i ,num;   //initialize number
		Scanner SC =new Scanner(System.in);   //create object
		System.out.println("Enter the number :");  //take input
		num=SC.nextInt();   //store variable
		
		for(i=1;i<=10;i++)    //condition
		{
			System.out.println(num+"*"+i+"="+num*i);  //result
		}

	}

}

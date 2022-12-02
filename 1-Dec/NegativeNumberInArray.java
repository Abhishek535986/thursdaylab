package Array;

import java.util.Scanner;

public class NegativeNumberInArray {

	public static void main(String[] args) {
		
		int arr[],a;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number in array :");
		a=SC.nextInt();
		arr=new int[a];
		System.out.println("The  "+a+" of array is :");
		for(int i=0;i<a;i++)
		{
			arr[i]=SC.nextInt();
		}
		System.out.println("The number of elemnts in array is :");
		for(int i=0;i<a;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println("The Negative number in an array is :");
		for(int i=0;i<a;i++)
		{
			if(arr[i]<0)
			{
				System.out.println(arr[i]+ " ");
			}
		}
	}

}

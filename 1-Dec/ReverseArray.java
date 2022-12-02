//WAP to program a print the reverse of an array element.

package Array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter elements into a array :");
		for(int i=0;i<5;i++)
		{
			arr[i]=SC.nextInt();
		}
		System.out.println("Array Elements :");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println("Array Elements in Reverse Order :");
		for(int i=5-1;i>=0;i--)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}

package Array;

import java.util.Scanner;

public class CopyArrayElement {
	
	public static void main(String args[])
	{
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the value in first array :");
		for(int i=0;i<5;i++)
		{
			a[i]=SC.nextInt();
		}
		System.out.println("All the elements in an first array  :");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Copy element from one to another  :");
		for(int i=0;i<5;i++)
		{
			b[i]=a[i];
			System.out.println(a[i]+" ");
		}
	}

}

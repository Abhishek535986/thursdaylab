package Array;

import java.util.Scanner;

public class MaximumMinumumElementArray {
	
	public static void main(String args[])
	{
		int arr[],size;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the size of array is :");
		size=SC.nextInt();
		arr=new int[size];
		System.out.println("The "+size+ "of array element is :");
		for(int i=0;i<size;i++)
		{
			arr[i]=SC.nextInt();
		}
		System.out.println("The element of array is :");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		int max=arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The maximum element is :"+max);
		
		int min=arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The maximum element is :"+min);
		
	}

}

package Array;

import java.util.Scanner;

public class CountOddEven {
	
	public static void main(String args[])
	{
		int arr[]=new int[6];
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the  elelments in an array is :");
		for(int i=0;i<6;i++)
		{
			arr[i]=SC.nextInt();
		}
		System.out.println("The elelments in an array is :");
		for(int i=0;i<6;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<6;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+ " is a even number ");
				evenCount++;
			}
			else
			{
				System.out.println(arr[i]+ " is a odd number ");
				oddCount++;
			}
		}
        System.out.println("Even count is :"+evenCount);
        System.out.println("Odd count is :"+oddCount);
	}

}

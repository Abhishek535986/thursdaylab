package OOPSConcept;

import java.util.Scanner;

public class Arm
{
	
}

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,Sum=0,rem,c;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=SC.nextInt();
		c=n;

		while(n>0)
		{
			rem=n%10;
		    Sum=(rem*rem*rem)+Sum;
			n=n/10;
		}
		if(c==Sum)
			System.out.println("The number is a armstrong number :"+c);
		else
			System.out.println("The number is not a armstrong number :"+c);
		

	}

}

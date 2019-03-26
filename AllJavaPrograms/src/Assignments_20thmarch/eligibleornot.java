package Assignments_20thmarch;

import java.util.Scanner;

public class eligibleornot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please mention your gender");
		String gender = sc.next();
		System.out.println("Please mention your age");
		Integer age = sc.nextInt();
		
		if(gender.equalsIgnoreCase("male")&&age>=21||gender.equalsIgnoreCase("female")&&age>=18)
{
	System.out.println("You are eligible for marriage");
}

	/*	else if(gender.equalsIgnoreCase("female")&&age>=18)
		{
			System.out.println("You are eligible for marriage");
		}*/
		
		else if(gender.equalsIgnoreCase("male")&&age<21||gender.equalsIgnoreCase("female")&&age<18)
		{
			System.out.println("you are not eligible");
		}
		
		else
		{
			System.out.println("provide proper input");
		}
	}

}

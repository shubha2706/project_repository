package Assignments_20thmarch;

import java.util.Scanner;

public class Result {
	
	
	

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject marks");
		System.out.println("Enter First language marks");
		float Kannadascore = sc.nextInt();
		System.out.println("Enter Second language marks");
		float Secondlang = sc.nextInt();
		System.out.println("Enter Third language marks");
		float Thirdlang = sc.nextInt();
		System.out.println("Enter science marks");
		float science = sc.nextInt();
		System.out.println("Enter maths marks");
		float maths = sc.nextInt();
		System.out.println("Enter social marks");
		int social = sc.nextInt();
		
		float allsubjectmarks	= Kannadascore+Secondlang+Thirdlang+science+maths+social;
	float allsubjectmarkss =	((allsubjectmarks/600)*100);
		
		if(Kannadascore<35||Secondlang<35||Thirdlang<35||science<35||maths<35||social<35)
		{
			System.out.println("Failuuuu");
		}
		else if(allsubjectmarkss>=35.00&&allsubjectmarkss<60.00)
		{
			System.out.println("You are pass");
		}

		else if(allsubjectmarkss>=60.00&&allsubjectmarkss<70.00)
		{
			System.out.println("First calss");
		}
 
		else if(allsubjectmarkss>=70.00&&allsubjectmarkss<100.00)
		{
			System.out.println("Distinction");
		}
		else if(allsubjectmarkss<35.00)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("provide proper input");
		}
		
	}

}

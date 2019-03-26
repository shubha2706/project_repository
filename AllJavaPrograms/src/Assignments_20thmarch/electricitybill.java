package Assignments_20thmarch;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {  

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units");
		float units = sc.nextInt();
		System.out.println("Do you have arrears?");
		String no = sc.next();
		
		
		
		
		
		if(no.equalsIgnoreCase("no"))
			while(true)
			{
		
		float remainingunits=units%50;
		
		
		
		
		if(units<=50)
		{
			float unit=(float) (units*1.2);
			System.out.println("your bill amount is"+unit);
			
			}
		
		
		else if(units>50&&units<=100)
		{
	
			//float remainingunit=(float) (100-units);
			float unit=(float) (50*1.2)+(float) (remainingunits*2.4);
			System.out.println("your bill amount is"+unit);
			
		}
		
		else if(units>100&&units<=150)
			{
			
			
			//float remainingunit=(float) (100-units);
			float unit=(float) (50*1.2)+(float) (50*2.4)+(float) (remainingunits*3.6);
			System.out.println("your bill amount is"+unit);
	}
		
		else if(units>150&&units<=200)
		{
			float unit=(float) (50*1.2)+(float) (50*2.4)+(float) (50*3.6)+(float) (remainingunits*4.8);
			System.out.println("your bill amount is"+unit);
			
		}

		else if(units>200)
		{
			float unit=(float) (50*1.2)+(float) (50*2.4)+(float) (50*3.6)+(float) (50*4.8);
		float discount=	unit*(float) 0.5;
		
		if(discount>=200)
		{
			discount=200;
		}
		
		
		System.out.println("your bill is"+discount);
		
		break;
		}
		
		break;
		
}
		
		else if(no.equalsIgnoreCase("yes"))
		{
			
			System.out.println("please enter the arrears");
			int yess = sc.nextInt();
			
			
			while(true)
			{
				
			float remainingunits=units%50;
			
			
			
			
			if(units<=50)
			{
				float unit=(float) ((float) (units*1.2)+yess*0.1);
				System.out.println("your bill amount is"+unit);
				
				}
			
			
			else if(units>50&&units<=100)
			{
		
				//float remainingunit=(float) (100-units);
				float unit=(float) ((float) (50*1.2)+(float) (remainingunits*2.4)+yess*0.1);
				System.out.println("your bill amount is"+unit);
				
			}
			
			else if(units>100&&units<=150)
				{
				
				
				//float remainingunit=(float) (100-units);
				float unit=(float) ((float) (50*1.2)+(float) (50*2.4)+(float) (remainingunits*3.6)+yess*0.1);
				System.out.println("your bill amount is"+unit);
		}
			
			else if(units>150&&units<=200)
			{
				float unit=(float) ((float) (50*1.2)+(float) (50*2.4)+(float) (50*3.6)+(float) (remainingunits*4.8)+yess*0.1);
				System.out.println("your bill amount is"+unit);
				
			}
			else if(units>200)
			{
				float unit=(float) ((float) (50*1.2)+(float) (50*2.4)+(float) (50*3.6)+(float) (50*4.8)+yess*0.1);
			float discount=	unit*(float) 0.5;
			
			if(discount>=200)
			{
				discount=200;
			}
			
			
			System.out.println("your bill is"+discount);
			
			break;
			}
			break;
		}
			
		}
		}
}

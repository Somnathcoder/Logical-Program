package Com.LogicProgram;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no :");
		int Count=0;
		int no = sc.nextInt();
		for (int i = 1; i <=no; i++) {
			
				if (no%i==0) {
					
					Count++;
				
			}
		}
		if (Count==2) {
			System.out.println("This is prime No");
		}else
		{
			System.out.println("NOT A PRIME");
		}
	}

}

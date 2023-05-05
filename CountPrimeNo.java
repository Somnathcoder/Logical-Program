package Com.LogicProgram;

import java.util.Scanner;

public class CountPrimeNo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no :");
		
		int no = sc.nextInt();
		
		int c=0;
		
		int cou=0;
		
		for (int i = 1; i <= no; i++) {
			
			int count=0;
			
			for (int j = 1; j < no; j++) {
				
				if (i%j==0) {
					
					count ++;
					
				}
			}
			if (count==2) {
				c++;
				
				cou=cou+i;
				
				System.out.println(i);
				
			}
		}
		
		System.out.println("The total prime no:"+cou);
		
	}

}

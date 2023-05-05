package Com.LogicProgram;

import java.util.Scanner;

public class Fabonaci {
	public static void main(String[] args) {
		
		int a=0;
		int b =1;
		int c;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no :");
		
		int no = sc.nextInt();
		
		for (int i = 1; i <=no; i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
	}

}

package Com.LogicProgram;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no :");
		int no =sc.nextInt();
		int fact = 1;
		
		for (int i = fact; i <= no; i++) {
			fact = i* fact;
		}
		System.out.println(fact);

	}
}
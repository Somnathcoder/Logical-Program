
package Com.LogicProgram;

public class PalidromeInteger {

	public static void main(String[] args) {

		int no = 1421;

		int so = no;

		int rem , rev = 0;

		while (no != 0) {

			rem = no % 10;

			rev = rev * 10 + rem;

			 no =no/ 10;

		}

		if (so == rev) {
			System.out.println(rev+ " palidrome");
		}else {
			System.out.println(rev+ " Not");
		}

	}

}

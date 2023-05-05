package Com.LogicProgram;

public class PalidromeString {
	
	public static void main(String[] args) {
		

		String name = "madam";
		String rev="";
		String ss= name;
		
		for (int i = name.length()-1; i >=0; i--) {
			
			rev= rev+ name.charAt(i);
					
		}
		
		if (ss.equals(rev)) {
			System.out.println( rev+ " This Is Palidrome String");
			
		}else {
			System.out.println("Not a Palidrome String :" + rev);
		}
		
		
		}
	}




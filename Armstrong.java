package Com.LogicProgram;

public class Armstrong {
	public static void main(String[] args) {
		
		int num=153;
		int rem;
	String a=	String.valueOf(num);
		int c= a.length();
		int sum=0;
		
		while(num>0) {
			
			rem=num%10;
			
			num=num/10;
			sum=(int) (sum+(Math.pow(rem,c)));
			
		}
		System.out.println(sum);
		
}
}
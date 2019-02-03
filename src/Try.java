import java.math.BigInteger;

public class Try {

	
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			   result = result * i;
			}
		return result;
	}
	
	
	public static void main(String[] args) {

		System.out.println("Hello");
		
		int choclates=8, quotient, ways=0 ;
		
		quotient = choclates / 3;
		
			for(int i = 0; i<=quotient ;i++) {
				
				ways = ways + factorial((choclates - 3*(i)) + i)/(factorial(choclates - 3*(i))*factorial(i));
				
			}
			System.out.println(ways);
	}
}
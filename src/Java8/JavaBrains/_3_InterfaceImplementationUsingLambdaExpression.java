/**
 * 
 */
package Java8.JavaBrains;

/**
 * @author Tousif
 *
 */

@FunctionalInterface //So that no one else should add more methods to this interface
interface MyAdd3 {
	int add(int x, int y);
}

public class _3_InterfaceImplementationUsingLambdaExpression {


	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		MyAdd3 myAdd3 = (x,y) -> x+y; //We are implementing just function, not class
		
		System.out.println(myAdd3);
		
		
	}
	//Functional Interface are the Interface with 
	
}

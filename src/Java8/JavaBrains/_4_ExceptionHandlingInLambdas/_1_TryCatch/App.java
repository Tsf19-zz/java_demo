/**
 * 
 */
package Java8.JavaBrains._4_ExceptionHandlingInLambdas._1_TryCatch;

import java.util.function.BiConsumer;

/**
 * @author Tousif
 *
 */
public class App {

	public static void process(int [] someNumbers,int key, BiConsumer<Integer, Integer> consumer){

		for(int i : someNumbers)
			consumer.accept(i, key);
	}

	public static void main(String[] args) {

		int [] someNumbers = {1,2,3,4};
		int key = 0;

		//		process(someNumbers, key, (v, k) -> System.out.println(v/k) );

		process(someNumbers, key, //Code is Ugly Now
				(v, k) -> {
					try {
						System.out.println(v/k);
					}catch(ArithmeticException e) { System.out.println("An ArithmeticException Happened");}
				});
	}

}

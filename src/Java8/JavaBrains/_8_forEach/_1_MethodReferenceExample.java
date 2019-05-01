/**
 * 
 */
package Java8.JavaBrains._8_forEach;

import java.util.Arrays;
import java.util.List;

import Java8.JavaBrains._2_PersonSorting.Java7Way_1_.Person;

/**
 * @author Tousif
 * 
 */

/**
 * void java.lang.Iterable.forEach(Consumer<? super Person> action)
 * 
 * Performs the given action for each element of the Iterable until all elements
 * have been processed or the action throws an exception.
 * Unless otherwise specified by the implementing class,actions are performed
 * in the order of iteration (if an iteration order is specified).
 * Exceptions thrown by the action are relayed to the caller.
 */
public class _1_MethodReferenceExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(

				new Person("firstName1","alastName1",11),
				new Person("firstName2","cblastName2",22),
				new Person("firstName3","calastName3",33),
				new Person("firstName4","CdlastName4",44),
				new Person("firstName5","blastName5",55)
				);
		
		persons.forEach(p -> System.out.println(p));
		//OR
		persons.forEach(System.out::println);
	}
}

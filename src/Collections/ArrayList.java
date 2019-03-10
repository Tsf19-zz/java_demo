/**
 * 
 */
package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tousif
 *
 */
public class ArrayList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println(list);
		// O/P: 1,2,3,4,5,6
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// O/P: 1,2,3,4,5,6
		
	}

}

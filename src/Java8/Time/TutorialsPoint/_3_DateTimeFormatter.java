/**
 * 
 */
package Java8.Time.TutorialsPoint;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Tousif
 *
 */
public class _3_DateTimeFormatter {

	public static void main(String[] args) {
		
		/**@Date_Time_Formatter*/
		
	    /**Will give us the current time and date*/ 
	    LocalDateTime localDateTimeNow = LocalDateTime.now(); 
	    System.out.println("current date and time : "+ localDateTimeNow);
		
	    
	    /**To print in a particular format*/
	    DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
	    System.out.println(format);
	    
	    String formatedDateTime = localDateTimeNow.format(format);   
	     
	    System.out.println("in foramatted manner "+ formatedDateTime);
	}
}

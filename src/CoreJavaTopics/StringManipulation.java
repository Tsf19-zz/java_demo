package CoreJavaTopics;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str1 = " This  is ; a  paragraph  It contains .words,  .and.    sentences, and.separators.";
		String str2, str3, str4, str5, str6, str7;
		
		System.out.println("str1 :"+str1);
		//-This--is-;-a--paragraph--It-contains-.words,--.and.----sentences,-and.separators.
		
		str1 = str1.toLowerCase();
		System.out.println("str1 :"+str1);
		//-this--is-;-a--paragraph--it-contains-.words,--.and.----sentences,-and.separators.
		
		str1 = str1.replaceAll("\\.|\\;|\\," , " ");
		System.out.println("str1 :"+str1);
		//-this--is---a--paragraph--it-contains--words----and-----sentences--and-separators-
		
		str2 = str1.replaceAll("\\s +" , " ");
		System.out.println("str2 :"+str2);
		//-this-is-a-paragraph-it-contains-words-and-sentences-and-separators-
		
		
//		To eliminate spaces at the beginning and at the end of the String, use String.trim() method

		str3 = str1.trim().replaceAll("\\s +" , " ");
		System.out.println("str3 :"+str3+" <--CORRECT");
		//this-is-a-paragraph-it-contains-words-and-sentences-and-separators
		
		
		str4 = str1.trim().replaceAll("( )+" , " "); //SAME OUTPUT
		System.out.println("str4 :"+str4+" <--CORRECT");
		
		
		//WITHOUT TRIM()
		
//		^_+ : any sequence of spaces at the beginning of the string
//		_+$ : any sequence of spaces at the end of the string
//		(_)+ : any sequence of spaces that matches none of the above, meaning it's in the middle
		
		str5 = str1.replaceAll("^ +| +$|( )+" , " ");
		System.out.println("str5 :"+str5);
		//-this-is-a-paragraph-it-contains-words-and-sentences-and-separators-
		
		str6 = str1.replaceAll("^ +| +$|( )+" , "$1");
		System.out.println("str6 :"+str6+" <--CORRECT");
		//this-is-a-paragraph-it-contains-words-and-sentences-and-separators
	
	
		str7 = str1.trim().replaceAll("\\s{2,}" , " ");
		System.out.println("str7 :"+str7+" <--CORRECT");
		
		//https://www.tutorialspoint.com/html/html_url_encoding.htm
		try {
			
			System.out.println("\nString Before Encoding:Mohammed  Tou$if Shekhani%  ");
			//String Before Encoding:Mohammed  Tou$if Shekhani%  
			
			String encoded = URLEncoder.encode(" Mohammed  Tou$if Shekhani%  ", "UTF-8");	
			System.out.println("String After Encoding:"+encoded);
			//String After Encoding:+Mohammed++Tou%24if+Shekhani%25++
			
			String decoded = URLDecoder.decode(encoded, "UTF-8");
			System.out.println("String After Decoding:"+decoded);
			//String After Decoding: Mohammed  Tou$if Shekhani%  
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	}

}

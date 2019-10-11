package CoreJavaTopics;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String str8 = "I [need] this ]message () without (this[])";
		str8 = str8.replaceAll("[\\[\\]\\(\\)]", "");
		System.out.println("str8 :"+str8);
		
		String str9 = "I [need] this ]message () without (this[])".replaceAll("[()\\[\\]]", "");
		System.out.println("str9 :"+str9);
		
		String str10 = "[String]";
		str10 = str10.replaceAll("[\\[\\]]", ""); //The outer [] means: one of the inner symbols
		System.out.println("str10 :"+str10);
		
		String str11 = "[String]";
		str11 = str11.replaceAll("^\\[+|\\]+$", "");
		System.out.println("str11 :"+str11);
		
		String str12 = "[String]";
		str12 = str12.substring(1, str12.length()-1);
		System.out.println("str12 :"+str12);
		
		//String to chop hyphen, hash and space
		String str13 = "Semi-centrifugal clutch#clutchs";
		
		boolean contains1 = str13.contains("-");
		boolean contains2 = str13.contains("#");
		boolean contains3 = str13.contains(" ");
		
		String[] str13Array = str13.split("\\-|\\#|\\ ");
		for(String str : str13Array) {
			System.out.println(str);
		}
		
		
		String regex1 = "(.*[a-zA-Z].*)";
		String regex2 = "(.*[0-9].*)";
		
		List<String> strArr = Arrays.asList("7", "A", "a", "77", "AA", "A7", "7A", "AA77", "7AA7", "A77A", "AAa77", "7AaA7", "A7a7A");
		for(String str : strArr) {
			if((str.matches(regex1) && str.matches(regex2)))
				str = str.toLowerCase();
			System.out.println(str +"\t" + (str.matches(regex1) && str.matches(regex2)));
		}
		
		System.out.println();

		Pattern pattern = Pattern.compile("(([A-Z].*[0-9])|([0-9].*[A-Z]))");
		Matcher matcher = null;
		for(String str : strArr) {
			matcher = pattern.matcher(str);
			
			if(matcher.find())
				str = str.toLowerCase();
			
			System.out.println(str +"\t");
		}

		
//		if(alphaNumeri.matches("^[a-zA-Z0-9]*$"))
//			System.out.println("alphanumeric : " + alphaNumeri.toLowerCase());
		
//		("^{") && ("}+$")
		String s = "{\"customLine.id\":2}";
		if(s.startsWith("{") && s.endsWith("}")) {
			System.out.println("TRUE");
		}
		
	}

}

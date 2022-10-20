package regex;

import java.util.regex.Pattern;

public class RegexEjemploYenlances {

	// http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java
	
	// https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
	
	// https://regex101.com
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//para un dni que (8 numeros + puede haber guión o no + letra de la A a la Z
		
		String regex="\\d{8}-?[A-Z]";
		
		System.out.println(Pattern.matches(regex, "47363883-Y")); //true
		System.out.println(Pattern.matches(regex, "47363883Y")); //true
		System.out.println(Pattern.matches(regex, "473683-Y")); //false
		System.out.println(Pattern.matches(regex, "47363883--Y")); //false
	}

}

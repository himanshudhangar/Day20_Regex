package junittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitRegex {
	
public boolean firstName(String testString) {
		
		String regex="^[A-Z]{1}[a-z]*";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(testString);
		boolean result1=match.find();
		return result1;
	
	
	}
public void ValideLastName() {

	String line="HIManshu";
	   String pattern= "[A-Z]{3}[a-z]+";
	   Pattern pat= Pattern.compile(pattern);
	   Matcher matcher=pat.matcher(line);
	   if(matcher.matches()) {
		   System.out.println("Pattern matches");
	   }else {
		   System.out.println("No Match");
	   }
}
public void ValideEmail() {
	 String line="himanshu12@gmail.com";
	   String pattern= "^[a-z  0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}$";
	   Pattern pat= Pattern.compile(pattern);
	   Matcher matcher=pat.matcher(line);
	   if(matcher.matches()) {
		   System.out.println("Pattern matches");
	   }else {
		   System.out.println("No Match");
	   }
}
	   
}




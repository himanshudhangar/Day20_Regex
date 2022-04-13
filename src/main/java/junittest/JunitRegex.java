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

	String line="Dhangar";
	   String pattern= "[A-Z]{1}[a-z]+";
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
public void  MobileFormat(){
	
	String line="91 8551934902";
	   String pattern= "[0-9]{2} [89]{1}[0-9]{9}";
	   Pattern pat= Pattern.compile(pattern);
	   Matcher matcher=pat.matcher(line);
	   if(matcher.matches()) {
		   System.out.println("Pattern matches");
	   }else {
		   System.out.println("No Match");
	   } 
} 
public void Rule1 (){
	
	String line="Rcpit@123";
	   String pattern= "[A-Z]{1}[a-z]+[@][0-9]{3}";
	   Pattern pat= Pattern.compile(pattern);
	   Matcher matcher=pat.matcher(line);
	   if(matcher.matches()) {
		   System.out.println("Pattern matches");
	   }else {
		   System.out.println("No Match");
	   }
}


}




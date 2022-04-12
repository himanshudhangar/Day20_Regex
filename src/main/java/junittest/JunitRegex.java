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
}



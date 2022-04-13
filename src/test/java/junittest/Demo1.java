package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1 {
JunitRegex t=new JunitRegex();
			
			 @Test
			    public void MatchFirstName() {
			      	boolean result1=t.firstName("Himanshu");
			       	assertEquals(result1,true);	
	}
			 public void ValideLastName() {
			      	boolean result2=t.lastname("Dhangar");
			       	assertEquals(result2,true);		 
}
			 public void ValideEmail() {
			      	boolean result3=t.Emailid("himanshu12@gmail.com");
			       	assertEquals(result3,true);	
}
}
			

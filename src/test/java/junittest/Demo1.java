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
			      	boolean result1=t.firstName("Himanshu");
			       	assertEquals(result1,true);		 
}
}



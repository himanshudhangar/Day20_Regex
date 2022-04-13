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
			      	boolean result2=t.firstName("Dhnagar");
			       	assertEquals(result2,true);		 
}
			 public void ValideEmail() {
			      	boolean result3=t.firstName("himanshu12@gnail.com");
			       	assertEquals(result3,true);	
}
			 public void MobileFormatl() {
			      	boolean result4=t.firstName("91 8551934902");
			       	assertEquals(result4,true);		 
}
			 public void Rule1() {
			      	boolean result5=t.firstName("Rcpit@123");
			       	assertEquals(result5,true);		
}
			 public void Uppercase1() {
			      	boolean result6=t.firstName("Abcd");
			       	assertEquals(result6,true);	
}
			 public void UseNumeric() {
			      	boolean result7=t.firstName("rcp12");
			       	assertEquals(result7,true);	
}
}

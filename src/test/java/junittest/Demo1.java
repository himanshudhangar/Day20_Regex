package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1 {
JunitRegex t=new JunitRegex();
			@Test
			public void test() {
			
			int act=t.sum(10,20);
			int result=30;
			assertEquals(result,act);
			}
			 @Test
			    public void MatchFirstName() {
			      	boolean result1=t.firstName("Himanshu");
			       	assertEquals(result1,true);

		
	}
}



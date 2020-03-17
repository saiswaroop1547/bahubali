package UnitTest;

import org.junit.Test;

public class Mytest
	{
	@Test(expected= ArithmeticException.class)
	public void testException()
	{
		int a=10,b=0,c=a/b;
		System.out.println(c);
		String str="Hello";
		System.out.println(str.charAt(9));
	}
	}

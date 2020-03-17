package UnitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class Example 
{
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	@Ignore
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@Test(timeout=3000)
	public void test1()
	{
		System.out.println("test1");
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	@After
	public void after()
	{
		System.out.println("After");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
}

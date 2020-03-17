package UnitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(MonkeyTests.class)
public class test2 
{
	@Category(LoadTests.class)
	@Test
	public void junit1Test()
	{
		System.out.println("this is my LoadTests testcase");
	}
	@Category(MonkeyTests.class)
	@Test
	public void junit1Test1()
	{
		System.out.println("this is my MonkeyTests testcase1");
	}
}
package UnitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(LoadTests.class)
public class Test1
{
	@Category(LoadTests.class)
	@Test
	public void test()
	{
		System.out.println("this is my load tests testcase");
	}
	@Category(MonkeyTests.class)
	@Test
	public void test1()
	{
		System.out.println("this is my monkey tests testcase1");
	}
}

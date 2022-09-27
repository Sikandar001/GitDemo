package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1A {
	@Test
	public void demo()
	{
		System.out.println("Day1A------Hello");
	}
	@Test(groups={"sikku"})
	public void demo1()
	{
		System.out.println("Day1A ,hi guys");
	}
	@BeforeTest
	public void before()
	{
		System.out.println("Before1A");
	}
}

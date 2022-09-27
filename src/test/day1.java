package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
@Test
public void demo()
{
	System.out.println("Day1--Hello");
}
@Test
public void demo1()
{
	System.out.println("Day1 ,hi guys");
}
@Test
public void home()
{
	System.out.println("home");
}
@Test(groups={"sikku"})
public void demo2()
{
	System.out.println("Day1. guys"+(2+2));
}
@AfterTest
public void before()
{
	System.out.println("After_1");
}


}

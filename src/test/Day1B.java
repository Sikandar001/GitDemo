package test;

import org.testng.annotations.Test;

public class Day1B {
@Test
public void loanForCar()
{
	System.out.println("car loan");
}
@Test
public void loanForhome()
{
	System.out.println("home loan");
}
@Test(groups={"sikku"})
public void demo3()
{
	System.out.println("this is demo3");
}
}

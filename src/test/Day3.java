package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day3 {
	@Parameters({"urlss"})
	@Test
	public void demoDay3(String nn)
	{
		System.out.println("Day1--Hello");
		System.out.println(nn);
	}
}

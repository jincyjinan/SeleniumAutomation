package webdrivers;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class samplgrp 
{
	@Parameters("s")
	@Test
	public void atest(String s)
	{
		System.out.println(s);
	}

}

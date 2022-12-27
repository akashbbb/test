package seleniumf;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 
{
@Test(invocationCount = 2,priority = 1)
public void demo()
{
Reporter.log("Chandan",true);	
	}
@Test(enabled = false)
public void demo1()
{
Reporter.log("savita",true);	
	}
}

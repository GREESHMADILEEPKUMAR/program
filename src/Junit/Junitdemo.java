package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo 
{
ChromeDriver driver;
String baseurl="https://www.swapnasilks.com/";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void titleverification()
{
	String exp="Swapna";
	String actualtitle=driver.getTitle();
	if(actualtitle.equals(exp))
		{
		System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		}
@After
public void tearDown()
{
	driver.quit();
}
}

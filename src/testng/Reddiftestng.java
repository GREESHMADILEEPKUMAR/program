package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddiftestng 
{
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void get() 
{
	driver.get(baseurl);
}
@Test(groups= {"smoke"})
public void title_verification() 
{
	String exp="Rediffmail Free Unlimited Storage";
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
@Test (groups= {"regression"}) 
public void logo_display() 
{
	boolean Logo =driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
    if (Logo)
    {
       System.out.println("Logo present");
    }
    else 
    {
       System.out.println("Logo not present");
    }
}
//@Test
//public void button_verify() 
//{
	//driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
	
//}

@Test(groups= {"smoke"})
public void content_verification()
{
	String src=driver.getPageSource();
	if(src.contains("Full Name"))
	{
		System.out.println("full name label present");
	}
	else
	{
		System.out.println("Full name absent");
	}
}

@Test(groups={"Smoke"})
public void button_text_verify()
{
	String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	if(buttontext.equals("Create my account >>"))
	{
		System.out.println("button enbled");
	}
	else
	{
		System.out.println("button disabled");
	}

}
@AfterMethod
public void quit()
{
	System.out.println("close browser");
}
}

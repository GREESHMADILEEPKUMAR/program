package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexcesise 
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.get("https://automationexercise.com/signup");
		WebElement uname=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		uname.sendKeys("GreeshmaDileep");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("greeeeeema@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		//WebElement Mr=driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		WebElement Mrs=driver.findElement(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
		Mrs.click();
		if (Mrs.isSelected()) {					
            System.out.println("other Checkbox is Toggled Off");					

        } else {			
            System.out.println("Female's Gender Checkbox is Toggled on");					
        }		
       WebElement name= driver.findElement(By.id("name"));
       //String s= uname.getAttribute("GreeshmaDileep");
       if(name.isDisplayed())
       {
    	   System.out.println("The name is valid " );
       }
       else
       {
    	   System.out.println("The name is invalid");
       }
       WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
       email.getText();
       String s=email.getText();
       System.out.println(s);
       if(s=="greeeeeema@gmail.com")
       {
    	   System.out.println("Email id is valid");
       }
       else
       {
    	   System.out.println("Emailid is not valid");
       }
       WebElement pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
       pwd.sendKeys("gREE236");
       if(pwd.isDisplayed()) 
       {
    	   System.out.println( "Your password is  masked!");
       }
       WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));   
       Select daydetails=new Select(day);
       daydetails.selectByValue("22");
       WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
       Select monthdetails=new Select(month);
       monthdetails.selectByValue("5");
       WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
       Select yeardetails=new Select(year);
       yeardetails.selectByValue("1996");
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,250)", "");
       WebElement subs=driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
       subs.click();
       WebElement subs1=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[7]/label"));
       subs1.click();
       driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Greeshma");
       driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Dileep Kumar Suma");
       driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Luminar Technolab");
       driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Muweilah sharjah, PO BOX");
       driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Alappuzha");
       WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
       Select countrydetails=new Select(country);
       countrydetails.selectByVisibleText("Singapore");
       driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
       driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Kaymakulam");
       driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("236588");
       driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9635876243");
       JavascriptExecutor js1 = (JavascriptExecutor) driver;
       js1.executeScript("window.scrollBy(0,250)", "");
       driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
       //driver.close();
       }

	}

    	   
       


import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) 
	{
		//Chromedriver 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.swapnasilks.com/");
		
		String expectedTitle = "Home | Swapna Silks";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) 
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		driver.quit();		
	}

}

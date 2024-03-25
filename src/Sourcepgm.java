import org.openqa.selenium.chrome.ChromeDriver;

public class Sourcepgm 
{

	public static void main(String[] args) 
	{
		String baseurl="https://www.swapnasilks.com/";
		ChromeDriver driver= new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		//GetPageSource()
		if(src.contains("Tops"))
		{
			System.out.println("Present");
		}
		else 
		{
		System.out.println("Absent");
		}
		driver.quit();
	}

}

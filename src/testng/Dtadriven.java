package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dtadriven 
{
	WebDriver driver;
	@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
}
@Test
public void datadriven() throws IOException
{
	driver.get("https://www.facebook.com");
	FileInputStream fi=new FileInputStream("C:\\Users\\Rahul\\Documents\\Book1.xlsx");
	@SuppressWarnings("resource")
	XSSFWorkbook eb=new XSSFWorkbook(fi);//returns workbook details
	XSSFSheet sh= eb.getSheet("Sheet1");//returns sheet details
	int rowcount=sh.getLastRowNum();//returns rowcount
	System.out.println(rowcount);
	for(int i=1;i<=rowcount;i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username=" +username);
		String pwd=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("password=" +pwd);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.navigate().refresh();
		//getcurrenturl is used for login validation
	}
	
	
}
}

package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fleupoadrobot
{
ChromeDriver driver;
String url="https://www.ilovepdf.com/word_to_pdf";

@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.get(url);
}
@Test
public void fuploadmethd()throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click(); //button click
	fileUpload("\"C:\\Users\\Rahul\\Downloads\\Coverlettergreeshma.docx\"");
}
public void fileUpload (String p) throws AWTException
{
	StringSelection strsel=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsel,null);
	Robot robot=  new Robot();
	
	robot.delay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	robot.delay(2000);
}
}

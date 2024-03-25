package Junit;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totallinkcount 
{
String url="https://www.google.com/";
ChromeDriver driver;

@Before
public void setup(){
	driver=new ChromeDriver();
	driver.get(url);
	
}
@Test
public void linkvalidation() throws Exception
{
	List<WebElement> li=driver.findElements(By.tagName("a")); //tagname returns all detaila 
			System.out.println("count" +li.size()); //count of all links /details //li is the name of list //webelement is strd in all index of link
	for(WebElement element: li)// to get 1/1 value frm array
	{
		String link=element.getAttribute("href");
		verify(link); // method through link validation
	}
}
public  void verify(String link) throws Exception
{
	URL u=new URL(link);//url objct create through constrctr
	HttpURLConnection con=(HttpURLConnection)u.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("response code is successfull");
	}
	else
	{
		System.out.println("not expected");
	}
}}



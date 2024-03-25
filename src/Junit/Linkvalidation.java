package Junit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation
{
String link="https://www.google.com/";

@Test
public void test() throws IOException
{
	
		URL u = new URL(link);
		
	HttpURLConnection con=(HttpURLConnection)u.openConnection();
	int code=con.getResponseCode();
    System.out.println(code);	
	
	if(code==200)
	{
		System.out.println("response code 200 is successful");
	}
	else
	{
		System.out.println("not expected");
	}
	
	}
}
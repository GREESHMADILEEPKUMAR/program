package testng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo 
{
@BeforeTest
public void setup()
{
	System.out.println("Open the browser");
}
@BeforeMethod //code that is before each test activities -test 1--befremethd-test2-aftermthd-test3-aftertest
public void URLloading()
{
	System.out.println("Loading URL");
}
@Test(priority = 1,invocationCount =3)
public void test1()
{
	System.out.println("TESTing1");
}
@Test 
public void test2()
{
	System.out.println("TESTing 2");
}
@Test(priority = 2,enabled=false)
public void test3()
{
	System.out.println("TESTing 3");
}
@AfterMethod
public void quit()
{
	System.out.println("close browser");//execution passed after 1st test//report details//back to before method then test then after test
}

}

package seleniumf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class assert1 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("8553975540");
	driver.findElement(By.name("pass")).sendKeys("kannadiga");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String tit = driver.getTitle();
	System.out.println(tit);
	SoftAssert as = new SoftAssert();
	as.assertEquals(tit, "Face");
	System.out.println("5");
	driver.quit();
}
}

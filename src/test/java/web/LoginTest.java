package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
WebDriver driver;
	
	@BeforeTest
	public void setup(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SPARTEN\\Desktop\\workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();
	}


     @Test
     public void doLogin(){
	driver.get("http://facebook.com");
	
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("manisha.shelke123@gmail.com");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("mani@Prafull");
	driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	//element=driver.findElement(By.xpath(".//*[@id='pass']"));
	//element.click();
	}
	
     @AfterTest
     public void closeDriver(){
    	 driver.close();
     }
	

}

package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 
{
	@Test
	public void TestOne()
	{	
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
		}

	}

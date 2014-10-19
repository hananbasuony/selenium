package mytestpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fadi {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com");
	driver.findElement(By.id("Email")).sendKeys("jetsetterface@gmail.com");
	driver.findElement(By.id("Passwd")).sendKeys("jetsetter");
	driver.findElement(By.id("signIn")).click();
	}


package mytestpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rawa {
       public static void main(String[] args){
              WebDriver driver = new FirefoxDriver();
              driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1");
              driver.findElement(By.id("Email")).sendKeys("jetsetterface@gmail.com");
                driver.findElement(By.id("Passwd")).sendKeys("jetsetter");
              driver.findElement(By.id("signIn")).click();
}
} 


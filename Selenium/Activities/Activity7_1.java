package Selenium_Activities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		String title=driver.getTitle();
		System.out.println("Pagetitle is: " +title);
		driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[contains(text(),'Welcome Back, admin')]"), "Welcome Back, admin"));
	   String loginmessage=driver.findElement(By.id("action-confirmation")).getText();
	   System.out.println("Login message is: "+loginmessage);
		driver.close();
		
		

	}

}

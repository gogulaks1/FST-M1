package Selenium_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/simple-form");
		String title=driver.getTitle();
		WebElement Fname=driver.findElement(By.id("firstName"));
		WebElement Lname=driver.findElement(By.id("lastName"));
		Fname.sendKeys("abc");
		Lname.sendKeys("nnc");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abcdef@gmail.com");
		WebElement number=driver.findElement(By.id("number"));
		number.sendKeys("1111111111");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Submitted");
		Thread.sleep(1000);
	    driver.close();
        
        
        
        


	}

}

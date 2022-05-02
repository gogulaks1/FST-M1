package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String title=driver.getTitle();
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//*[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String loggedin=driver.getTitle();
		System.out.println("login page is " +loggedin);
		Assert.assertEquals(loggedin, "My Account – Alchemy LMS");
		driver.close();
		


	}

}

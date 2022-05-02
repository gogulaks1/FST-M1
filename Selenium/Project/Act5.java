package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String title=driver.getTitle();
		System.out.println("title is " +title);
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		String myacctitle=driver.getTitle();
		System.out.println("myaccount title is " +myacctitle);
		Assert.assertEquals(myacctitle, "My Account – Alchemy LMS");
		driver.close();

	}

}

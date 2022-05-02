package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String title=driver.getTitle();
	    System.out.println("page title is: " +title);
		String heading=driver.findElement(By.xpath("//h1[contains(text(),'Learn from Industry Experts')]")).getText();
		System.out.println("page header is:" +heading);
		Assert.assertEquals(heading, "Learn from Industry Experts");
		driver.close();

	}

}

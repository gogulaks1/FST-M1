package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String title=driver.getTitle();
		System.out.println("page title is: " +title);
		String secondcourse=driver.findElement(By.xpath("//*[@class='entry-title' and (contains(text(),'Email Marketing Strategies'))]")).getText();
		System.out.println("secondcourse is " +secondcourse);
        Assert.assertEquals(secondcourse, "Email Marketing Strategies");
        driver.close();
	}

}

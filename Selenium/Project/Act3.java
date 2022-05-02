package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String title=driver.getTitle();
		System.out.println("page title is: " +title);
		String firstinfobox=driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]")).getText();
		System.out.println("title of firstinfobox is: " +firstinfobox);
		Assert.assertEquals(firstinfobox, "Actionable Training");
		driver.close();
		

	}

}

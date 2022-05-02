package LMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String title=driver.getTitle();
		driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
		List<WebElement> allcourses=driver.findElements(By.xpath("//h3"));
		System.out.println("Courses available are " +allcourses.size());
		for (WebElement coursesare : allcourses) {
		System.out.println(coursesare.getText());
		driver.close();
		}
	}

}

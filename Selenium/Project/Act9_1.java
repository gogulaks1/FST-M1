package LMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act9_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
		String course= driver.findElement(By.xpath("//h3[contains(text(),'Social Media Marketing')]")).getText();
		System.out.println("Course selected is: " +course);
		Assert.assertEquals(course, "Social Media Marketing");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='post-69']/div[2]/p[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ld-expand-83\"]/div[1]/div/div/span[2]")).click();
		WebElement lessoncontent=driver.findElement(By.xpath("//div[@class='ld-table-list-item' and @id='ld-table-list-item-175']"));
		if((lessoncontent.isSelected())){
			lessoncontent.click();
		}
		else {
	
			System.out.println("Button disabled");
			
		}
     driver.close();
	}

}

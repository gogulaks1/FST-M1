package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
		String course= driver.findElement(By.xpath("//*[@id='post-71']//div[2]//h3")).getText();
		System.out.println("course selected is: " +course);
		Assert.assertEquals(course, "Email Marketing Strategies");
		driver.findElement(By.xpath("//*[@id=\'post-71\']/div[2]/p[2]/a")).click();
		WebElement lesson=driver.findElement(By.xpath("//*[@id='ld-expand-91']"));
		if((lesson).isSelected()){
			lesson.click();
		}
		else
		{
			System.out.println("button diabled");
		}
		
		driver.close();
		}
		
		
		
	
		

	}



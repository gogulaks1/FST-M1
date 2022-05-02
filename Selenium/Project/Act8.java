package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.xpath("//*[@id='menu-item-1506']")).click();
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_0']")).sendKeys("asha");
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_1']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_2']")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id='wpforms-submit-8']")).click();
       String message=driver.findElement(By.xpath("//*[@id='wpforms-confirmation-8']/p")).getText();
       System.out.println("message displayed after submitting request is " +message);
       Assert.assertEquals(message, "Thanks for contacting us! We will be in touch with you shortly");
       driver.close();
        
        
        
        
        
        
	}

}

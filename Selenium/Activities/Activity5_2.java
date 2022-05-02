package Selenium_Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title=driver.getTitle();
        System.out.println("Page title is: "+title );
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("checkbox available:" +checkbox.isSelected());
        checkbox.click();

//        if(checkbox.isSelected()) {
//        	System.out.println("checkbox is available");
//        }
//        else {
//        	System.out.println("checkbox is not available");
//        }
      // driver.findElement(By.xpath("//*[@id='toggleCheckbox']")).click();
       System.out.println("checkbox available:" +checkbox.isSelected());
       
//        if(checkbox.isSelected()) {
//        	System.out.println("checkbox is available");
//        }
//        else {
//        	System.out.println("checkbox is not available");
//        }
        
 
       driver.close();
	}
	

}

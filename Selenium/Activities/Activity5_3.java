package Selenium_Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title=driver.getTitle();
        System.out.println("Page title is: "+title );
        WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
//        System.out.println("textbox available:" +textbox.isEnabled());
//       
//        driver.findElement(By.xpath("//*[@id='toggleInput']")).click();
//
////        if(checkbox.isSelected()) {
////        	System.out.println("textbox is available");
////        }
////        else {
////        	System.out.println("textbox is not available");
////        }
//      // driver.findElement(By.xpath("//*[@id='toggleCheckbox']")).click();
//       System.out.println("textbox available:" +textbox.isEnabled());
//       
//        if(checkbox.isSelected()) {
//        	System.out.println("checkbox is available");
//        }
//        else {
//        	System.out.println("checkbox is not available");
//        }
        System.out.println("The checkbox is selected: " + textbox.isEnabled());
    	
        
    	
        driver.findElement(By.id("toggleInput")).click();
	
 
	
        //Print status
	
        System.out.println("The checkbox is selected: " + textbox.isEnabled());
	
 
 
       driver.close();
	}
	

}

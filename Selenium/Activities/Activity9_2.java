package Selenium_Activities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://training-support.net/selenium/selects ");
        WebElement text=driver.findElement(By.id("multi-value"));
        Select multilist=new Select(driver.findElement(By.id("multi-select")));
        if(multilist.isMultiple()) {
         multilist.selectByVisibleText("Javascript");
         System.out.println(text.getText());
         multilist.selectByValue("node");
         System.out.println(text.getText());
        }
      for(int i=4;i<=6;i++) {
    	  multilist.selectByIndex(i);
      }
      multilist.deselectByValue("node");
      System.out.println(text.getText());
      multilist.deselectByIndex(7);
      System.out.println(text.getText());
      List<WebElement>selectedoptions=multilist.getAllSelectedOptions();
      for(WebElement selectedoption:selectedoptions) {
    	  System.out.println("selectedoption: " +selectedoption.getText());
      }
      multilist.deselectAll();
      System.out.println(text.getText());
      driver.close();
      
	}
	}

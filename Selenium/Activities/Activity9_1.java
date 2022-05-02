package Selenium_Activities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://training-support.net/selenium/selects");
        WebElement text=driver.findElement(By.id("single-value"));
        Select dropdown=new Select(driver.findElement(By.id("single-select")));
        dropdown.selectByVisibleText("Option 2");
        System.out.println(text.getText());
        dropdown.selectByIndex(3);
        System.out.println(text.getText());
        dropdown.selectByValue("4");
        System.out.println(text.getText());
        List<WebElement> dropdownoptions=dropdown.getOptions();
        for(WebElement option: dropdownoptions ) {
        System.out.println("Option: " + option.getText());
        	
        }

	
        driver.close();
        	
        
	}

}

package Selenium_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://www.training-support.net");
        String pagetitle=driver.getTitle();
        System.out.println("pagetitle is:" +pagetitle);
        WebElement idloc=driver.findElement(By.id("about-link"));
        System.out.println("Locid: " +idloc.getText());
        WebElement classNameLocator = driver.findElement(By.className("green"));
    	System.out.println("Text in element: " + classNameLocator.getText()); 
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
    	System.out.println("Text in element: " + cssLocator.getText());
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());
        driver.close();
	}

}

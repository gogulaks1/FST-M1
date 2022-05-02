package LMS;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Act1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();	
		driver.get("https://alchemy.hguy.co/lms");
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
		String ActualTitle=("Alchemy LMS – An LMS Application");
		Assert.assertEquals(pagetitle, ActualTitle);
	    driver.close();
     
	}

}

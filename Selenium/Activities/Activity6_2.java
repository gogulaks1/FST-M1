package Selenium_Activities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/ajax");
        String title=driver.getTitle();
        System.out.println("Page title is: " +title);
        WebElement changecontentbutton=driver.findElement(By.xpath("//*[contains(text(),'Change Content')]"));
        changecontentbutton.click();
       
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
        String text= driver.findElement(By.xpath("//*[@id=\'ajax-content\']")).getText();
        System.out.println(text);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        String newtext= driver.findElement(By.xpath("//*[@id=\'ajax-content\']/h3")).getText();
        System.out.println(newtext);
        driver.close();
	}

}

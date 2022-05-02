package Selenium_Activities;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://training-support.net/selenium/tables");
      List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr/td[1]"));
      List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr"));
      System.out.println("Now of rows: " +rows.size());
      System.out.println("Now of columns: " +columns.size());
    //  String thirdrow=driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[3]")).getText();
     // System.out.println("Third row details are: " +thirdrow);
      List<WebElement> thirdrow=driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[3]"));
      for(WebElement cellvalues: thirdrow) {
    	  System.out.println("Cell Value: " + cellvalues.getText());
    	  
      }
      //Cell value of second row, second column
  	
      WebElement cellValue2 = driver.findElement(By.xpath("//*[@id=\'sortableTable\']/tbody/tr[2]/td[2]"));
	
      System.out.println("Second row, second column value: " + cellValue2.getText());
	

	
      //Close browser
	
      driver.close();

}
}

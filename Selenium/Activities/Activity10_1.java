package Selenium_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new FirefoxDriver();
    Actions actions=new Actions(driver);
    driver.get("https://www.training-support.net/selenium/input-events");
    String pagetitle=driver.getTitle();
//    WebElement cube = driver.findElement(By.id("wrapD3Cube"));
//    actions.click(cube);
//    WebElement cube1=driver.findElement(By.className("active"));
//    System.out.println("Leftclick: " +cube1.getText());
//    actions.doubleClick(cube).perform();
//    cube1=driver.findElement(By.className("active"));
//    System.out.println("Doublelick: " +cube1.getText());
//    actions.contextClick(cube).perform();
//    cube1=driver.findElement(By.className("active"));
//    System.out.println("Rightclick: " +cube1.getText());
//    driver.close();
//    
    
    
    
    WebElement cube = driver.findElement(By.id("wrapD3Cube"));
	
    
	
    //Left click

    actions.click(cube);

    WebElement cubeVal = driver.findElement(By.className("active"));

    System.out.println("Left Click: " + cubeVal.getText());



    //Double click

    actions.doubleClick(cube).perform();

    cubeVal = driver.findElement(By.className("active"));

    System.out.println("Double Click: " + cubeVal.getText());

    

    //Right click        

    actions.contextClick(cube).perform();

    cubeVal = driver.findElement(By.className("active"));

    System.out.println("Right Click: " + cubeVal.getText());



    //Close browser

    driver.close();
    
    
	}

}

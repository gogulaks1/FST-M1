package Selenium_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver= new FirefoxDriver();
    driver.manage().window().maximize();
    Actions actions=new Actions(driver);
    String pressedKeyText;
    driver.get("https://www.training-support.net/selenium/input-events");
    String title=driver.getTitle();
    WebElement pressedKey=driver.findElement(By.id("keyPressed"));
    Action actionsequence1=actions.sendKeys("K").build();
    actionsequence1.perform();
    pressedKeyText=pressedKey.getText();
    System.out.println("Pressed key is: " + pressedKeyText);
    Action actionSequence2 = actions
    		
            .keyDown(Keys.CONTROL)

            .sendKeys("a")

            .sendKeys("c")

            .keyUp(Keys.CONTROL)

            .build();

    actionSequence2.perform();

    pressedKeyText = pressedKey.getText();

    System.out.println("Pressed key is: " + pressedKeyText);



    //Close browser

    driver.close();
	}

}

package webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyToInput {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///Users/shiqiu/Developer/Eclipse/workspace/Learn-WebDriver/src/com/packt/webdriver/chapter2/SendKeyToInput.html");
		WebElement t1 = driver.findElement(By.id("fname"));
		WebElement t2 = driver.findElement(By.id("tarea"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(t1).sendKeys("abcde");
		builder.moveToElement(t2).sendKeys("fffff");
		builder.perform();
	}
}

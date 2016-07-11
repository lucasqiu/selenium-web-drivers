package webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/shiqiu/Developer/Eclipse/workspace/Learn-WebDriver/src/com/packt/webdriver/chapter2/DragAndDrop.html");
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement trgt = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, trgt).perform();
	}
}

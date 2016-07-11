package webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/shiqiu/Developer/Eclipse/workspace/Learn-WebDriver/src/com/packt/webdriver/chapter2/DoubleClick.html");
		WebElement dblClick = driver.findElement(By.name("dblClick"));

		Actions builder = new Actions(driver);
		builder.doubleClick(dblClick).perform();
	}
}

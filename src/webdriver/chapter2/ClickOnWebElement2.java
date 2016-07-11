package webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnWebElement2 {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/shiqiu/Developer/Eclipse/workspace/Learn-WebDriver/src/com/packt/webdriver/chapter2/Selectable.html");
		WebElement one = driver.findElement(By.name("one"));
		WebElement eleven = driver.findElement(By.name("eleven"));
		WebElement five = driver.findElement(By.name("five"));

		Actions builder = new Actions(driver);
		// Click on One, Eleven and Five
		builder.click(one).click(eleven).click(five);
		builder.build().perform();
	}
}
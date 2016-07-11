package webdriver.chapter4;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AddExtensionToProfile {
	public static void main(String... args){
		FirefoxProfile profile = new FirefoxProfile();
		System.out.println(System.getProperty("user.dir"));
		try {
			profile.addExtension(new File("./src/webdriver/chapter4/firebug-1.12.0-fx.xpi"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FirefoxDriver driver = new FirefoxDriver(profile);	
	}
}

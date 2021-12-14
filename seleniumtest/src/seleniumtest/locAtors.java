package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locAtors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver./chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("file:///D:/cs/Selenium/html/locators.html");
	     driver.findElement(By.tagName("a")).click();
	     driver.navigate().back();
	     driver.findElement(By.className("c3")).click();
	     
	}

}

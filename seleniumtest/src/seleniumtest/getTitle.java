package seleniumtest;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	

	public static void main(String[] args)throws java.lang.ClassNotFoundException, InterruptedException{

	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	WebDriver driver= new ChromeDriver();

	 String baseUrl = "http://demo.guru99.com/test/newtours/";
     String expectedTitle = "Welcome: Mercury Tours";
     String actualTitle = "";
     driver.get(baseUrl);
     actualTitle = driver.getTitle();
     if (actualTitle.contentEquals(expectedTitle)){
         System.out.println("Test Passed!");
     } else {
         System.out.println("Test Failed");
     }
     Thread.sleep(5000);
     driver.close();

	}
}
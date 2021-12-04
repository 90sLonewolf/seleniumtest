package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkTitle {
	
	public static void main(String[] args)throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	
	String title=driver.getTitle();
			System.out.println("The Title of the site is :"+title);
			Thread.sleep(3000);
			driver.close();
	
	}

}

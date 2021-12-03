package seleniumtest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		String key = ("webdriver.chrome.driver");
		String value=("./driver/chromedriver.exe");
		
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/whiteboard.htm");
		Thread.sleep(5000);
		driver.close();

	}

}

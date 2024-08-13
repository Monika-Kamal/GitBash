package practice_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //sample page example
//		 driver.get("file:///C:/Users/flyin/OneDrive/Desktop/samplepage.html");
//		 List<WebElement> Elements = driver.findElements(By.tagName("input"));
//		 for(WebElement e : Elements) {
//			 e.sendKeys("MONI");
		 //DemoWebShop page Example
		 driver.get("https://demowebshop.tricentis.com/");
		 List<WebElement> Links = driver.findElements(By.tagName("a"));
		 for(WebElement link : Links) {
			 String demolinks = link.getText();
			 System.out.println(demolinks);
		 }
//		 }
		 Thread.sleep(2000);
		 driver.quit();
		

	}

}

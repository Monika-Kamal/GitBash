package practice_package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		
		//To switch to childWindows we need to do for loop
		for(String window :childWindow ) {
			driver.switchTo().window(window);
			Thread.sleep(2000);
			if(driver.getTitle().contains("Facebook")) // to confirm whether we are in the facebook page
			{
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("moni123@gmail.com");
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}

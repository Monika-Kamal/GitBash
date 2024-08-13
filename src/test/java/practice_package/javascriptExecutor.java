package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('small-searchterms').value = 'mobiles' ; ");
		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click();",searchbtn);
		Thread.sleep(2000);
		
		
				
	}

}

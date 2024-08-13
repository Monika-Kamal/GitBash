package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openShadowRoot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		//driver.findElement(By.linkText("UI Testing Concepts")).click();
		
		driver.findElement(By.xpath("//section[contains(text(),'Shadow')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow Root')])[2]")).click();
		Thread.sleep(2000);
		//identifying the shadow host--> the one above the #shadow-root(open)
		SearchContext shadow_host = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();//getting the shadow root path(//form/div[1] by using getShadowRoot()method
		shadow_host.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Monika");
		SearchContext shadow_host1 = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		shadow_host1.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Monimatt@09");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']"));
		driver.quit();
		

	}

}

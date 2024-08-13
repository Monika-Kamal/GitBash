package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException   {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		//Enter value and click on search
		//driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("mobiles");
		driver.findElement(RelativeLocator.with(By.xpath("//input[@type='submit']")).toRightOf(By.tagName("input"))).click();
		//driver.switchTo().alert().accept();
		
		
		//Radio buttons
		//driver.findElement(RelativeLocator.with(By.name("pollanswers-1")).above(By.id("pollanswers-2"))).click();
		//driver.findElement(RelativeLocator.with(By.id("pollanswers-2")).below(By.name("pollanswers-1"))).click();
//		driver.findElement(RelativeLocator.with(By.linkText("Register")).near(By.linkText("Log in"))).click();
//		driver.findElement(By.name("Gender")).click();
//		driver.findElement(By.id("FirstName")).sendKeys("Monika");
//		driver.findElement(By.id("LastName")).sendKeys("Mathew");
//		driver.findElement(By.id("Email")).sendKeys("moni1123@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Monimatt@09");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("Monimatt@09");
//		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}
}

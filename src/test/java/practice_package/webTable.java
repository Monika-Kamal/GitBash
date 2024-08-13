package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/flyin/OneDrive/Desktop/webtable.html");
		 String pen = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
		 System.out.println(pen);
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}

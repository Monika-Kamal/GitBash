package practice_package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takesScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./Screenshots/errors.png");
		FileHandler.copy(temp, src);
		WebElement Text = driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]"));
		File temp1=Text.getScreenshotAs(OutputType.FILE);
		File src1 = new File("./Screenshots/errors1.png");
		FileHandler.copy(temp1, src1);
		driver.quit();
		
	}

}

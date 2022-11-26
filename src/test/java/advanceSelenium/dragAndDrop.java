package advanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.xpath("//img[@style='width: 120px;heigh:120px']"));
		
		WebElement to = driver.findElement(By.xpath("//div[@class='dragged']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(from, to).perform();
		
		
		//driver.close();
		
		
		
		
		
		
	

	}

}

package week4.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhonePrice {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);	
		List<WebElement> Price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement webElement : Price) {
			webElement.getText();
			System.out.println(webElement.getText());		
		
		}

	}

}

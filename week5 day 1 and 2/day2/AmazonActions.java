package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement sD=driver.findElement(By.xpath("//a[text()='Conditions of Use']"));
		Actions act=new Actions(driver);
		act.scrollToElement(sD).perform();
		//get the text
		String linkText=sD.getText();
		System.out.println("Text of Link:"+linkText);

	}

}

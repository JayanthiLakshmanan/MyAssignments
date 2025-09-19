package week5.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class ERail {
	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebElement from=driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MAS");
	from.sendKeys(Keys.ENTER);
	WebElement to=driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("MDU");
	to.sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("(//input[@id='chkSelectDateOnly'])")).click();
	
	
	List<WebElement> trainName=driver.findElements(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2])"));
	
	for (WebElement iter:trainName) {
		
		
		
		System.out.println(iter.getText());
		
	}
		
	}
}
	




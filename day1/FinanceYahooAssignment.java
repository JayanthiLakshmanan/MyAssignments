package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahooAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//load url
		driver.get("https://finance.yahoo.com/");
		//mouse hover on more 
		WebElement mo=driver.findElement(By.xpath("//span[text()='More']"));
		Actions act=new Actions(driver);
		act.moveToElement(mo).perform();			
		//click on Crypto
		driver.findElements(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr/td[2]"));
		driver.findElement(By.xpath("//a[@aria-label='Finance: Crypto']")).click();
		//list the names
		List<WebElement> CompanyName=driver.findElements(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr/td[2]"));
		System.out.println("Company Names:");
		//loop through rows and column
		for (WebElement iter:CompanyName) {	
			
			
			System.out.println(iter.getText());
		}
		
		
		
	}
}
		

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class XPath {
	
		public static void main(String[] args) {
		
			ChromeOptions options=new ChromeOptions();
			options.addArguments("guest");
			ChromeDriver driver=new ChromeDriver(options);
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.id("USERNAME")).sendKeys("demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("Testleaf");
			driver.findElement(By.xpath("//input[@name='createLeadForm_firstName']")).sendKeys("Jayanthi");
		}


}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		String title=driver.getTitle();
		driver.manage().window().maximize();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.name("accountName")).sendKeys("TestAccount123");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("100");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.linkText("Create Account")).click();
		System.out.println("Page Title:"+driver.getTitle());
		driver.close(); 
		
		

	}

}

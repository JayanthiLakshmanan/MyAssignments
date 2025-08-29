package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		String title=driver.getTitle();
		driver.manage().window().maximize();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaftaps");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayanthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys( "Lakshmanan");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("My First CreateLead assignment");
		driver.findElement(By.className("smallSubmit")).click();
		

		
	}
	
	

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jayanthi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("L");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Jaya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testleaf team");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learnselenium");				
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jaya15493@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(state);
		select.selectByVisibleText("TamilNadu");		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("This is an Important Field");
		driver.findElement((By.className("smallSubmit"))).click();				
				
	}


}

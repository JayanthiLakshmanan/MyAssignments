package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		WebElement id=driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String text= id.getText();
	    System.out.println(text);
	    id.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text2 = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text2);
		driver.close();
		
	}

}

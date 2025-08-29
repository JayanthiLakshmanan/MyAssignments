package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.facebook.com/");		
		driver.manage().window().maximize();		
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jayanthi");
		driver.findElement(By.name("lastname")).sendKeys("L");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
		WebElement dob=driver.findElement(By.id("day"));
		Select dobDD=new Select(dob);
		dobDD.selectByVisibleText("15");
		WebElement month=driver.findElement(By.id("month"));
		Select monthDD=new Select(month);
		monthDD.selectByIndex(3);
		WebElement year=driver.findElement(By.id("year"));
		Select yearDD=new Select(year);
		yearDD.selectByValue("1993");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();



	}

	}
		
	
	
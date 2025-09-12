package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		//Initialize the Chromedriver
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("http://www.w3Schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.switchTo().frame("iframeResult");
		//click the TryIt
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//handle the alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//accept alert
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
        
	}

}

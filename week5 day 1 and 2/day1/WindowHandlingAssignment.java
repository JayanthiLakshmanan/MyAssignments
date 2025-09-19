package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		 // 1. Setup ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // 2. Load URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // 3. Login
        driver.findElement(By.id("username")).sendKeys("demoCsr");
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        //crm/sfa link
        driver.findElement(By.linkText("CRM/SFA")).click();
        //click contacts and merge contacts
     // Click Contacts
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();

        // Click Merge Contacts
        driver.findElement(By.linkText("Merge Contacts")).click();

        driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Thread.sleep(3000);
		//using set
		Set<String> firstcontact = driver.getWindowHandles();
		//convert the set into list
		List<String> cWindow=new ArrayList<String>(firstcontact);
		driver.switchTo().window(cWindow.get(1));
		String childWindow = driver.getWindowHandle();
		System.out.println(childWindow);
		System.out.println(driver.getTitle());
		
	    // Click first contact link
	    driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	    driver.switchTo().window(cWindow.get(0));
	    
	   
	    //click the widget of the 2nd contact
	    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	    Thread.sleep(2000);
	    //using set
	    Set<String> secondContact=driver.getWindowHandles();
	    //convert set into list
	    List<String> cWindow1=new ArrayList<String>(secondContact);
	    driver.switchTo().window(cWindow1.get(1));
		String childWindow1 = driver.getWindowHandle();
		System.out.println(childWindow1);
		System.out.println(driver.getTitle());
	   
	    // Click second contact link
	    driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
	    driver.switchTo().window(cWindow1.get(0));
	    
	    //click the merge
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    
	    //handle the alert
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		
        // Verify title
        System.out.println(driver.getTitle());

        // Close browser
        driver.quit();
        
       
	}
}

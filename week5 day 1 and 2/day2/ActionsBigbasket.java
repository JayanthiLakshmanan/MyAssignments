package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigbasket {
	public static void main(String[] args) throws InterruptedException {
		
		   
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bigbasket.com/");
		
		
		//Click on "Shop by Category"
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		Thread.sleep(2000);
        
        //Mouse hover "Foodgrains, Oil & Masala"
		WebElement mH = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(mH).perform();
		Thread.sleep(2000);
        
        //Mouse hover "Rice & Rice Products"
		WebElement moRice = driver.findElement(By.partialLinkText("Rice & Rice"));
		act.moveToElement(moRice).perform();
        
        //Click on "Boiled & Steam Rice"
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
        
        //Filter by brand "bb Royal"
		WebElement bbRoyal = driver.findElement(By.xpath("//label[@for='i-bbRoyal']"));
		act.scrollToElement(bbRoyal).perform();
		act.doubleClick(bbRoyal).perform();
		Thread.sleep(2000);
        
        //Click on "Tamil Ponni Boiled Rice"
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
		
		//convert set into List
				Set<String> firstPage = driver.getWindowHandles();
				List<String> cWindow=new ArrayList<String>(firstPage);
				driver.switchTo().window(cWindow.get(1));				
				System.out.println(driver.getTitle());
        
        //Select the 5 Kg bag
				 WebElement sD = driver.findElement(By.xpath("//span[text()='5 kg']"));
				 act.scrollToElement(sD).perform();
				 sD.click();
        
        //Check and note the price
				 String text = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[4]")).getText();
				 System.out.println(text);
				 
        //Click "Add" to add to cart
				 driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
					
		//verify the success message
				 String text2 = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
				 System.out.println(text2);
				 
				 //switch to the parent window
				 driver.switchTo().window(cWindow.get(0));
				 Thread.sleep(2000);
				 
				 driver.quit();
}

}


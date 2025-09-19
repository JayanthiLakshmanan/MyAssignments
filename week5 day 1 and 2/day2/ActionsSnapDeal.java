package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapDeal {
	public static void main(String[] args) throws InterruptedException {
		//load URL
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		
		//Go to "Men's Fashion"
		WebElement mensFashion = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions act=new Actions(driver);
		act.moveToElement(mensFashion).perform();
		
        //Go to "Sports Shoes"
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
	        
        //Get the count of sports shoes
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println("Total Sports Shoes count: " + count);
        
        //Click on "Training Shoes"
        
		
        // Sort products by "Low to High"
        driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
        driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
        Thread.sleep(3000);
        
        // 8. Check if displayed items are sorted correctly
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
        List<Integer> prices = new ArrayList<>();
        for(WebElement price : priceElements) {
            String priceText = price.getText().replaceAll("[^0-9]", "");
            prices.add(Integer.parseInt(priceText));
        }
        
       // List<Integer> sortedPrices = new ArrayList<Integer>(prices);
        //Collections.sort(sortedPrices);
        
        //if(prices.equals(sortedPrices)) {
          //  System.out.println("Items are sorted correctly (Low to High).");
       // } else {
          //  System.out.println("Items are NOT sorted correctly.");
       // }
        
        // 9. Select price range (e.g., 500-700)
        WebElement fromPrice = driver.findElement(By.name("fromVal"));
        fromPrice.clear();
        fromPrice.sendKeys("500");
        
        WebElement toPrice = driver.findElement(By.name("toVal"));
        toPrice.clear();
        toPrice.sendKeys("700");
        
        driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
        Thread.sleep(3000);
        
        //  Filter by any colour (choose 'Black')
        driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
        Thread.sleep(3000);
        
        // Verify applied filters
        List<WebElement> filters = driver.findElements(By.xpath("//a[@class='clear-filter-pill']"));
        System.out.println("Applied Filters:");
        for(WebElement filter : filters) {
            System.out.println(filter.getText());
        }
        
        //Mouse hover on first "Training Shoes"
        WebElement firstShoe = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(firstShoe).perform();
        
        //Click "Quick View"
        driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
        Thread.sleep(3000);
        
        //Switch to frame and get cost & discount
        WebElement priceElement = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
        WebElement discountElement = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
        System.out.println("Price: " + priceElement.getText());
        System.out.println("Discount: " + discountElement.getText());
        
        // Close current window (Quick View popup)
        driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
        
        // Close main window
        driver.quit();
	}
}

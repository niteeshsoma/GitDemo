import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class spiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//'//div[@class="css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j"]'
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.spicejet.com/");
//		Thread.sleep(1000);
//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-notifications");
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j']")).click();
		//driver.findElement(By.cssSelector("div[class*='css-76zvg2']")
		driver.findElement(By.cssSelector("div[class*='css-76zvg2']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		driver.findElement(By.cssSelector("input[id='txtHotelCity']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[@class='admin-panel']")).click();
		driver.findElement(By.xpath("//input[@value='Add Room']")).click();
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-icoktb r-q4m81j']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}

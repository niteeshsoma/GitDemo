import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	/*	List<WebElement> op = driver.findElements(By.id("src"));
		for(WebElement option:op) {
			if(option.getText().equalsIgnoreCase("Nalgonda")) {
				option.click();
				break;
			}
		}
		WebElement dd = driver.findElement(By.id("src"));
		Select s = new Select(dd);
		s.selectByVisibleText("Nalgonda");
		//driver.findElement(By.xpath("//li[@data-id='95474']")).click();
		*/
		WebElement src =driver.findElement(By.id("src"));
		src.sendKeys("Nalgonda");
		src.sendKeys(Keys.ENTER);
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("Chennai");
		dest.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("label[class='db text-trans-uc']")).click();
		List<WebElement> dates=driver.findElements(By.className("day"));
		System.out.println(dates.size());
		//List<WebElement> dates = driver.findElements(By.cssSelector("td[class='wd day']"));
		
		for(int i=0;i<dates.size();i++) {
			//String text = driver.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equals("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
		}

	}
		
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("search_btn"))).click().build().perform();
		//driver.findElement(By.id("search_btn")).click();

	}
}

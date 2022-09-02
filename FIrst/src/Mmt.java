import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mmt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.makemytrip.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='close']")).click();
		  
		  driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		  Thread.sleep(5000);
		  
		  String flag = "False";
		 

		  while(flag=="False") {
		   
		   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).size()>0) {
		    
		   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).click(); 
		   flag="True";
		   Thread.sleep(5000);
		   }
		   
		   else {
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		      
		  }

	}

}

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class intro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//F:\edgedriver_win64
		System.setProperty("webdriver.edge.driver","F:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("niteesh");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("soma");
		//driver.findElement(By.xpath("//a[@href='Forgot your password?']")).click();
		//driver.findElement(By.cssSelector("//input[@type='checkbox']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("nit");
		/* css color
		 WebElement t = driver.findElement(By.tagName("h1"));
		String s = t.getCssValue("color");
		String c = Color.fromString(s).asHex();*/
//		Thread.sleep(3000);
//		driver.close();
		
		
	}

}

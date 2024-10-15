`package selipractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	           driver.get("https://demo.guru99.com/test/newtours/register.php");
				
				WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
				WebElement postalcode =driver.findElement(By.xpath("//input[@name='postalCode']"));
				WebElement submit =driver.findElement(By.xpath("//input[@name=\"submit\"]"));

				
				Actions act=new Actions(driver);
				
				act.keyDown(Keys.SHIFT).perform();
				
				act.sendKeys(firstname,"arun").perform();
				
				
				act.keyUp(Keys.SHIFT).perform();
				
				Thread.sleep(3000);
		
			act.moveToElement(postalcode).perform();
			Thread.sleep(3000);
			
			act.doubleClick(submit).perform();
			
			act.contextClick(submit).perform();
			
			
		

	}

}

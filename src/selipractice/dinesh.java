package selipractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dinesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='Username']"));

		
		firstname.sendKeys("saranya akka");
		
		
       WebElement password=driver.findElement(By.xpath("//input[@type='password']"));

		
       password.sendKeys(" romba nalla akka");
		

		
       WebElement password1=driver.findElement(By.xpath("//input[@type='password']"));

		
       password1.sendKeys(" romba nalla akka");
		
		
       
       WebElement signin=driver.findElement(By.xpath("//button[@class='submit signInBtn']"));
       
       
       signin.click();
		
       
       
		
		
		
		
		
		
		
		
		
		
		/*selects.click();
		
		
		selects.sendKeys("kumar");*/
		
		

	}

}

package selipractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		WebElement county=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		
		//county.click();
		
		
		Select drop=new Select(county);
		
		
		//drop.selectByIndex(16);
		//drop.selectByValue("INDIA");
		drop.selectByVisibleText("INDIA");

	}

}










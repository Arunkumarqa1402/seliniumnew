package selipractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multicheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mycontactform.com/samples.php");
		
		List <WebElement> clickall=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for(WebElement single:clickall)
		{
			
			single.click();
			
			
		}
		
		
		
		

	}

}

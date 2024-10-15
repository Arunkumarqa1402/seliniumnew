package selipractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class findthetext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		WebElement county=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		
		Select drop=new Select(county);
		
		
		List <WebElement> find=drop.getOptions();
		
		for(WebElement single:find)
			
		{
			
			String expectedresult="INDIA";
			
			String  actualresult=single.getText();
					
					if( expectedresult.equals (actualresult))
			
					{
						
						
						System.out.println(actualresult+"matched");
						break;
						
					}
			
					else {
						
						System.out.println(actualresult+"text not matched");
						
						
					}
		}
		
		
		
		
		

	}

}

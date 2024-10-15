package selipractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");

		String mainwindow=driver.getWindowHandle();
		System.out.println("name of the window"+ mainwindow);
		
		
		WebElement ok =driver.findElement(By.xpath( " //a[@href=\"../articles_popup.php\"]  " ));
		
		ok.click();
		
		Set<String>s1=driver.getWindowHandles();
		
		java.util.Iterator <String> il=s1.iterator();
		
		while(il.hasNext()) 
		
		{
			
		String childwindow=il.next();
		
		if(!childwindow.equalsIgnoreCase(mainwindow))
		
		{
			
		driver.switchTo().window(childwindow);
		
		Thread.sleep(5000);
			
	driver.close();	
			
		}
			
		{
			driver.switchTo().window(mainwindow);
			
			Thread.sleep(3000);
				
		driver.close();	
				
		
			
			
			
		}
			
			
			
		
		
			
			
		}
		

		
		
		
		
	}

}

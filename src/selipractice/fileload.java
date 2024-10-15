package selipractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		//driver.manage().window().maximize();
		
		WebElement file=driver.findElement(By.xpath("//input[@type='file']"));
		
		file.sendKeys("C:\\selenium\\driver file\\chromedriver.exe");
		
		WebElement file1=driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		file1.click();
		
         WebElement file2=driver.findElement(By.xpath("//button[@type='button']"));
		
		file2.click();
	  	
		
		Thread.sleep(5000);
		

		 WebElement file3=driver.findElement(By.xpath("//*[contains(text(),'1 file')]"));
		 
		 String acutal=file3.getText();
		 System.out.println(acutal);
		 String expectedresult="has been successfully uploaded";
		 
		 if(acutal.contains (expectedresult))
		 {
			 
			 System.out.println("matched");
			 
			 
		 }
		 
		 else {
			 
			 
			 System.out.println("not matched");
			 
		 }
		
		

	}

}

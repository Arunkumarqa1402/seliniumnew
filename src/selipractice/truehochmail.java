package selipractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class truehochmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://test.90daysales.com/");
		driver.manage().window().maximize();
		
		
		 WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
        username.sendKeys("Test_QA");
        
         WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
         password.sendKeys("0123");
        
         WebElement clicksubmit=driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/form/div[2]/button"));
         clicksubmit.click();
         
         WebElement plusicon1=driver.findElement(By.xpath("//*[@id=\"quickAddBtn\"]"));
         plusicon1.click();
       
         WebElement email=driver.findElement(By.xpath("//*[@id=\"quickAddBtn_Options\"]/ul/li[4]"));
         email.click();
         
         WebElement subject=driver.findElement(By.xpath("//input[@id=\"emailForm_Subject\"]"));
         subject.sendKeys("subject");
          
       /*  Thread.sleep(3000);
         WebElement text=driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p[1]"));
         text.sendKeys("TESTING@123");*/
         
         WebElement Submit=driver.findElement(By.xpath("//button[@id=\"emailForm_SubmitBtn\"]"));
         Submit.click();
         
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

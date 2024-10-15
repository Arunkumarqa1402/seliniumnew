package selipractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class truehoch1 {

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
         
        
         WebElement submit1=driver.findElement(By.xpath("//*[@id=\"quickAddBtn_Options\"]/ul/li[5]/span"));
         submit1.click();
       
         Thread.sleep(5000);
         WebElement plus=driver.findElement(By.xpath("//*[@id=\"followupForm_ContactsSection\"]/div/div[1]/button"));
         plus.click();
       
         WebElement drop=driver.findElement(By.xpath("//*[@id=\"select2-entitySelector-container\"]"));
         drop.click();
       
         WebElement select=driver.findElement(By.xpath("//*[@id=\"followupFormModal\"]/span/span/span[2]/a"));
         select.click();
         Thread.sleep(2000);
         WebElement name=driver.findElement(By.xpath("//*[@id=\"followupForm_ContactsSection\"]/div/div[4]/div/div[2]/div/div[2]/div[1]/input"));
         name.sendKeys("ramesh");
         //Thread.sleep(3000);
        // WebElement Last=driver.findElement(By.xpath("/html/body/div[6]/form[1]/div/div/div/div[2]/div[4]/div/div[3]/div/div[2]/div/div[2]/div[2]/input"));
        // Last.sendKeys("kumar");
       //  Thread.sleep(3000);
      //   WebElement EMAIL=driver.findElement(By.xpath("/html/body/div[6]/form[1]/div/div/div/div[2]/div[4]/div/div[3]/div/div[2]/div/div[3]/div/input"));
       //  EMAIL.sendKeys("kumar@gmail.com");
         Thread.sleep(3000);
         WebElement ok=driver.findElement(By.xpath("//*[@id=\"followupForm_SubmitBtn\"]"));
         ok.click();
        
       
         WebElement Description=driver.findElement(By.xpath("/html/body/div[6]/form[13]/div/div/div/div[2]/div[2]/div/div[3]/div/textarea"));
         Description.sendKeys("TESTING@1234");
         
         Thread.sleep(5000);
         WebElement clickSubmit=driver.findElement(By.xpath("//button[@id=\"followupForm_SubmitBtn\"]"));
         clickSubmit.click();
         
        

	}

}

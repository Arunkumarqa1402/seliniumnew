package selipractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class truehochactivity {

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
        
		
         WebElement activity=driver.findElement(By.xpath("//*[@id=\"quickAddBtn_Options\"]/ul/li[1]"));
         activity.click();
        
        // WebElement intract=driver.findElement(By.xpath("//*[@id=\"select2-activityForm_ActivityTouchTypeSelector-container\"]"));
         //intract.click();
        
         //WebElement intr=driver.findElement(By.xpath("//*[@id=\"select2-activityForm_ActivityTouchTypeSelector-container\"]/span"));
         //intr.click();
        
         Thread.sleep(5000);
         WebElement plus=driver.findElement(By.xpath("//*[@id=\"activityForm_ContactsSection\"]/div/div[1]/button"));
         plus.click();
       
         WebElement drop=driver.findElement(By.xpath("//*[@id=\"activityFormModal\"]/span/span/span[1]/input"));
         drop.click();
       
         WebElement select=driver.findElement(By.xpath("//*[@id=\"activityFormModal\"]/span/span/span[2]/a"));
         select.click();
         Thread.sleep(2000);
         WebElement name=driver.findElement(By.xpath("//*[@id=\"activityForm_ContactsSection\"]/div/div[4]/div/div[2]/div/div[2]/div[1]/input"));
         name.sendKeys("kumar");
         
       
         WebElement mail=driver.findElement(By.xpath("/html/body/div[6]/form[1]/div/div/div/div[2]/div[4]/div/div[3]/div/div[2]/div/div[3]/div/input"));
         mail.sendKeys("kumar@gmail.com");
         
         WebElement save=driver.findElement(By.xpath("//*[@id=\"activityForm_SubmitBtn\"]"));
         save.click();
       
		
		
		
		
		
		
		
		

	}

}

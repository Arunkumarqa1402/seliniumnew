package selipractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		
		driver.manage().window().maximize();
		
		WebElement selects=driver.findElement(By.xpath("//input[@name='q7']"));
		
		selects.click();
		
		WebElement tap1=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		tap1.click();
		
		
       Select date =new Select(tap1);
       
       List<WebElement> day=date.getOptions();
       
       for(WebElement single:day) 
       {
    	   
    	   
    	   String actual=single.getText();
    	   
    	   System.out.println(actual);
    	   String expect="Jan";
    	   
    	   if(actual.equals(expect)) {
    		   
    		   
    		   single.click();
    		   
    		   
    	   }
    	   
    	   else {
    		   
    		   
    		   System.out.println("data not found");
    	   }
    	   
    	   
       }
       
       
       
      
       
		
        
        

	}

}

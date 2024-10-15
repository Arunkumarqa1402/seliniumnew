package selipractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementandkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.gridlastic.com/");
		
		
		driver.manage().window().maximize();
		
		WebElement first=driver.findElement(By.xpath("//a[@href='register.php']"));
		
		first.click();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		
		firstname.sendKeys("arun");
		
	WebElement lastname=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		
		lastname.sendKeys("kumar");
		
	WebElement 		companyname=driver.findElement(By.xpath("//input[@placeholder= 'Company']"));
		
		companyname.sendKeys("ncc");
	
	WebElement mail=driver.findElement(By.xpath("//input[@placeholder='Work Email']"));
		
		mail.sendKeys("nccproduction1@gmail.com");
		
		
		
		WebElement password=driver.findElement(By.xpath("//input[@placeholder=\"Username (Min 5 Characters)\"]"));
		
		
		password.sendKeys("arun12345");
		
        WebElement confirmpassword=driver.findElement(By.xpath("//input[@placeholder=\"Password (Make it strong!)\"]"));
		
		
		confirmpassword.sendKeys("arun12345");
		
		
		
		
		
		
	//	driver.close();

	}

}

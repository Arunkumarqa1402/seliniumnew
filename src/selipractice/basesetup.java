package selipractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class basesetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web.whatsapp.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		driver.close();
		
		

	}

}

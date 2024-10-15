package selipractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filepro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		File f=new File("C:\\Users\\syss\\eclipse-workspace\\selipractice\\src\\selipractice\\input.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String whatsapp= prop.getProperty("url");
		
		driver.get(whatsapp);
		
		
		
		
		
		

	}

}

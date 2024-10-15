package selipractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class truehoch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://test.90daysales.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
        username.sendKeys("Test_QA");
        
         WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
         password.sendKeys("0123");
        
         WebElement clicksubmit=driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/form/div[2]/button"));
         clicksubmit.click();
         
     
         
         WebElement plusicon=driver.findElement(By.xpath("//*[@id=\"quickAddBtn\"]"));
         plusicon.click();
         
         
         
         WebElement contactform=driver.findElement(By.xpath("//*[@id=\"quickAddBtn_Options\"]/ul/li[2]"));
 		 contactform.click();
 		  
 		  
 		 
 		 WebElement Contacttype=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[1]/div/span/span[1]/span/span[1]"));
         Contacttype.click(); 
         
         WebElement Contacttype1=driver.findElement(By.xpath("//li[text()=\"B2C\"]"));
         Contacttype1.click(); 
         
         
          
        /*WebElement Firstname=driver.findElement(By.xpath("//*[@id=\"contactFormModal\"]/div/div/div[2]/div[1]/div[2]/div[1]/input")); 
         Firstname.sendKeys("Arun");
         
         WebElement Lastname=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[2]/div[2]/input"));
         Lastname.sendKeys("Kumar");
         
        // Thread.sleep(5000);
         WebElement Email=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[3]/div/input"));
         Lastname.sendKeys("arunkumarqa1402@gmail.com");
         
         WebElement phoneno=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[4]/div/input"));
         phoneno.sendKeys("6380996690");
         
       /*  WebElement Categories=driver.findElement(By.xpath("//input[@placeholder=\"Choose a Category\"]"));
         Categories.click();
         Select newclient =new Select(Categories);             
         newclient.selectByVisibleText("New Client");*/
		 
         /*WebElement TransactionsPotential=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[7]/div/input"));
         TransactionsPotential.sendKeys("5000");
         
        /* WebElement LeadSource=driver.findElement(By.xpath("//span[@id=\"select2-leadSourceSelector-container\"]"));
         LeadSource.click();
          
         Select Marketing  =new Select(LeadSource);             
         Marketing.selectByVisibleText("Marketing");*/
          
         /*WebElement creditscore=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[9]/div/input"));
         creditscore.sendKeys("1000");
          
         WebElement company=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[10]/div/input"));
         company.sendKeys("LLP LTD");
          
         WebElement industry=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[11]/div/input"));
         industry.sendKeys("IT");
          
         WebElement Position=driver.findElement(By.xpath("/html/body/div[6]/form[5]/div/div/div/div[2]/div[1]/div[12]/div/input"));
         creditscore.sendKeys("manager");
          
     /*   WebElement country=driver.findElement(By.xpath("//span[@id=\"select2-country-y6-container\"]"));
        country.click();
        Select unitedstates  =new Select(country);             
        unitedstates.selectByVisibleText("United States");*/
       
       
       
       /*WebElement Street=driver.findElement(By.xpath("//*[@id=\"contactFormModal\"]/div/div/div[2]/div[1]/div[13]/div/input[1]"));
       Street.sendKeys("chruch st");
       
       WebElement suite=driver.findElement(By.xpath("//*[@id=\"contactFormModal\"]/div/div/div[2]/div[1]/div[13]/div/input[2]"));
       suite.sendKeys("121212");
       
       WebElement city=driver.findElement(By.xpath("//*[@id=\"contactFormModal\"]/div/div/div[2]/div[1]/div[13]/div/div[3]/div[1]/input"));
       city.sendKeys("cali");
       
      /* WebElement state=driver.findElement(By.xpath("//span[@id=\"select2-state-6c-container\"]"));
       state.click();
       Select AL  =new Select(state);             
       AL.selectByVisibleText("AL");*/
       
    //   WebElement zipcode=driver.findElement(By.xpath("//input[@placeholder=\"Zip Code\"]"));
    //   zipcode.sendKeys("00501");
        
    //   WebElement clickdatepickers=driver.findElement(By.xpath("//*[@id=\"activityForm_ContactsSection\"]/div/div[3]/div/div[2]/div/div[14]/div/input"));
   //    clickdatepickers.click();
       
    //   WebElement Birthday=driver.findElement(By.xpath("/html/body/div[17]/div[3]/ul[3]/li[2]"));
    //   Birthday.click();
       
     //  WebElement Clickdatepickers=driver.findElement(By.xpath("//*[@id=\"contactFormModal\"]/div/div/div[2]/div[1]/div[14]/div/input"));
       //Clickdatepickers.sendKeys("10-30");
   //    WebElement Anniversary =driver.findElement(By.xpath("/html/body/div[18]/div[3]/ul[3]/li[10]"));
     //  Anniversary.click();
       
       //      
       //driver.close();       
       
         
         String month="oct 17";
      //    String date="17";
          
        
       WebElement Clickdatepickers=driver.findElement(By.xpath("//*[@id=\"contactFormModal\"]/div/div/div[2]/div[1]/div[14]/div/input"));
       Clickdatepickers.click();
       
       Thread.sleep(5000);
       
       while(true) {
       
       WebElement monthyear=driver.findElement(By.xpath("/html/body/div[14]/div[3]/ul[1]/li[2]"));
       monthyear.click();
       
       //System.out.println(monthyear);
       
       
       driver.close();       
       
       }
       
       

       
       
       
       
       
       
       
       
       
              
       
       
   //  
       
       
       
       
       
       
       
       
       
       
       
      
  /*     WebElement Tags=driver.findElement(By.xpath("//*[@id=\"contactFormModal\"]/div/div/div[2]/div[1]/div[16]/div/span/span[1]/span/ul/li/input"));
       Tags.click();
       Select blue123  =new Select(Tags);             
       blue123.selectByVisibleText("Blue 123");*/
       
   /*   WebElement AccountName=driver.findElement(By.xpath("//span[@id=\"select2-accountSelector-container\"]"));
       AccountName.click();
       Select testingteam  =new Select(AccountName);             
       testingteam.selectByVisibleText("Testing Team");*/
       
     //  WebElement dream100=driver.findElement(By.xpath("//*[@id=\"contactFormModal\"]/div/div/div[2]/div[1]/div[18]/label/span"));
     //  dream100.click();
       
     //  WebElement nothing=driver.findElement(By.xpath("//*[@id=\"contactForm_customField_Cfg_0f7391811729eb6_cf_78dcc8a55743db2\"]]"));
    //   nothing.sendKeys("nothing");
       
       
   //    WebElement rollnumber=driver.findElement(By.xpath("//input[@id=\"contactForm_customField_GeneralDetails_cf_87fd4fe65bc7e7d\"]"));
   //    rollnumber.sendKeys("1000");
       
   //    WebElement test=driver.findElement(By.xpath("//input[@id=\"contactForm_customField_GeneralDetails_cf_a2fee8e0152a36e\"]"));
   //    test.sendKeys("test");
       
    //   WebElement Nothing=driver.findElement(By.xpath("//input[@id=\"contactForm_customField_Cfg_0f7391811729eb6_cf_78dcc8a55743db2\"]"));
    //   Nothing.sendKeys("nothing");
       
    //   WebElement Rollnumber=driver.findElement(By.xpath("//input[@name=\"customFields[Cfg_0f7391811729eb6][cf_1ff38c83f7ee343]\"]"));
    //   Rollnumber.sendKeys("1001");         
       
       /*WebElement submit=driver.findElement(By.xpath("//button[@id=\"contactForm_SubmitBtn\"]"));
       submit.click();
      
         
        
       
       Thread.sleep(5000);
       
       
       WebElement plusicon1=driver.findElement(By.xpath("//*[@id=\"quickAddBtn\"]"));
       plusicon1.click();
       
      
       WebElement submit1=driver.findElement(By.xpath("//*[@id=\"quickAddBtn_Options\"]/ul/li[5]/span"));
       submit1.click();*/
       
         
		

	}

}

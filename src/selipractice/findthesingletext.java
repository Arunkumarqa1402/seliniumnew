package selipractice;

public class findthesingletext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		system.setproperty("webdriver.chrome.driver",".exe");
		
		webdriver driver= new chromedriver();
		
		driver.get("https//");
		
		webelement obj=driver.findelement(by.xpath("//tagname[@attiname='attrivalue']"));
		
		select dropdown=new select(obj);
		
		list<webelemnt> obj1=dropdown.getoption();
		
		for(webelement single:obj1) {
			
		String expectedresult="india";
		String actaulresult=single.gettext();
		
		if (expectedresult.equals(actaulresult))
			
		{
			
			single.click();
			
		}
		else {
			
			
			System.out.println("textnot matched");
			
		}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

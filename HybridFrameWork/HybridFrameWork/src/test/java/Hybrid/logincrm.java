package Hybrid;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logincrm extends Baseclass {

	@Test(priority=1)
	public void loginApp() throws InterruptedException
	
	{   Loginpage lopin= PageFactory.initElements(driver,Loginpage.class);
		         lopin.LoginToCrm();
    }
	@Test(priority=2)
   public void signupapp() throws InterruptedException
	
	{   pagesignin lopi= PageFactory.initElements(driver,pagesignin.class);
		 lopi.signasanil("snehakoleti20@gmail.com","Koleti@5371");
		     
		         
    }
	@Test(priority=3)

	 public void searchupapp() throws InterruptedException
		
		{   Searrchpage lopi4= PageFactory.initElements(driver,Searrchpage.class);
			 lopi4.searcho("bedsheets");
			     
			         
	    }
	@Test(priority=4)

	 public void Bedapp() throws InterruptedException
		
		{   Bedrooms lopi5= PageFactory.initElements(driver,Bedrooms.class);
			 lopi5.LoginBed();
			     
			         
	    }
	@Test(priority=5)

	 public void Bedappcart() throws InterruptedException
		
		{ 
		     BookingPage lopi6= PageFactory.initElements(driver,BookingPage.class);
			 lopi6.bedlogin();
			     
	    }

   @Test(priority=6)

	 public void assertionaa() throws InterruptedException
		
		{ 
		     Asserttest lopi7= PageFactory.initElements(driver,Asserttest.class);
			 lopi7.assersearcho();
			
			
	    }
	 @Test(priority=7)

	 public void tvappcart() throws InterruptedException
		
		{ 
		     Livingroom lopi8= PageFactory.initElements(driver,Livingroom.class);
			 lopi8.tvpageoo();
			     
	    }

	 @Test(priority=8)

	 public void studyapp() throws InterruptedException
		
		{ 
		     studypage lopi9= PageFactory.initElements(driver,studypage.class);
			 lopi9.studypageo();
			     
	    }
	 @Test(priority=9)

	 public void aboutapp() throws InterruptedException
		
		{ 
		     aboutpage lopia= PageFactory.initElements(driver,aboutpage.class);
			 lopia.aboutu();

			     
	    }
	 @Test(priority=10)
	 public void infoapp()
		
		{ 
		      Moreinfo lopioo= PageFactory.initElements(driver,Moreinfo.class);
			 lopioo.moruee();

			     
	    }
}

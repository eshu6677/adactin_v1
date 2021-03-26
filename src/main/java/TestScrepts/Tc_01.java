package TestScrepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectPage.AdactinLoginPage;
import ReUseable.BaseClass;

public class Tc_01 extends BaseClass {
	@Test
	public void login(){
		
		AdactinLoginPage alp=new AdactinLoginPage();
		
		alp.enterUsername(un);
		
		logger.info("******UserName Entered*****");
		alp.enterPassword(pwd);
		
		logger.info("******password Entered*****");
		alp.clickOnLogin();
		logger.info("******login button clicked*****");
		
		
	}
	

}

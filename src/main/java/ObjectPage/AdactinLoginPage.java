package ObjectPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReUseable.BaseClass;

public class AdactinLoginPage {
	
		
		public AdactinLoginPage(){
			
			PageFactory.initElements(BaseClass.driver, this);		
			
		}
		
		@FindBy(id="username")
		WebElement Username ;
		
		@FindBy(id="password")
		WebElement Password;
		
        @FindBy(id="login")
		WebElement login;
        
        public String enterUsername(String un){
        	
        	Username.sendKeys(un);
        	
        	return un;
        }
        	  public String enterPassword(String pwd){
        	
        	Password.sendKeys(pwd);
        	return pwd;
        	  }
        	  public void clickOnLogin(){
        	login.click();
        	
        }
        
      	
		
	}


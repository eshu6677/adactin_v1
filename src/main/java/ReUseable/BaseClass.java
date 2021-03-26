package ReUseable;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	public static Logger logger;
	
	public static WebDriver driver;
	String url="https://adactinhotelapp.com/index.php";
	protected String un="eshu6677";
	protected String pwd="eshu@123";
	
	@BeforeClass
	public void openBrowser(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\em21154\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");

		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 driver.get(url);
		  logger=Logger.getLogger("HotelBooking");
		  PropertyConfigurator.configure("log4j.properties");
	
	}
	@AfterClass
	public void closeBrowser(){
		driver.close();
			
	}

}

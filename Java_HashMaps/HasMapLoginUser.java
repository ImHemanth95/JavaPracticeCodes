package SeleniumSession;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HasMapLoginUser {
	static WebDriver driver;

	public static void main(String[] args) {
		// Userbased permission
		//for ecomerce data
		//product meta data: <name:"macbook"><price:101><seller:"abc">
		//like logins , customer,admin,user,seller,vendor,distributor etc
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		doLogin("admin");
		doLogin("seller");
		doLogin("vendor");
		}
	
	    public static void doLogin(String role) {
		String creds[] = getCredentialsMap(role).split(":");
		System.out.println(creds[0] + " : " + creds[1]);
		By email = By.id("input-email");
		By password =  By.id("input-password");
		By LoginButton = By.xpath("//input[@value='Login']");
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(creds[0].trim());
       	driver.findElement(password).clear();
		driver.findElement(password).sendKeys(creds[1].trim());
		driver.findElement(LoginButton).click();
	}
	public static String getCredentialsMap(String role) {
		Map<String,String> credMap = new HashMap<String,String>();
		credMap.put("admin", "admin@test.com:admin123");//here based on the role we can provide the username and pass in one line
		credMap.put("seller", "seller@test.com:seller123");//here based on the role we can provide the username and pass in one line
		credMap.put("vendor", "vendor@test.com:vendor123");//here based on the role we can provide the username and pass in one line
		credMap.put("distributor","distributor@test.com:distributor123");//here based on the role we can provide the username and pass in one line
	
	   if(credMap.containsKey(role)) {
		   return credMap.get(role);
	   }
	   return null;
	}

}

package SeleniumSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMap_OpencartProduct {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=45&search=macbook");
		driver.manage().window().maximize();
		 WebElement ProdName = driver.findElement(By.xpath("//h1[text()='MacBook Pro']"));
		 WebElement prodTaxAmt = driver.findElement(By.xpath("//li[text()='Ex Tax: $2,000.00']"));
		//List<WebElement> macDetails = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[8]/li"));
        //Object[]arr =  macDetails.toArray();
		}
	public static String getProdDetailsMap(By locator,String details) {
		List<WebElement> macDetails = driver.findElements(locator);
		Object[]arr  = macDetails.toArray();
		Map<String,String> prodMap = new HashMap<String,String>();
		for(int i=0;i<=arr.length;i++) {
			prodMap.put(i,macDetails[i]);
	}
		
		
		
	
}
}

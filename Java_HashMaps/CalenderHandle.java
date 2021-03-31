package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandle {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='24']")).click();
		//selectDate("24");
		By calenderlist = By.xpath("//table[@class='ui-datepicker-calendar']//a");
		selectdatebyList(calenderlist,"24");
		//this calender data or the list that is visible is shown in the format of webtable itself
		//as rows and coloumns
	}
	public static void selectDate(String date,String htmltag) {
		driver.findElement(By.xpath("//"+htmltag+"[text()='"+date+"']")).click();
	}
	public static void selectdatebyList(By locator,String date) {
		List<WebElement> datelist = driver.findElements(locator);
		System.out.println(datelist.size());
		for(WebElement e:datelist) {
			if(e.getText().equals(date)){
				e.click();
				break;
			}
}
	}
}

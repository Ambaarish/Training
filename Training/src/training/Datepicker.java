package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	static WebDriver driver ;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/ambaa/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/");
		
		WebElement departureIcon = driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		departureIcon.click();
		
		List<WebElement> datepicker = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for(int i=0 ; i<datepicker.size() ; i++) {
			System.out.println(datepicker.get(i).getText());
		}
		

	}
	
	
	}



package newPackge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class FlipkartLoginAndNewAddressAdd {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL="https://www.flipkart.com/";
		//lunch the flipkart URL
		driver.get(baseURL);
		//maximize the window size
		driver.manage().window().maximize();
		
		//Click on login button to login in flipkart
		driver.findElement(By.xpath("/a[text()='Login']")).click();
		//login with credentials in flipkart
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8709001243");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kishor@12345");
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		//mouse hover on account kishor
		WebElement ele=driver.findElement(By.xpath("//div[text()='Kishor']"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		//click on  My profile
		driver.findElement(By.xpath("//div[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='Manage Addresses']")).click();
		//now click on new address and fill the address field
		driver.findElement(By.xpath("//div[@class='_1QhEVk']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mahesh raj");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8521675930");
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("805110");
		driver.findElement(By.xpath("//input[@name='addressLine2']")).sendKeys("locality-Nawada");
		driver.findElement(By.xpath("//textarea[@name='addressLine1']")).sendKeys("newarea Nawada");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Nawada");
		Select selectstate = new Select(driver.findElement(By.name("state")));
		selectstate.selectByVisibleText("Bihar");
		driver.findElement(By.xpath("//input[@name='landmark']")).sendKeys("near SBI ATM");
		driver.findElement(By.xpath("//input[@name='alternatePhone']")).sendKeys("9934343258");
		driver.findElement(By.xpath("//*[@id='HOME']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//click on logout from flipkart
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		driver.close();
		
		
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class Ravi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions block = new ChromeOptions();
		block.addArguments("--disable-notifications");
		// to blovk notifications in chrome
		WebDriver driver = new ChromeDriver(block);
		//to invoke chrome driver
		 
		
		driver.get("https://www.facebook.com/");
		//to open facebook
		
		driver.findElement(By.id("email")).sendKeys("ravichandhra698@gmail.com");
		//Login with email
		driver.findElement(By.name("pass")).sendKeys("Ravi@1998");
		//Login with Password
		driver.findElement(By.name("login")).click();
		//Clicks Login 
		Thread.sleep(3000);
		// to wait for 3 sec
		driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
		//To find element by index xPath selector
		driver.findElement(By.xpath("(//span[normalize-space()='Log out'])[1]")).click();
		// select logout by index xpath
		
		
		
		//to close the window
		driver.close();
		
		
		
		
		
	}

}

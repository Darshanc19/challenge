package FlipkartLogin;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions act = new Actions(driver);
		WebElement profile = driver.findElement(By.xpath("(//span[@class='_2FZd5H'])[1]"));
		
		act.moveToElement(profile).perform();
		
		driver.findElement(By.xpath("//a[@title='Poco X2']")).click();
		
		driver.findElement(By.xpath("//div[@class='_3wU53n']")).click();
//		String current_window = driver.getWindowHandle();
		Set<String> all_window = driver.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<String>(all_window);
		String tab = a1.get(1);
		driver.switchTo().window(tab);
		Thread.sleep(4000);       
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	
		driver.findElement(By.xpath("(//button[.=' + '])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@class='wNrY5O'])[2]")).click();
        String mobile_name = driver.findElement(By.xpath("//a[@class='_325-ji _3ROAwx']")).getText();
        String mobile_price= driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']")).getText();
        String mobile_ram=driver.findElement(By.xpath("//div[@class='v7-Wbf']")).getText();
        a1.add(mobile_name);
        a1.add(mobile_price);
        a1.add(mobile_ram);
        System.out.println(a1);

		
		
		

	}

}

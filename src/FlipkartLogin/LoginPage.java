package FlipkartLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("darshanc19@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("darshan");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		system.out.println("newly added");
		driver.close();
		

	}

}

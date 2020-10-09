package FlipkartLogin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTabs {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\darsh\\OneDrive\\Desktop\\link.html");
		List<WebElement> ele = driver.findElements(By.id("a1"));
		
		
			
			
		Actions act = new Actions(driver);
		Robot r = new Robot();
		for (WebElement webe : ele) {
			
			act.contextClick(webe).perform();
		
			
			
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			
	
			
		}
		Set<String> allWin = driver.getWindowHandles();
		int count=allWin.size();
		System.out.println(count);
		ArrayList<String> l = new ArrayList<String>(allWin);
		String tab=l.get(2);
		driver.switchTo().window(tab);
		Thread.sleep(1500);
		String tab1 =l.get(3);
		driver.switchTo().window(tab1);
		Thread.sleep(1500);
		String tab2=l.get(5);
		driver.switchTo().window(tab2);
		
		
		
	}
	

}

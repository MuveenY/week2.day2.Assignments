package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement from = driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		 from.sendKeys("chennai");
		 Thread.sleep(1000);
		 from.sendKeys(Keys.ENTER);
		 
		 WebElement to = driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		 to.sendKeys("tirupati");
		 Thread.sleep(1000);
		 to.sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("onward_cal")).click();
		 driver.findElement(By.xpath("(//(td[@class='we day'])[1]")).click();
		 driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		 //driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		 //Thread.sleep(1000);
		 //driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		 WebElement noOfBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		 String buses = noOfBuses.getText();
		 System.out.println(buses + " found");
		 
		 driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		 String sleeper = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		 System.out.println(sleeper + " sleeper buses found");
		 
		 driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		 driver.findElement(By.xpath("//label[@for='bt_AC']")).click();
		 String ac = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		 System.out.println(ac + " AC buses found");
		 
		 driver.findElement(By.xpath("//label[@for='bt_NONAC']")).click();
		 String nonAc = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		 System.out.println(nonAc + " AC & NON-AC buses found");
		 

	}

}

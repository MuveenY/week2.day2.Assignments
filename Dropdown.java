package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement findElement = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		 Select dropDown = new Select(findElement);
		 dropDown.selectByIndex(1);
		 
		 WebElement findElement1 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		 Select dropDown1 = new Select(findElement1);
		 dropDown1.selectByVisibleText("Selenium");
		 
		 WebElement findElement2 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		 Select dropDown2 = new Select(findElement2);
		 dropDown2.selectByValue("1");
		 
		 WebElement findElement3 = driver.findElement(By.className("dropdown"));
		 Select dropDown3 = new Select(findElement3);
		 System.out.println("No. of dropdowns : " + dropDown3.getOptions().size());
		 
		 driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Selenium");
		 
		 WebElement findElement4 = driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
		 Select dropDown4 = new Select(findElement4);
		 dropDown4.selectByIndex(1);
		 dropDown4.selectByIndex(4);
		 

		 
		 
		 
		 
	}

}

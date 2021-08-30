package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("(//input)[1]")).click();
		 
		 if(driver.findElement(By.xpath("(//input)[6]")).isSelected()) 
				 System.out.println("Selenium is checked already");
		 else {
			 driver.findElement(By.xpath("//div[text()='Selenium']")).click();
			 System.out.println("Selenium is checked now");
		 }
		 
		 for (int i = 7; i <= 8; i++) {
		 if(driver.findElement(By.xpath("(//input)["+i+"]")).isSelected())
			 driver.findElement(By.xpath("(//input)["+i+"]")).click();
		 }
		 
		 for (int i = 9; i <=13; i++) {
			 driver.findElement(By.xpath("(//input)["+i+"]")).click();
		}
	}

}

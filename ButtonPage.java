package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//button[@id='home']")).click();
		 driver.navigate().back();
		 
		 Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		 System.out.println("positions (x,y) : " + location);
		 
		 String attribute = driver.findElement(By.id("color")).getAttribute("style");
		 System.out.println("color : " + attribute);
		 
		 Dimension size = driver.findElement(By.id("size")).getSize();
		 System.out.println("size : " + size);
		 
		 
		 
		 

	}

}

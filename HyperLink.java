package week2.day2.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("(//a[@link='blue'])[1]")).click();
		 driver.navigate().back();
		 
		 String attribute = driver.findElement(By.xpath("(//a[@link='blue'])[2]")).getAttribute("href");
		 System.out.println("The link goes to : " + attribute);
		 
		 driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		 if(driver.getTitle().equals("HTTP Status 404 – Not Found"))
			 System.out.println("The link is broken");
		 else
			 System.out.println("The link is not broken");
		 
		 driver.navigate().back();
		 
		 String link1 = driver.findElement(By.xpath("(//a[@link='blue'])[1]")).getAttribute("href");
		 String link2 = driver.findElement(By.xpath("(//a[@link='blue'])[3]")).getAttribute("href");
		 if(link1.equals(link2)) {
			 System.out.println("Both Links are Same");
		 driver.findElement(By.xpath("(//a[@link='blue'])[1]")).click();
		 driver.navigate().back();
		 } else
			 System.out.println("Both Links are Not Same");
		 
		 List<WebElement> findElements = driver.findElements(By.tagName("a"));
		 System.out.println("No. of Links available in the Page : " + findElements.size());
		 

	}

}

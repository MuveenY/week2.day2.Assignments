package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		
		String width = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("naturalWidth");
		if(width.equals("0"))
			System.out.println("Image is Broken");
		else
			System.out.println("Image is Not Broken");
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		driver.navigate().back();
		
		
		
		
		

	}

}

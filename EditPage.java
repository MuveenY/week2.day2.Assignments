package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("muveen36@gmail.com");

		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("muveen", Keys.TAB);

		String attribute = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println("The Default text : " + attribute);

		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();

		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println("Edit field is Enabled : " + enabled);
		
		
		
	}

}

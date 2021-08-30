package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Y");
		 driver.findElement(By.id("lastNameField")).sendKeys("Muveen");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Y");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Muveen");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("civil");
		 driver.findElement(By.name("description")).sendKeys("I am a Beginner");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("muveen3636@gmail.com");
		 WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select dropDown = new Select(state);
		 dropDown.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("i am a Beginner");
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 
		 String title1 = driver.getTitle();
		 System.out.println(title1);
		 

	}

}

package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("muveen3636@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a"))
				.getText();
		System.out.println("First lead's Last Name : " + firstLead);

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

		String title1 = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();

		if (title1.equals("Duplicate Lead"))
			System.out.println("Title is verified");

		else
			System.out.println(title1 + " is not matched");

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		String text = driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']")).getText();

		System.out.println("Duplicate Name's Last Name : " + text);
		if (text.equals(firstLead))
			System.out.println("The Duplicate name is same as Captured Name");
		else
			System.out.println("The Duplicate name is not same as Captured Name");
		
		driver.close();

	}

}

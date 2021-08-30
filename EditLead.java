package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
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
		 driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Muveen");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 
		  String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		 System.out.println("First Result No : " + text);
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		 
		 String title2 = driver.getTitle();
		 System.out.println(title2);
		 if(title2.equals("View Lead | opentaps CRM"))
			 System.out.println("Title is verified");
		 else
			 System.out.println("Title is not verified");
		 
		 driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
		 WebElement compName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
          compName.clear();
          compName.sendKeys("Industry");
          driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
          Thread.sleep(2000);
          String changedName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
          System.out.println("Changed Name : "+ changedName);
          if(changedName.contains("Industry"))
        	  System.out.println("changed name appears");
          else
        	  System.out.println("changed name not appears");
          
          driver.close();
		 
		 
		
		 

	}

}

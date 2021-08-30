package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//input[@id='yes']")).click();
		 
		 if(driver.findElement(By.xpath("(//input[@value='0'])[2]")).isSelected())
				 System.out.println("Default Selected Radio Button is : Unchecked ");
		 else
			 System.out.println("Default Selected Radio Button is : Checked ");
		 
		 if(driver.findElement(By.xpath("(//input[@value='1'])[3]")).isSelected())
			 System.out.println("Age Group is Selected by default");
	 else {
		 System.out.println("Age Group is Not Selected by default");
		 driver.findElement(By.xpath("(//input[@value='1'])[3]")).click();
	 }
		 

	}

}

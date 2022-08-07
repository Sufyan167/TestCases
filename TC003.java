// User able to change mobile number

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seliniumtcs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SUFIYAN\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		// Change Phone number
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/r");
		
		driver.findElement(By.xpath("//*[@id='__next']/div/main/div/div/div[1]/div/input")).sendKeys("Virat");
		
		driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/div[2]/div/input")).sendKeys("Kohli");
		
		driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/button")).click();

		driver.findElement(By.xpath("//*[@id='_next'div/main/div/div[1]/div[2]/div[2]/button")).click();

		driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div/input")).sendKeys("9988776655");

		driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div[1]/div[2]/div[2]/button[2]")).click();

		driver.findElement(By.xpath("//*[@id=\\'__next\\']/div/main/div/div[3]/div[2]/div[2]/button")).click();
	
		
	}

}

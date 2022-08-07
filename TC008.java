// Users should not be able to open the settings page after logging out by using the url

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SUFIYAN\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Account Creation 
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/r");
		//Enter Username
		driver.findElement(By.xpath("//*[@id='__next']/div/main/div/div/div[1]/div/input")).sendKeys("Virat");
		//Enter Password
		driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/div[2]/div/input")).sendKeys("kohli");	
		//Click Login
		driver.findElement(By.xpath("//*[@id=\'__next\']/div/main/div/div/button")).click();

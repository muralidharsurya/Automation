package ram;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asmple {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("i phone 11");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_10UF8M _3LsR0e']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(4000);
		
	}}

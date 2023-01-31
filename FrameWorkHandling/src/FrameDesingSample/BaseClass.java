package FrameDesingSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import retriveDataFromExcel.DataUtility;

public class BaseClass {
	DataUtility du = new DataUtility();
	public  WebDriver driver;
	 
	 //  Establish connection 
	 @BeforeSuite
	 public  void createConnnection() {
		 
		System.out.println("connection Established"); 
	 }
	 //lunching Browser
	 
	 @BeforeClass
	 public void launcBrowser() throws Exception {
		String URL= du.getDataFromProperties("url");
	driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	System.out.println("Chrome browser Luanching");
	
	 }
	 //Login OPertion 
	 @BeforeMethod
	 public void loginToApp() throws Exception {
		String USERNAME= du.getDataFromProperties("usernmae");
		String PASSWORD = du.getDataFromProperties("password");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("Login successful");
		 
		
	 }
	 //logout operation
	 @AfterMethod
	 public void logOutApp() {
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("log out Successfully");
	 }
	 
	 //close the Browser
	 @AfterClass
	 public void closeBrowser() {
		 driver.close();
		 System.out.println("browser closed successfully");
		 
	 }
	 // close connection
	@AfterSuite
	 public void  disconectedConnection() {
		 System.out.println("connection close");
	 }
	
	
	
	

}

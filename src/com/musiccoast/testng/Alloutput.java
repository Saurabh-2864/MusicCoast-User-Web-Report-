package com.musiccoast.testng;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Alloutput {
		WebDriver driver;
		
		@BeforeMethod
		public void setup() throws Exception{
		
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://musiccoast.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
		}
		
		@Test   (priority=1,groups="Login")    //(dependsOnMethods="setup")   
		
		public void EnterUrl() throws Exception{
			
			System.out.println("Enter Url Successful");
			Thread.sleep(5000);
		}
		
		@Test  (priority=2,groups="Login")                   //(dependsOnMethods="setup")                    
		
		
		public void ClickOnUser() throws Exception{
			
			driver.findElement(By.xpath("//*[@id=\"right\"]/a/img")).click();
			System.out.println("Click on User Successful");
			Thread.sleep(5000);
				
		}
			
		
		@Test  (priority=3,groups="Login")
                    // (dependsOnMethods="setup")                     
		
		public void MobilenumberAdded() throws Exception{
			
			driver.findElement(By.xpath("//*[@id=\"right\"]/a/img")).click();
			Thread.sleep(5000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div/input")).sendKeys("9823541487");
		Thread.sleep(5000);
		System.out.println(" mobile number Added in the textbox");
		Thread.sleep(5000);
		
		}
		
		@Test (priority=4,groups="Login")         //(dependsOnMethods="setup")                    
		
		
		public void clickonContinue () throws Exception {
			
			driver.findElement(By.xpath("//*[@id=\"right\"]/a/img")).click();
			Thread.sleep(5000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div/input")).sendKeys("9823541487");
		Thread.sleep(5000);
		System.out.println(" mobile number Added in the textbox");
		Thread.sleep(5000);
		
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/button")).click();
		System.out.println("Click on Continue button Successful & OTP Received on that mobile number");
		Thread.sleep(3000);
		}
		
		@Test (priority=5,groups="Artist")
		
		public void ClickonArtist() throws Exception{
			driver.findElement(By.xpath("//*[@id=\"left\"]/a/img")).click();
			Thread.sleep(3000);
		}
		
		@Test(priority=6,groups="Artist")
		public void ClickonTextbox()throws Exception{
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div/input")).click();
			Thread.sleep(3000);
		}
		
		
	  @AfterMethod
	public void teardown() {
		driver.quit();
		
		System.out.println("Application Closed");
	   }
	}



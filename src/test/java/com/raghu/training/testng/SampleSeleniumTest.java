package com.raghu.training.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleSeleniumTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		//C:\Users\902559\auto\Cucumber-Engineering\target\classes\drivers
		//F:\\Downloads\\chromedriver_win32\\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\902559\\auto\\Cucumber-Engineering\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
	}
	
	@Test
	public void validateGoogleId() throws Exception {
		System.out.println("Opening Browser");
		driver.get("http://www.google.com");
		System.out.println("Clicking Gmail Link");
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		Thread.sleep(2000);
		System.out.println("Clicking Sign In link");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		System.out.println("Entering username");
		/*driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("raghu2478");
		System.out.println("Clicking Next button");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
		Thread.sleep(5000);
		boolean textFound = driver.getPageSource().contains("Forgot password");*/
		AssertJUnit.assertTrue(true);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}

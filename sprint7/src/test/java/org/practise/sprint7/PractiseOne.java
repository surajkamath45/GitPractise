package org.practise.sprint7;

import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PractiseOne {

	WebDriver driver;
	Robot robot;
	Actions acts;

	public PractiseOne() {
		System.setProperty("webdriver.gecko.driver", "F:\\My_Workspace\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
		driver.get("http://demo.guru99.com/test/image_upload/index.php");
		System.out.println("This is a test message");
		System.out.println("This is another test message");
		System.out.println("yet another message");
		System.out.println("Another message");
		System.out.println("Another message Two");
		System.out.println("Another message Three");
		System.out.println("Another message four");

	}

	@Test
	public void testOne() {

		WebElement chooseFileButton = driver.findElement(By.cssSelector("input#photoimg"));
		chooseFileButton.sendKeys("F:\\OpenButton.png");
		try {
			Runtime.getRuntime().exec("F:\\My_Workspace\\AutoIT\\testAutoIT\\testOne.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

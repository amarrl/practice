package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'VIEW ALL')])[1]")).click();
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles");
		driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		JavascriptExecutor ji=(JavascriptExecutor)driver;
		ji.executeScript("window.scrollBy(0,300)");
}

}

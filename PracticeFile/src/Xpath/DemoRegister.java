package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRegister {

	public static void main(String[] args) throws InterruptedException{
    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("amar");
    driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).sendKeys("aaa");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8050771854");
    
	}

}
//a[@id="u_0_2_7K"]inputtext _58mg 
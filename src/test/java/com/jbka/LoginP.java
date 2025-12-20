package com.jbka;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginP {
	
		    public static void main(String[] args) {

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        driver.get("https://javabykiran.in/other/CC/search");

		        WebElement clickLogin = driver.findElement(By.linkText("Login"));
		        clickLogin.click();
		        
		        WebElement Email = driver.findElement(By.name("username"));
		        Email.sendKeys("anagha@gmail.com");
		        
		        WebElement password =driver.findElement(By.cssSelector("#login-password"));
		        password.sendKeys("5@march2004");
		        
//		        WebElement FPass =driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/p/a"));
//		        boolean isEnable1 = FPass.isEnabled();
//		        
//		        boolean isClickable = false;
//		        if (isEnable1) {
//		            isClickable = true;
//		            System.out.println("F Pass  is enable for click");
//		            FPass.click();
//		        } else {
//		            System.out.println("F Pass is not enable for click");
//		        }
//
//		        if (isClickable) {
//		            System.out.println(" F Pass Button Test case Pass");
//		        } else {
//		            System.out.println("Test case failed");
//		        }
		        
		        WebElement checkBox =driver.findElement(By.name("remember"));
		        checkBox.click();
		        
		        WebElement Login =driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[5]/div/button"));
		        Login.click();

}
}

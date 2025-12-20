package com.jbka;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationPage {

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://javabykiran.in/other/CC/search");

	        WebElement clickRegister = driver.findElement(By.linkText("Register"));
	        clickRegister.click();

	        WebElement title =driver.findElement(By.name("title"));
	        title.sendKeys("Mrs");

	        WebElement firstname =driver.findElement(By.id("first_name"));
	        firstname.sendKeys("Anagha");

	        WebElement lastname = driver.findElement(By.id("last_name"));
	        lastname.sendKeys("Gulhane");

	        WebElement Email = driver.findElement(By.name("email"));
	        Email.sendKeys("anagha@gmail.com");

	        WebElement phone =driver.findElement(By.name("phone"));
	        phone.sendKeys("9307796714");

	        WebElement password =driver.findElement(By.id("password"));
	        password.sendKeys("5@march2004");

	        WebElement confirmPassword =driver.findElement(By.id("passconf"));
	        confirmPassword.sendKeys("5@march2004");
	        
	        WebElement checkBox =driver.findElement(By.name("terms_agree"));
	        checkBox.click();

	        WebElement Register =driver.findElement(By.xpath("//*[@id=\"register_submit\"]"));
	        Register.click();
	    }
	}
	

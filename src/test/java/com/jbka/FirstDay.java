package com.jbka;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {
	public static void main(String[] args) {
		//open a browser
		//open a url
		
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}


}

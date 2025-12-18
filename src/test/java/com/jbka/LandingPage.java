package com.jbka;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public static void main(String[] args) {

        // open chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // open url
        driver.get("https://javabykiran.in/other/CC/");

        // check login link is displayed or not
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        boolean isDisplay = loginLink.isDisplayed();

        if (isDisplay) {
            System.out.println(" Login Test Case Pass");
        } else {
            System.out.println("Test Case Failed");
        }
        
        //check register link is displayed or not
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        boolean isvisible = registerLink.isDisplayed();

        if (isvisible) {
            System.out.println(" Register Test Case Pass");
        } else {
            System.out.println("Test Case Failed");
          }

        // check search text box enable to enter value or not
        WebElement txtSearch = driver.findElement(By.cssSelector("#top_header > div.small-8.large-9.columns.nav-boxes > div.row.show-for-medium-up > div > div > form > div > div.small-10.large-11.columns.search_container > input"));
        boolean isEnable = txtSearch.isEnabled();

        if (isEnable) {
            System.out.println("Test Case!! is pass and you are able to enter a value in a search textbox");
        } else {
            System.out.println("Test case failed!! and you are Not able to enter a value in a search textbox");
        }

        // check advance login link is clickable or not and if enabled then click on a link
        WebElement linkAdvanceSearch =driver.findElement(By.partialLinkText("Advanced S"));
        boolean isEnable1 = linkAdvanceSearch.isEnabled();
        
        boolean isClickable = false;
        if (isEnable1) {
            isClickable = true;
            System.out.println("Advance link is enable for click");
            linkAdvanceSearch.click();
        } else {
            System.out.println("Advance link is not enable for click");
        }

        if (isClickable) {
            System.out.println(" Advance Button Test case Pass");
        } else {
            System.out.println("Test case failed");
        }
    }
}

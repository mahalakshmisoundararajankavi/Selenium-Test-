package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayr\\eclipse-workspace\\AAASelenium\\Driver\\chromedriver.exe");
		
		//WebDriver is Interface
		//driver is referance name
		//ChromeDriver is Class
		WebDriver driver = new ChromeDriver();
		
		//Get the URL
		driver.get("https://www.saucedemo.com/");
		
		//find the locator for UserName
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		
		//find the locator for PassWord
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("secret_sauce");
		
		//Login The page
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		//Text of the bag
	    WebElement textBag = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	    String text = textBag.getText();
	    System.out.println(text);
	    
	    //Bag price
	    WebElement priceDetial = driver.findElement(By.xpath("//div[text()='29.99']"));
	    String text2 = priceDetial.getText();
	    System.out.println(text2);
	    
	    //Bag height and Width
	    WebElement img = driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img"));
	    int height = img.getSize().getHeight();
	    int width = img.getSize().getWidth();
	    System.out.println("Height is :"+ height +"Width is :"+ width);
	    
	    //Add To Cart
	    WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	    String text3 = addToCart.getText();
	    System.out.println(text3);
	    
	    //Product Container
	    WebElement productSort = driver.findElement(By.className("product_sort_container"));
	    String text4 = productSort.getText();
	    System.out.println(text4);
	    
	    //Logo of app
	    WebElement appLogo = driver.findElement(By.className("app_logo"));
	    String text5 = appLogo.getText();
	    System.out.println(text5);
	    
	    //Text 
	    WebElement productText = driver.findElement(By.xpath("//span[text()='Products']"));
	    String text6 = productText.getText();
	    System.out.println(text6);
	}

}

package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://amazon.in");
		driver.close();
	}

}

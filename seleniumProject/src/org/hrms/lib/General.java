package org.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global {

	public void openApp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);

	}

	public void closeApp() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	public void searchProduct() {

		driver.findElement(By.id(searchTxt)).sendKeys(search);
		driver.findElement(By.id(searchBtn)).click();
	}

}

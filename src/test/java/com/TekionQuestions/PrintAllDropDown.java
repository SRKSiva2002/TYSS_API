package com.TekionQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		WebElement list = driver.findElement(By.xpath("//p[contains(.,'Normal dropdown menu without any customization.')]/..//select[@class='form-control gds-cr']"));
		
		Select s = new Select(list);
		List<WebElement> all = s.getOptions();
		for (WebElement w : all) {
			String text = w.getText();
			System.out.println(text);
			s.selectByVisibleText(text);
		}
	}
}

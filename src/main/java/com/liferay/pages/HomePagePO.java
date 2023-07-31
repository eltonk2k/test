package com.liferay.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePO {
	private WebDriver driver;

	public void setup() {
		driver = new FirefoxDriver();
	}

	public void quit() {
		//driver.quit();
	}

	public void accessPage() {
		driver.get("https://webserver-debtestproject-prd.lfr.coffee/web/forms/shared/-/form/43838");
		driver.manage().window().setSize(new Dimension(1550, 830));
	}

	public void favoriteSoccerPlayer() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/div/div/input")));
		element.click();
		driver.findElement(By.xpath("//div/div/div/input")).sendKeys("Ronaldo");
	}


	public void manyGoals() {
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys("900");

	}


	public void bestFoot() {
		driver.findElement(By.xpath("//div[3]/label/input")).click();
	}

	public void debutDateProfessional() {
		driver.findElement(By.cssSelector(".input-group-inset")).click();
		driver.findElement(By.cssSelector(".lexicon-icon-calendar")).click();
		driver.findElement(By.name("year")).click();
		driver.findElement(By.name("year")).click();
		driver.findElement(By.name("year")).click();
		{
			WebElement dropdown = driver.findElement(By.name("year"));
			dropdown.findElement(By.xpath("//option[. = '2018']")).click();
		}
		driver.findElement(By.xpath("//option[contains(.,\'2018\')]")).click();
		driver.findElement(By.xpath("//button[contains(.,\'1\')]")).click();
		driver.findElement(By.xpath("//div[3]/div/div[2]/div")).click();
	}

	public void whatTeams() {
		driver.findElement(By.xpath("//textarea")).click();
		driver.findElement(By.xpath("//textarea")).sendKeys("Real madrid");
	}

	public void submitForm() {
		driver.findElement(By.id("ddm-form-submit")).click();
	}


	public String getSuccessMessage() {
		return driver.findElement(By.xpath("//h2[contains(.,'Thank you!')]")).getText();
		//return driver.findElement(By.cssSelector(".lfr-ddm__default-page-title")).isSelected();
	}



}

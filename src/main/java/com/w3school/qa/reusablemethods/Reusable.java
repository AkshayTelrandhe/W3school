package com.w3school.qa.reusablemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.TestBase;

public class Reusable extends TestBase {
	static WebDriverWait wait;

	public static void explicitWait(By l) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(l));

	}

}

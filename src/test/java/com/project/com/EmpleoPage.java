package com.project.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmpleoPage extends Base {
	
	private	WebDriver driver;
	By empleosLinkLocator= By.linkText("Empleos");
	By empleosPageLocator= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png']");
	
	public EmpleoPage(WebDriver driver) {
	super(driver);
	}
	
	public String testImage() throws InterruptedException {
		click(empleosLinkLocator);
		Thread.sleep(2000);
		if (isDisplayed(empleosPageLocator)) {
			
			
		return "se encontro la imagen buscado";	
		}
		else {
			
			return "no se encontro la imagen buscado";	
		}
	}
	
}

package com.project.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Imagen_Test {
	private WebDriver driver;
	EmpleoPage empleopage;

	@Before
	public void setUp() throws Exception {
		empleopage = new EmpleoPage(driver);
		driver = empleopage.chromeDriverConnection();
		empleopage.visit("https://www.choucairtesting.com");

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		String resultado = empleopage.testImage();
		assertEquals("se encontro la imagen buscado", resultado);

	}

}

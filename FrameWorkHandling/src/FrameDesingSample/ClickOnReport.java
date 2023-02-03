package FrameDesingSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickOnReport extends BaseClass{
	@Test
	public void createReport() {
		driver.findElement(By.xpath("//div[text()='Reports']")).click();
	}

}

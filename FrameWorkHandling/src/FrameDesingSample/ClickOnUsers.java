package FrameDesingSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickOnUsers  extends BaseClass{
@Test
	public void createUser() {
		driver.findElement(By.xpath("//div[text()='Users']")).click();
	}
}

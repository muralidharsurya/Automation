package FrameDesingSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickTask  extends BaseClass{
	@Test
	public void createTask() {
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	}

}

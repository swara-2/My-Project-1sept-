package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void TakescreenShot(WebDriver driver,String name) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Automation Programs\\SwagLab\\src\\main\\java\\utility\\Screenshot\\"+name+".jpeg");
		FileHandler.copy(source, destination);
	}

}

package comm.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class DriverUtils extends BaseClass{
	
	public static String captureScreenshot(String name)
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir")+"/Screenshots/"+name+".jpg";
		File dest=new File(path);
		try{
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			
		}
		return path;
	}

}

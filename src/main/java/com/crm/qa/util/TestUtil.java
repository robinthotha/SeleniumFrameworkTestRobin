package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{

	
	public static long PAGELOAD_TIMEOUT =2000;
	public static long IMPLICIT_WAIT =2000;
	
	
	
	/*public static void takeScreenshotAtEndOfTest() throws IOException{
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
		
		FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/"+ System.currentTimeMillis() + ".png"));
	}*/
}

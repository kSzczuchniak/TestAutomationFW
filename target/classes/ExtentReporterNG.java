package resources;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Date date = new Date();

        String time = dateFormat.format(date);
        String path = "Test-Report-" + time + ".html";
        String finalPath =System.getProperty("user.dir") + "\\reports\\" + path;
		ExtentSparkReporter reporter = new ExtentSparkReporter(finalPath);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Karol Szczuchniak");
		return extent;
		
	}
}

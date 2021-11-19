package reports;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import keywords.GenericKeywords;

public class ExtentManager extends GenericKeywords
{
	
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	
	public static ExtentReports getReports()
	{
		if(htmlReport == null) 
		{
			Date dt = new Date();
			String reportName = dt.toString().replace(':', '_').replace(' ', '_')+".html";
			htmlReport = new ExtentHtmlReporter(projectpath+"\\src\\main\\resources\\"+reportName);
			htmlReport.config().setDocumentTitle("Automation Report");
			htmlReport.config().setReportName("Functional testing report");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			report = new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("OS", "Windows");
			report.setSystemInfo("Tester Name" ,"Ravikanth Lella");
			report.setSystemInfo("Browser", "Chrome");
			
		}
		
		return report;
		
	}

}

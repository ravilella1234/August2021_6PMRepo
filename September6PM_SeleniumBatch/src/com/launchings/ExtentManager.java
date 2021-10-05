package com.launchings;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BaseTest
{
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if(htmlReport==null)
		{
			htmlReport = new ExtentHtmlReporter(projectPath+"\\HtmlReports\\report.html");
			htmlReport.config().setDocumentTitle("Automation Report");
			htmlReport.config().setReportName("Functional Testing Report");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			report = new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("OS", "windows10");
			report.setSystemInfo("Tester Name", "Ravikanth Lella");
			report.setSystemInfo("Browser", p.getProperty("chromebrowser"));			
		}
		return report;
	}
}

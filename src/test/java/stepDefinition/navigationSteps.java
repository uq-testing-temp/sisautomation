package stepDefinition;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class navigationSteps extends DriverFactory{

	@Before
	public void beforeScenario() {
		driver = new DriverFactory().getDriver();
	}
	
	@Given("^I navigate to graduations management$")
	public void management() throws Throwable {
		Thread.sleep(2000);
		driver.get(environment + "/psp/ps/EMPLOYEE/HRMS/c/UQ_GRAD_MENU.UQ_GRADUATIONS_MGT.GBL?PORTALPARAM_PTCNAV=UQ_GRADUATIONS_MGT_GBL&EOPP.SCNode=HRMS&EOPP.SCPortal=EMPLOYEE&EOPP.SCName=UQ_GRADUATIONS_MANAGEMENT&EOPP.SCLabel=Graduations%20Management&EOPP.SCPTfname=UQ_GRADUATIONS_MANAGEMENT&FolderPath=PORTAL_ROOT_OBJECT.UQ_MANAGE_GRADUATIONS.UQ_GRADUATIONS_MANAGEMENT.UQ_GRADUATIONS_MGT_GBL&IsFolder=false");
		driver.switchTo().frame("ptifrmtgtframe");
	}	

	@Given("^I navigate to Enrollment Request$")
	public void enrolment_request() throws Throwable {
		Thread.sleep(2000);
		driver.get(environment + "/psp/ps/EMPLOYEE/HRMS/c/MANAGE_ACADEMIC_RECORDS.ENRL_REQUEST.GBL?FolderPath=PORTAL_ROOT_OBJECT.HCSR_RECORDS_AND_REGISTRATION.HCSR_ENROLL_STUDENT.HC_ENRL_REQUEST_GBL&IsFolder=false&IgnoreParamTempl=FolderPath%2cIsFolder");
		driver.switchTo().frame("ptifrmtgtframe");
	}

	@After
    public void afterScenario() {
	  new DriverFactory().destroyDriver();
	}
	
	
}

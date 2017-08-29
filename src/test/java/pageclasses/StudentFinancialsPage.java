package pageclasses;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.DriverFactory;
import util.CustomFunctions;

public class StudentFinancialsPage extends DriverFactory {
	
    public static Logger logger = Logger.getLogger(StudentFinancialsPage.class);
//	
//    @FindBy(id="fldra_UQ_MANAGE_GRADUATIONS")
//    private static WebElement menuItem_manageGraduations;
//
//    @FindBy(id="fldra_UQ_GRADUATIONS_MANAGEMENT")
//    private static WebElement menuItem_graduationsManagement;
	
    @FindBy(className="PSEDITBOXLABEL")
	public static WebElement balancesLabel;   
		    

    public StudentFinancialsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }

	public static void navigate() throws InterruptedException  {
		//TODO implement navigation package - epic
		driver.switchTo().defaultContent();
		fluentElement(By.id("fldra_HCCC_MANAGE_STUDENT_FINANCIALS")).click();
	}

	public static void navigateToViewCustomerAccounts() throws InterruptedException {

		driver.switchTo().defaultContent();
		fluentElement(By.id("crefli_HC_ACCOUNT_VW_GBL4")).click();
	}

	public static void navigateToIHCStudentMaintanance() throws InterruptedException {

		driver.switchTo().defaultContent();
		fluentElement(By.id("fldra_HCSF_IHC")).click();
		fluentElement(By.id("crefli_HC_SSF_IHC_STDNT_GBL")).click();
	}
	
	public static void enterEmplID(String student) {
		switchFrame();
		fluentElement(By.id("PEOPLE_SRCH_SF_EMPLID")).clear();
		fluentElement(By.id("PEOPLE_SRCH_SF_EMPLID")).sendKeys(student);
		
	}

	public static boolean canSeeBalances() {
		switchFrame();
		return fluentElement(By.className("PSEDITBOXLABEL")).isDisplayed();
	}

	public static boolean navigateTo(String id) throws InterruptedException {
		driver.switchTo().defaultContent();
		fluentElement(By.id(id)).click();
		return true;	
	}

	public static void searchIHCstudent(String student) throws InterruptedException {
		switchFrame();
		CustomFunctions.fluentwait(driver.findElement(By.id("SSF_ADMPRG_SRCH_EMPLID")));
		fluentElement(By.id("SSF_ADMPRG_SRCH_EMPLID")).sendKeys(student);
		fluentElement(By.id("#ICSearch")).click();
	}

	public static boolean canSeeIHCSMDetails() {
		switchFrame();
		boolean pageOpen = fluentElement(By.id("win0divPSPAGECONTAINER")).isDisplayed();
		boolean nameDisplayed = fluentElement(By.id("HCR_PERSON_NM_I_NAME_DISPLAY")).isDisplayed();
		return pageOpen&&nameDisplayed;
	}

	public static boolean anticipatedAmountAUD(String amount) {
		
		return fluentElement(By.id("SSF_IHC_STDNT_SSF_IHC_RPT_AMT$0")).getText().equalsIgnoreCase(amount);
	}

	public static void navigateToIHCFinancials_View_UQ_Student_Accounts() throws InterruptedException {
		driver.switchTo().defaultContent();
		fluentElement(By.id("crefli_UQ_STUD_ACCT_PNG_GBL")).click();
	}
	
	public static void navigateToIHCFinancials_View_Customer_Accounts() throws InterruptedException {
		driver.switchTo().defaultContent();
		fluentElement(By.id("crefli_HC_ACCOUNT_VW_GBL4")).click();
	}
	
	public static void navigateToIHCFinancials_View_Corporate_Accounts() throws InterruptedException {
		driver.switchTo().defaultContent();
		fluentElement(By.id("crefli_HC_ACCOUNT_ORG_SF_GBL4")).click();
	}

	public static void navigateToIHCFinancials_tutionAndFees_calculation() throws InterruptedException {
		driver.switchTo().defaultContent();
		fluentElement(By.id("fldra_HCCC_CALCULATE_TUITION_AND_FEE")).click();
		fluentElement(By.id("crefli_HC_TUITION_CALC_GBL")).click();
		switchFrame();
		CustomFunctions.fluentwait(driver.findElement(By.id("app_label")));
	}
	
	public static void search() throws InterruptedException {
		CommonPageElements.search();
	}

	public static boolean seeChargesAndrefunds() {
		switchFrame();
		boolean pageOpen = fluentElement(By.id("win0divUQ_STUD_ACCT_VWGP$0")).isDisplayed();
		boolean charge = fluentElement(By.id("UQ_STUD_ACCT_VW_UQ_ACCT_CHARGE$0")).isDisplayed();
		boolean refund = fluentElement(By.id("win0divUQ_STUD_ACCT_VW_UQ_REFUND_AMT$0")).isDisplayed();
		return pageOpen&&charge&&refund;
	}

	public static boolean seeCustomerAccount() {
		switchFrame();
		boolean pageOpen = fluentElement(By.id("win0divSF_PAGE_TITLES_MNT_CST_PAGE_TITL2lbl")).isDisplayed();
		boolean type = fluentElement(By.id("ACCT_TYP_TBL_SF_DESCRSHORT$0")).isDisplayed();
		boolean accountNumber = fluentElement(By.id("ACCOUNT_VW_ACCOUNT_NBR$0")).isDisplayed();
		return pageOpen&&type&&accountNumber;
	}
	
	public static void searchExternalOrgID(String student) throws InterruptedException {
		switchFrame();
		fluentElement(By.id("ACCT_ORG_ALL_VW_EXT_ORG_ID")).sendKeys(student);
		fluentElement(By.id("#ICSearch")).click();
	}
	
	public static boolean seeCorpAccount() {
		switchFrame();
		boolean pageOpen = fluentElement(By.id("win0divSF_PAGE_TITLES_MNT_CST_PAGE_TITLElbl")).isDisplayed();
		boolean type = fluentElement(By.id("ACCT_TYP_TBL_SF_DESCRSHORT$0")).isDisplayed();
		boolean accountNumber = fluentElement(By.id("ACCOUNT_ORG_SF_ACCOUNT_NBR$0")).isDisplayed();
		return pageOpen&&type&&accountNumber;
	}
	
	public static void searchSF() throws InterruptedException {
		switchFrame();
		WebElement element = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.elementToBeClickable(By.id("#ICSearch")));
		element.click();
	}

	public static void navigateToStudentFinancialsBillCustomersCorporateBillsReviewInvoice() {
		driver.switchTo().defaultContent();
		fluentElement(By.id("fldra_HCCC_BILL_CUSTOMERS")).click();
		fluentElement(By.id("fldra_HCSF_CORPORATE_BILLS")).click(); 
		fluentElement(By.id("crefli_HC_BI_BILL_HEADER_ORG_GBL")).click();
		switchFrame();
		CustomFunctions.fluentwait(driver.findElement(By.id("app_label")));
	}

	public static void enterOrgID(String orgID) {
		switchFrame();
		CommonPageElements.enterTextField("BI_BILL_HDR_VW2_EXT_ORG_ID", orgID);
	}

	public static void navigateToStudentFinancialsPayment_Plans_Third_Party_Contract_Create() {
		driver.switchTo().defaultContent();
		fluentElement(By.id("fldra_HCCC_ADMINISTER_PAYMENT_PLANS")).click();
		fluentElement(By.id("fldra_HCCC_THIRDPARTY")).click();
		fluentElement(By.linkText("Create")).click();
		switchFrame();
		CustomFunctions.fluentwait(fluentElement(By.id("app_label")));
		
	}

	public static void navigateToStudent_Financials_UQ_Student_Financials_Reports_Payment_Allocation() {
		driver.switchTo().defaultContent();
		fluentElement(By.id("fldra_UQ_SF_REPORTS")).click();
		fluentElement(By.linkText("Payment Allocation")).click(); 
		switchFrame();
		CustomFunctions.fluentwait(fluentElement(By.id("app_label")));
		
	}

	public static void addPaymentAllocationNewValue() {
		fluentElement(By.className("PTUNDERLINE")).click();
	}

	public static void runControlID(String string) {
		CommonPageElements.enterTextField("PRCSRUNCNTL_RUN_CNTL_ID", CustomFunctions.getRandomLong());
		
	}

	public static void runOptions(String option) {
		
		switch (option) {
		
			case "overnight": 
				fluentElement(By.id("UQ_RC_RECS_UPDATE_FL")).click();
				break;
				
			case "monthly": 
				fluentElement(By.id("UQ_RC_RECS_UPDATE_FL$5$")).click();
				CommonPageElements.enterTextField("UQ_RC_RECS_FROM_DATE", "01/08/2016");
				CommonPageElements.enterTextField("UQ_RC_RECS_TO_DATE", "01/08/2017");
				break;
			
			case "adhoc": 
				fluentElement(By.id("UQ_RC_RECS_UPDATE_FL$6$")).click();
				CommonPageElements.enterTextField("UQ_RC_RECS_FROM_DATE", "01/08/2016");
				CommonPageElements.enterTextField("UQ_RC_RECS_TO_DATE", "01/08/2017");
				break;
			
		}
	}

	public static void navigateToStudent_Financials_Refunds_Student_Bank_Details() {
		fluentElement(By.id("fldra_HCCC_REFUND_CUSTOMERS")).click();
		fluentElement(By.linkText("Student Bank Details")).click();
		switchFrame();
		CustomFunctions.fluentwait(fluentElement(By.id("app_label")));		
	}
	
	public static void navigateToStudent_Financials_Refunds_Student_Refund() {
		fluentElement(By.id("fldra_HCCC_REFUND_CUSTOMERS")).click();
		fluentElement(By.linkText("Student Refund")).click();
		switchFrame();
		CustomFunctions.fluentwait(fluentElement(By.id("app_label")));		
	}
	
	public static void navigateToStudent_Financials_Refund_with_Extra_Amount() {
		fluentElement(By.id("fldra_HCCC_REFUND_CUSTOMERS")).click();
		fluentElement(By.linkText("Refund with Extra Amount")).click();
		switchFrame();
		CustomFunctions.fluentwait(fluentElement(By.id("app_label")));		
	}

	public static void searchStudentNumber(String number) throws InterruptedException {
		CommonPageElements.enterTextField("STDNT_SRCH_EMPLID", number);
		CommonPageElements.search();
	}

	public static boolean termActivationTabOpen() {
		return fluentElement(By.id("HCR_PERSON_NM_I_NAME_DISPLAY")).isDisplayed();
	}

	public static String academicCareerText() {

		return fluentElement(By.id("PSXLATITEM_XLATLONGNAME$0")).getText();
	}

	public static String getStudentCareerNbr() {
		
		return fluentElement(By.id("STDNT_CAR_TERM_STDNT_CAR_NBR$0")).getText();
	}
	
	public static boolean enrolCheckbox() {
		
		return fluentElement(By.id("STDNT_CAR_TERM_ELIG_TO_ENROLL$0")).isEnabled();
	}

	public static String getAcademicProgramm() {
		switchFrame();
		return fluentElement(By.id("ACAD_PROG_TBL_DESCR$0")).getText();
	}

	public static String getliabilityCode() {
		return fluentElement(By.id("SSR_HECS_ELEC_SSR_HECS_XMPT_STAT$0")).getText();
	}

	public static void enterPpleSearchID(String id) {
		CommonPageElements.enterTextField("PEOPLE_SRCH_EMPLID", id);
		
	}

	public static WebElement regionalTab() {
		return fluentElement(By.id("ICTAB_2"));
	}

	public static void addServiceIndicator() {
		switchFrame();
		fluentElement(By.id("SCC_SI_WRK_SCC_SI_LNK3")).click();
		CommonPageElements.enterTextFieldFrame("SRVC_IND_DATA_SRVC_IND_CD$0", "ACR");
		CommonPageElements.saveButtonFrame().click();
		
	}

	/**
	 * @return
	 */
	public static WebElement serviceIndicator() {
		switchFrame();
		return fluentElement(By.id("SRVC_IND_CODE$0"));
	}

	/**
	 * @return
	 */
	public static WebElement releaseButton() {
		return frameElement(By.id("SCC_SI_WRK_SCC_SI_RELEASE_BTN"));
	}

	/**
	 * @return
	 */
	public static WebElement serviceIndicatorMessage() {
		return fluentElement(By.id("SCC_SI_WRK_SCC_SI_DATA_GRP5"));
	}

	/**
	 * @param status
	 */
	public static void updateCitizenshipStatus(String status) {
		CommonPageElements.enterTextField("SCC_CITIZEN_H_COUNTRY$0", status);
		
	}

	/**
	 * @return citizenship status
	 */
	public static String getCitizenshipStatus() {
		
		return CommonPageElements.getElementValue(By.id("SCC_CITIZEN_H_COUNTRY$0"));
	}
}

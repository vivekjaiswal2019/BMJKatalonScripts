import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'viveknoexam@gmail.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword2')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(2)

Alias_Web = WebUI.getAttribute(findTestObject('Page_My Dashboard - BMJ OnExaminati/input_Alias_ctl00MainContenttx'), 'value')

WebUI.verifyMatch(Alias_Web, Alias_Expected, false)

Alias_Email = WebUI.getAttribute(findTestObject('Page_My Dashboard - BMJ OnExaminati/input_E-mail address_ctl00Main'), 'value')

WebUI.verifyMatch(Alias_Email, Email_Expected, false)

not_run: WebUI.verifyElementHasAttribute(findTestObject('Page_My Dashboard - BMJ OnExaminati/input_Last name_ctl00MainConte'), 
    '', 0)

not_run: WebUI.verifyElementHasAttribute(findTestObject('Page_My Dashboard - BMJ OnExaminati/input_Certification body numbe'), 
    '', 0)

not_run: WebUI.verifyElementHasAttribute(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Please selectCareer Gra'), 
    '', 0)

not_run: WebUI.verifyElementHasAttribute(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 
    '', 0)

not_run: WebUI.verifyElementHasAttribute(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Please Select...AllMedi'), 
    '', 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Home'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Help'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_CPD'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Managed Accounts'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Centre'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Video Tutorials'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Admin'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_My Profile'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Profile - BMJ OnExamination/Page_My Profile - BMJ OnExamination/img_Sign Out_Facebooklogo img-'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_My Profile - BMJ OnExamination/Page_My Profile - BMJ OnExamination/img_Sign Out_Twitterlogo img-f'), 
    0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


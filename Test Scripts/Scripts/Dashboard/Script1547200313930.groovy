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

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword2')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Help'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_CPD'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Managed Accounts'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Video Tutorials'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Choose Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Core Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Group Learning'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Admin'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Centre'), 0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision'))

WebUI.delay(2)

WebUI.verifyTextPresent('How would you like to study today?', false)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Home'), 0)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'))

WebUI.delay(2)

WebUI.verifyTextPresent('Score Analysis ', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_CPD'))

WebUI.delay(2)

WebUI.verifyTextPresent('CPD Modules', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Centre'))

WebUI.delay(2)

WebUI.verifyTextPresent('Partner Centre', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Admin'))

WebUI.delay(2)

WebUI.verifyTextPresent('Account Management', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Managed Accounts'))

WebUI.delay(2)

WebUI.verifyTextPresent('You do not have any groups associated.', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Help'))

WebUI.delay(2)

WebUI.verifyTextPresent('Frequently Asked Questions', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser()


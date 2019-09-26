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

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Help'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_CPD'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Managed Accounts'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Video Tutorials'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Choose Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Core Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Group Learning'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Admin'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Centre'), 0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision'))

WebUI.verifyTextPresent('How would you like to study today?', false)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Home'), 0)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'))

WebUI.verifyTextPresent('Score Analysis ', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

not_run: WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_CPD'))

not_run: WebUI.verifyTextPresent('CPD Modules', false)

not_run: WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Centre'))

WebUI.verifyTextPresent('Partner Centre', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Admin'))

WebUI.verifyTextPresent('Account Management', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Managed Accounts'))

WebUI.verifyTextPresent('You do not have any groups associated.', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Help'))

WebUI.verifyTextPresent('Frequently Asked Questions', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(1)

WebUI.verifyTextPresent('Please enter your email address', false)

WebUI.verifyTextPresent('Please enter your password', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), '')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(2)

WebUI.verifyTextPresent('Please enter your password', false)

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'Password2')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(2)

WebUI.verifyTextPresent('Forgot your password or changed your email address?', false)

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'vivek.jaiswal')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(2)

WebUI.verifyTextPresent('Invalid email address entered', false)

not_run: WebUI.closeBrowser()

WebUI.navigateToUrl('https://testmy.onexamination.com/login.aspx')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'assa@gmail.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword2')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(5)

WebUI.verifyTextPresent('Invalid login details entered', false)

not_run: WebUI.closeBrowser()

WebUI.navigateToUrl('https://testmy.onexamination.com/login.aspx')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword2')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'), 0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.delay(5)

WebUI.closeBrowser()


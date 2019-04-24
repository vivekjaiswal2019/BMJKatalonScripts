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

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/a_Forgot your password or chan'))

WebUI.verifyTextPresent('Changed your email address?', false)

WebUI.click(findTestObject('Page_Sign in problems/input_Invalid email address pl'))

WebUI.verifyTextPresent('Please enter your email address', false)

WebUI.setText(findTestObject('Page_Sign in problems/input_Email address_ctl00MainC'), '    ')

WebUI.click(findTestObject('Page_Sign in problems/input_Invalid email address pl'))

WebUI.verifyTextPresent('Please enter your email address', false)

WebUI.setText(findTestObject('Page_Sign in problems/input_Email address_ctl00MainC'), 'abc')

WebUI.click(findTestObject('Page_Sign in problems/input_Invalid email address pl'))

WebUI.verifyTextPresent('Invalid email address, please check it is typed correctly', false)

WebUI.setText(findTestObject('Page_Sign in problems/input_Email address_ctl00MainC'), 'abc@gmail')

WebUI.click(findTestObject('Page_Sign in problems/input_Invalid email address pl'))

WebUI.verifyTextPresent('Invalid email address, please check it is typed correctly', false)

WebUI.setText(findTestObject('Page_Sign in problems/input_Email address_ctl00MainC'), '@gmail.com')

WebUI.click(findTestObject('Page_Sign in problems/input_Invalid email address pl'))

WebUI.verifyTextPresent('Invalid email address, please check it is typed correctly', false)

WebUI.setText(findTestObject('Page_Sign in problems/input_Email address_ctl00MainC'), 'a1b2c3@gmail.com')

WebUI.click(findTestObject('Page_Sign in problems/input_Invalid email address pl'))

WebUI.verifyTextPresent('Please check your email account inbox, the message should arrive within 5 minutes.', false)

not_run: WebUI.click(findTestObject('Page_Sign in problems/a_Sign In'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/a_Forgot your password or chan'))

not_run: WebUI.setText(findTestObject('Page_Sign in problems/input_Email address_ctl00MainC'), 'vivek.jaiswal@northgateps.com')

not_run: WebUI.click(findTestObject('Page_Sign in problems/input_Invalid email address pl'))

not_run: WebUI.verifyTextPresent('There\'s been a problem sending your message', false)

WebUI.click(findTestObject('Page_Sign in problems/a_Sign In'))

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/a_Forgot your password or chan'))

WebUI.click(findTestObject('Page_Sign in problems/Page_Sign in problems/a_contact our support team'))

WebUI.verifyTextPresent('Contact Us', false)

WebUI.closeBrowser()


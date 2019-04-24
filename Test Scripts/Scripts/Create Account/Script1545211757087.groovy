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

WebUI.click(findTestObject('Page_BMJ OnExamination Create Account/input_terms conditions and pri'))

WebUI.verifyTextPresent('Please enter your email address', false)

WebUI.verifyTextPresent('Please enter a password', false)

WebUI.verifyTextPresent('Please confirm your password', false)

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Password_ctl00MainConten'), 'Rave')

WebUI.sendKeys(findTestObject('Page_BMJ OnExamination Create Account/input_Email address_ctl00MainC'), Keys.chord(Keys.TAB))

WebUI.verifyTextPresent('Password must contain at least one number and one uppercase and lowercase letters and one special character (!@#$%^&*-_), and should be of 8-20 characters', 
    false)

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Confirm password_ctl00Ma'), 'Ra')

WebUI.sendKeys(findTestObject('Page_BMJ OnExamination Create Account/input_Confirm password_ctl00Ma'), Keys.chord(Keys.TAB))

WebUI.verifyTextPresent('Your new password and confirmed password must match', false)

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Email address_ctl00MainC'), 'testnewa@gmail.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Password_ctl00MainConten'), 'R@ve1234')

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Confirm password_ctl00Ma'), 'R@ve1234')

WebUI.focus(findTestObject('Page_BMJ OnExamination Create Account/input_terms conditions and pri'))

WebUI.sendKeys(findTestObject('Page_BMJ OnExamination Create Account/input_terms conditions and pri'), Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent('To continue, you must agree to the BMJ OnExamination terms, conditions and privacy policy', false)

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Email address_ctl00MainC'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Password_ctl00MainConten'), 'R@ve1234')

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Confirm password_ctl00Ma'), 'R@ve1234')

WebUI.check(findTestObject('Page_BMJ OnExamination Create Account/input_Communication preference (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('Page_BMJ OnExamination Create Account/input_terms conditions and pri'))

WebUI.sendKeys(findTestObject('Page_BMJ OnExamination Create Account/input_terms conditions and pri'), Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent('The email address entered already exists.', false)

not_run: WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Email address_ctl00MainC'), 'testnewa@gmail.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Password_ctl00MainConten'), 'R@ve1234')

WebUI.setText(findTestObject('Page_BMJ OnExamination Create Account/input_Confirm password_ctl00Ma'), 'R@ve1234')

WebUI.check(findTestObject('Page_BMJ OnExamination Create Account/input_Communication preference (1)'))

WebUI.focus(findTestObject('Page_BMJ OnExamination Create Account/input_terms conditions and pri'))

WebUI.sendKeys(findTestObject('Page_BMJ OnExamination Create Account/input_terms conditions and pri'), Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent('Tick to receive information and special offers about BMJs products and services. BMJ will mainly contact you by email but occasionally by post, telephone, or SMS.', 
    false)

WebUI.verifyElementNotChecked(findTestObject('Page_BMJ OnExamination Create Account/input_Communication preference'), 0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('Please enter your email address', false)

WebUI.verifyTextPresent('Please enter your password', false)

WebUI.delay(2)

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), '')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Please enter your password', false)

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'Password2')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Download our Mobile App', false)

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Invalid email address entered', false)

not_run: WebUI.closeBrowser()

WebUI.navigateToUrl('https://testmy.onexamination.com/login.aspx')

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'assa@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword2')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

WebUI.verifyTextPresent('Invalid login details entered', false)

not_run: WebUI.closeBrowser()

WebUI.navigateToUrl('https://testmy.onexamination.com/login.aspx')

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'), 0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.delay(5)

WebUI.closeBrowser()


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

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'testautomationoneexam@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('You currently have no purchased exam revision material.', false)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Help Tab - Old'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_CPD'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Managed Accounts'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Video Tutorials'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Admin'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Centre'), 0)

WebUI.click(findTestObject('MVC Exam Revision/Help Tab - Old'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Home Tab - Old'), 0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('MVC Exam Revision/Sign Out - Old'))

WebUI.delay(1)

WebUI.closeBrowser()


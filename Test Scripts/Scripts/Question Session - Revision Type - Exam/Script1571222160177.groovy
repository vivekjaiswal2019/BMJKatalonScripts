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

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'testautomation@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC_Choose Questions/With Questions - All'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC_Choose Questions/Select Curriculum'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC_Choose Questions/Decision Analysis'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/DA4 Tag'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/DA5 Tag'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/DA6 Tag'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Revision Type - Exam'))

WebUI.click(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 1 of 3', false)

WebUI.verifyTextNotPresent('Test Analysis', false)

WebUI.verifyElementNotPresent(findTestObject('Test Analysis'), 0)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/DA4 RB'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(5)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 2 of 3', false)

WebUI.verifyTextNotPresent('Test Analysis', false)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/DA5 RB'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(5)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 3 of 3', false)

WebUI.verifyTextNotPresent('Test Analysis', false)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/DA6 RB'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(5)

WebUI.verifyTextPresent('Test summary', false)


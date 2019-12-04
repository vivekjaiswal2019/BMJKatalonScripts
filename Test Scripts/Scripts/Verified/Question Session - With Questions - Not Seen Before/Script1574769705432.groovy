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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'haynes.owen98@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

WebUI.navigateToUrl('https://testmy.onexamination.com/Exam/Dashboard')

WebUI.click(findTestObject('MVC Exam Revision/Button Start your revision session'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC_Choose Questions/Select Curriculum'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Basic Sciences'))

WebUI.delay(2)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.delay(10)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 1 of 2', false)

//47657 == WebUI.verifyTextPresent('A patient is diagnosed with an abnormality of oligopeptide disposal', true)
if (WebUI.verifyTextPresent('A patient is diagnosed with an abnormality of oligopeptide disposal', false, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA6 RB'))
}

if (WebUI.verifyTextPresent('You are attempting to find a disease causing gene, and you have identified a number of families in which the disease is transmitted.', 
    false, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA5 RB'))
}

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(2)

WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/Correct Icon'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Go to summary'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.verifyTextPresent('Test summary', false)

WebUI.navigateToUrl('https://testmy.onexamination.com/Exam/Dashboard')

WebUI.click(findTestObject('MVC Exam Revision/Button Start your revision session'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Select Curriculum'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Basic Sciences'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/With Questions - Not Seen Before'))

WebUI.delay(2)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.delay(10)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 1 of 1', false)

if (WebUI.verifyTextPresent('A patient is diagnosed with an abnormality of oligopeptide disposal', false, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA6 RB'))
}

if (WebUI.verifyTextPresent('You are attempting to find a disease causing gene, and you have identified a number of families in which the disease is transmitted.', 
    false, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA5 RB'))
}

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(2)

WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/Correct Icon'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/GoToSummary'))

WebUI.delay(2)

WebUI.verifyTextPresent('Test summary', false)

WebUI.navigateToUrl('https://testmy.onexamination.com/Exam/Dashboard')

WebUI.click(findTestObject('MVC Exam Revision/Button Start your revision session'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Select Curriculum'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Basic Sciences'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/With Questions - Not Seen Before'))

WebUI.delay(2)

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()


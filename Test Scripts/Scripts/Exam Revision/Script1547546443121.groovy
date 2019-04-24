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

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision (1)'))

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.verifyTextPresent('How would you like to study today?', false)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/span_Choose Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/span_Core Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/span_Mock Tests'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/span_Work Hard'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/span_Group Learning'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/span_Revision Advice'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/span_Tags'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/span_Learning Journal'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Choose Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Core Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Group Learning'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Learning Journal'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Mock Tests'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_My Profile'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Sign Out'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Exam Revision - BMJ OnExaminat/div_Work Hard'), 0)

WebUI.click(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Sign Out'))

WebUI.closeBrowser()


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

WebUI.openBrowser('https://testcontrol.onexamination.com/Support/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Control Sign in/Alias'), 'rafiqull.sheikh')

WebUI.setText(findTestObject('Page_Control Sign in/Password'), 'R@ve1234')

WebUI.click(findTestObject('Page_Control Sign in/Sign In'))

WebUI.delay(3)

WebUI.verifyTextPresent('Help centre', false)

WebUI.verifyTextPresent('New requests', false)

WebUI.click(findTestObject('Page_Control Exam calendar/a_Users'))

WebUI.verifyTextPresent('Manage users', false)

WebUI.verifyTextPresent('Search for a user', false)

WebUI.setText(findTestObject('Page_Control Manage users/Email Address'), 'testautomation@gmail.com')

WebUI.click(findTestObject('Page_Control Manage users/Search Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Control Manage users/a_Edit exams'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Control Manage users/Vivek.Jaiswal_UKCAT_Reset_Scores'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Control Help centre/a_Sign out'))

WebUI.delay(2)

WebUI.navigateToUrl('https://testmy.onexamination.com/login.aspx')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'testautomation@gmail.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword1')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'))

WebUI.verifyTextPresent('Score Analysis', false)

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsTotal'), '185')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Mean score'), '62.2')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Current mean'), '0')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Naive mean'), '0')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsAnswered'), '0')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


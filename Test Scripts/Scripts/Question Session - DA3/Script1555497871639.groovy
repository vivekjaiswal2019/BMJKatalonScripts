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

WebUI.click(findTestObject('MVC_Choose Questions/DA3 Tag'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.delay(10)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 1 of 1', false)

WebUI.verifyTextPresent('Robots follow the instructions given', false)

WebUI.navigateToUrl('https://testmy.onexamination.com/GenericAssessment/GenericAssessmentLearningJournal.aspx')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'))

WebUI.delay(1)

WebUI.getUrl()

WebUI.verifyTextPresent('Robots follow the instructions given', false)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA3 RB'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(5)

WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/Correct Icon'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/GoToSummary'))

WebUI.delay(5)

WebUI.verifyTextPresent('Test summary', false)

WebUI.navigateToUrl('https://testmy.onexamination.com/Review/ScoreAnalysis.aspx')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsTotal'), '185')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Mean score'), '62.2')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Current mean'), '50')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Naive mean'), '50')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsAnswered'), '2')

WebUI.closeBrowser()


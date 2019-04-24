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

Height = WebUI.getPageHeight()

Width = WebUI.getPageWidth()

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'testautomation@gmail.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword1')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/Page_My Profile - BMJ OnExamination/a_Exam Revision'))

not_run: WebUI.click(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Choose Questions'))

WebUI.navigateToUrl('https://testmy.onexamination.com/Account/Default.aspx')

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 0)

WebUI.selectOptionByLabel(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 'UKCAT', 
    false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 
    'UKCAT', false, 20)

WebUI.delay(5)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Choose Questions'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_I have got wrong before_'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All curricula_qCat'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_Abstract Reasoning_Categ'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All_coreAdvanceOption'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_No tags_qTag'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_QR6_qTag6'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA1_qTag7'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA3_qTag8'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA2_qTag9'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA5_qTag10'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA6_qTag11'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'), ['1 question'])

WebUI.scrollToPosition(0, 0)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyTextPresent('No of Questions: 1', false)

WebUI.verifyTextPresent('Curricula: Decision Analysis', false)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test'))

WebUI.delay(10)

SessionURL = WebUI.getUrl()

WebUI.verifyTextPresent('Question Session', false)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Section'))

WebUI.verifyTextPresent('I wish I was like those who are not afraid and love to travel alone on ships', false)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(3)

WebUI.verifyTextPresent('Please select 1 option', false)

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA2 RB'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(5)

WebUI.verifyTextPresent('The code literally translates as \'Envy combine(opposite fear love) increase boat alone\'. \'Increase boat\' is best interpreted as a big boat, ship or big ship and, hence, answers 1 and 2 are unlikely to be correct. Answer 4 does not contain the word \'alone\' but the word \'singular\' so also appears unlikely to be correct. This leaves answers 3 or 5. \'I wish\' could be \'envy\' in both cases. \'Combine (opposite fear love)\' suggests that not afraid and \'love\' are the subject of the \'wish\' or \'envy\' rather than splitting the sense to mean a lovely ship. Answer 3 is therefore the most likely to be correct.', 
    false)

WebUI.scrollToElement(findTestObject('Page_BMJ OnExamination Assessment Session/Feedback Section'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Feedback Section Link'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Leave question feedback link'))

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Feedback TextBox'))

WebUI.setText(findTestObject('Page_BMJ OnExamination Assessment Session/Feedback TextBox'), 'This is Test Feedback')

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Feedback Submit'))

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/Feedback Thank you'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Revision Notes Section Link'))

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Revision Notes TextBox'))

WebUI.setText(findTestObject('Page_BMJ OnExamination Assessment Session/Revision Notes TextBox'), 'This is test Revision Notes')

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Revision Notes Save'))

WebUI.delay(5)

WebUI.verifyTextPresent('Your revision notes were successfully saved.', false)

WebUI.verifyTextPresent('This is test Revision Notes', false)

WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/Correct Icon'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/GoToSummary'))

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/TS_Revision Notes'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/TS_Revision Notes'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_BMJ OnExamination Assessment Session/TS_Revision Notes_Text'), 'This is test Revision Notes')

WebUI.verifyTextPresent('Test summary', false)

WebUI.navigateToUrl('https://testmy.onexamination.com/Review/ScoreAnalysis.aspx')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsTotal'), '185')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Mean score'), '62.2')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Current mean'), '100')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Naive mean'), '100')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsAnswered'), '1')

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/a_Learning Journal'))

WebUI.delay(3)

LJURL = WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'), 'href')

if (SessionURL == LJURL) {
    KeywordUtil.markPassed('LJ QS Link is proper')
}

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_Notes'))
	


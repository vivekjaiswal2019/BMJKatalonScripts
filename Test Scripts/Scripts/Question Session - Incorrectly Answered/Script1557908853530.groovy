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

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA1_qTag7'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA3_qTag8'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA2_qTag9'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA5_qTag10'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA6_qTag11'))

WebUI.delay(2)

not_run: Count = WebUI.getNumberOfTotalOption(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'))

not_run: WebUI.verifyEqual(Count, 2)

WebUI.verifyOptionsPresent(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'), ['2 questions'])

WebUI.scrollToPosition(0, 0)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyTextPresent('No of Questions: 2', false)

WebUI.verifyTextPresent('Curricula: Decision Analysis', false)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test'))

WebUI.delay(10)

WebUI.verifyTextPresent('Question Session', false)

SessionURL = WebUI.getUrl()

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Section'))

WebUI.scrollToPosition(9999999, 9999999)

if (WebUI.verifyTextPresent('Robots follow the instructions given', true, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA3 RB'))
} else {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA2 RB'))
}

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(5)

WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/Correct Icon'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Next Question'))

WebUI.delay(5)

WebUI.scrollToPosition(9999999, 9999999)

if (WebUI.verifyTextPresent('Robots follow the instructions given', false, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA3 RB'))
} else {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA2 RB'))
}

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(5)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/GoToSummary'))

WebUI.delay(5)

WebUI.verifyTextPresent('Test summary', false)

WebUI.navigateToUrl('https://testmy.onexamination.com/Review/ScoreAnalysis.aspx')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsTotal'), '185')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Mean score'), '62.2')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Current mean'), '50')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Naive mean'), '50')

WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsAnswered'), '2')

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/a_Learning Journal'))

LJURL = WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'), 'href')

if (SessionURL == LJURL) {
    KeywordUtil.markPassed('LJ QS Link is proper')
}

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'))

WebUI.delay(5)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/TS_Retry Incorrect Questions'))

WebUI.delay(5)

WebUI.verifyTextPresent('Question Session', false)

WebUI.scrollToPosition(99999, 99999)

WebUI.verifyTextPresent('Robots follow the instructions given', false)

WebUI.verifyElementNotChecked(findTestObject('Page_BMJ OnExamination Assessment Session/DA3 RB'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/a_Learning Journal'))

LJURLRetry = WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'), 'href')

not_run: LJURLRetry = WebUI.getUrl()

not_run: if (SessionURL != LJURLRetry) {
    KeywordUtil.markPassed('LJ QS Link is proper')
}


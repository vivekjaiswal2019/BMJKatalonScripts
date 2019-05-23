import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\VIVEKJ~1.GLO\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Question Session - Incorrectly Answered\\20190523_173640\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

not_run: WebUI.maximizeWindow()

not_run: Height = WebUI.getPageHeight()

not_run: Width = WebUI.getPageWidth()

not_run: WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'testautomation@gmail.com')

not_run: WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword1')

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/Page_My Profile - BMJ OnExamination/a_Exam Revision'))

not_run: WebUI.click(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Choose Questions'))

not_run: WebUI.navigateToUrl('https://testmy.onexamination.com/Account/Default.aspx')

not_run: WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 
    0)

not_run: WebUI.selectOptionByLabel(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 
    'UKCAT', false)

not_run: WebUI.verifyOptionSelectedByLabel(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 
    'UKCAT', false, 20)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Home'))

not_run: WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Choose Questions'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_I have got wrong before_'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All curricula_qCat'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_Abstract Reasoning_Categ'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All_coreAdvanceOption'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_No tags_qTag'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_QR6_qTag6'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA1_qTag7'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA3_qTag8'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA2_qTag9'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA5_qTag10'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_DA6_qTag11'))

not_run: WebUI.delay(2)

not_run: Count = WebUI.getNumberOfTotalOption(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'))

not_run: WebUI.verifyEqual(Count, 2)

not_run: WebUI.verifyOptionsPresent(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'), 
    ['2 questions'])

not_run: WebUI.scrollToPosition(0, 0)

not_run: WebUI.verifyTextPresent('Keywords: None', false)

not_run: WebUI.verifyTextPresent('No of Questions: 2', false)

not_run: WebUI.verifyTextPresent('Curricula: Decision Analysis', false)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test'))

not_run: WebUI.delay(10)

not_run: WebUI.verifyTextPresent('Question Session', false)

not_run: SessionURL = WebUI.getUrl()

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Section'))

not_run: WebUI.scrollToPosition(9999999, 9999999)

not_run: if (WebUI.verifyTextPresent('Robots follow the instructions given', true, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA3 RB'))
} else {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA2 RB'))
}

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

not_run: WebUI.delay(5)

not_run: WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/Correct Icon'), 0)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Next Question'))

not_run: WebUI.delay(5)

not_run: WebUI.scrollToPosition(9999999, 9999999)

not_run: if (WebUI.verifyTextPresent('Robots follow the instructions given', false, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA3 RB'))
} else {
    WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/DA2 RB'))
}

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

not_run: WebUI.delay(5)

not_run: WebUI.scrollToPosition(9999999, 9999999)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/GoToSummary'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyTextPresent('Test summary', false)

not_run: WebUI.navigateToUrl('https://testmy.onexamination.com/Review/ScoreAnalysis.aspx')

not_run: WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/QuestionsTotal'), '185')

not_run: WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Mean score'), '62.2')

not_run: WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Current mean'), '50')

not_run: WebUI.verifyElementText(findTestObject('Page_Score Analysis - BMJ OnExamina/Naive mean'), '50')

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

if (SessionURL != LJURLRetry) {
    KeywordUtil.markPassed('LJ QS Link is proper')
}

''', 'Test Cases/Question Session - Incorrectly Answered', new TestCaseBinding('Test Cases/Question Session - Incorrectly Answered',[:]), FailureHandling.STOP_ON_FAILURE , false)
    

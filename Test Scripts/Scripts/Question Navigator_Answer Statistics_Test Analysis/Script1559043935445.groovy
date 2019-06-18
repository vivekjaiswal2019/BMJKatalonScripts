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

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'testautomation@gmail.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword1')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(5)

WebUI.navigateToUrl('https://testmy.onexamination.com/Account/Default.aspx')

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 0)

WebUI.selectOptionByLabel(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 'UKCAT', 
    false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 
    'UKCAT', false, 20)

WebUI.delay(5)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Choose Questions'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_I have got wrong before_'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All curricula_qCat'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_Decision Analysis_Catego'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All_coreAdvanceOption'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_No tags_qTag'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_QR1_qTag1'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_QR2_qTag2'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_QR3_qTag3'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_QR4_qTag4'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_QR5_qTag5'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_QR6_qTag6'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'), ['4 questions'])

WebUI.scrollToPosition(0, 0)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyTextPresent('No of Questions: 4', false)

WebUI.verifyTextPresent('Curricula: Quantitative Reasoning', false)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test'))

WebUI.delay(10)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Score: 0%', false)

WebUI.verifyTextPresent('Total Answered: 0', false)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_A'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_B'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_C'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_D'), 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_A'), 'class', 
    'q-nav-block QuestionNavNotComplete ', 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_B'), 'class', 
    'q-nav-block QuestionNavNotComplete ', 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_C'), 'class', 
    'q-nav-block QuestionNavNotComplete ', 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_D'), 'class', 
    'q-nav-block QuestionNavNotComplete ', 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_A'))

WebUI.waitForJQueryLoad(0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Popup'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Go_to_question'))

WebUI.delay(2)

WebUI.verifyTextPresent('Quantitative Reasoning 2', false)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_B'))

WebUI.waitForJQueryLoad(0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Popup'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Go_to_question'))

WebUI.delay(2)

WebUI.verifyTextPresent('Quantitative Reasoning 9', false)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_C'))

WebUI.waitForJQueryLoad(0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Popup'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Go_to_question'))

WebUI.delay(2)

WebUI.verifyTextPresent('Quantitative Reasoning 13', false)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_D'))

WebUI.waitForJQueryLoad(0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Popup'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Go_to_question'))

WebUI.delay(2)

WebUI.verifyTextPresent('Quantitative Reasoning 14', false)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_A'))

WebUI.waitForJQueryLoad(0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Popup'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Go_to_question'))

WebUI.delay(2)

WebUI.verifyTextPresent('Quantitative Reasoning 2', false)

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_A_SubQ_A'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_A_SubQ_B'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_A_SubQ_C'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_A_SubQ_D'))

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(5)

WebUI.verifyTextPresent('Average score: 82.23%', false)

WebUI.verifyTextPresent('Times answered: 2390', false)

WebUI.verifyTextPresent('Score: 100%', false)

WebUI.verifyTextPresent('Total Answered: 1', false)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Next Question'))

WebUI.verifyTextNotPresent('Quantitative Reasoning 2', false)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.delay(2)

WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_A'), 'class')

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_A'), 'class', 
    'q-nav-block QuestionNavComplete correct', 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_B'))

WebUI.waitForJQueryLoad(0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Popup'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Go_to_question'))

WebUI.delay(2)

WebUI.verifyTextPresent('Quantitative Reasoning 9', false)

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_B_SubQ_A'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_B_SubQ_B'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_B_SubQ_C'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_B_SubQ_D'))

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(2)

WebUI.verifyTextPresent('Average score: 66.21%', false)

WebUI.verifyTextPresent('Times answered: 2134', false)

WebUI.verifyTextPresent('Score: 50%', false)

WebUI.verifyTextPresent('Total Answered: 2', false)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Next Question'))

WebUI.verifyTextNotPresent('Quantitative Reasoning 9', false)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.delay(2)

WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_B'), 'class')

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_B'), 'class', 
    'q-nav-block QuestionNavComplete incorrect', 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_C'))

WebUI.waitForJQueryLoad(0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Popup'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/QN_Go_to_question'))

WebUI.delay(2)

WebUI.verifyTextPresent('Quantitative Reasoning 13', false)

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_C_SubQ_A'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_C_SubQ_B'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_C_SubQ_C'))

WebUI.check(findTestObject('Page_BMJ OnExamination Assessment Session/QN_C_SubQ_D'))

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(2)

WebUI.verifyTextPresent('Average score: 86.49%', false)

WebUI.verifyTextPresent('Times answered: 2284', false)

WebUI.verifyTextPresent('Score: 50%', false)

WebUI.verifyTextPresent('Total Answered: 3', false)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Next Question'))

WebUI.delay(2)

WebUI.verifyTextNotPresent('Quantitative Reasoning 13', false)

WebUI.focus(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Question Navigator Section'))

WebUI.delay(2)

WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_C'), 'class')

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_C'), 'class', 
    'q-nav-block QuestionNavComplete partial', 0)

WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_D'), 'class')

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Assessment Session/QN_NotComplete_D'), 'class', 
    'q-nav-block QuestionNavNotComplete ', 0)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/GoToSummary'))


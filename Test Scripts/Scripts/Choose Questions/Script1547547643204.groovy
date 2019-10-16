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

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'))

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'UKCAT', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'MRCP Part 1', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'MRCP Part 2 Written', false, 
    0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'Tropical Health Education Trust module', 
    false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'Medical Student Finals', false, 
    0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'MRCPCH Foundation/Theory and Science (with T/F)', 
    false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'MRCPsych Paper 1 and 2', false, 
    0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'MRCPCH Part 2', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'Endocrinology and Diabetes SCE', 
    false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'GP ST', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'Situational Judgement Test', 
    false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'FRCS - General Surgery', false, 
    0)

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.click(findTestObject('MVC Exam Revision/Sign Out'))

WebUI.delay(0)

WebUI.closeBrowser()

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'testautomation@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'))

WebUI.verifyElementNotPresent(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 0)

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC Exam Revision/Button Start your revision session'))

WebUI.delay(2)

WebUI.verifyElementNotPresent(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 0)

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.verifyTextPresent('Current Options Selected', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyTextPresent('Curricula: All', false)

WebUI.verifyTextPresent('UKCAT', false)

WebUI.verifyTextPresent('185', false)

WebUI.verifyElementText(findTestObject('MVC_Choose Questions/Total Count of questions'), '185')

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Home Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Exam Revision Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/CPD Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Help Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Mock Tests Sub Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Group Learning Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Revision Advice Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Tags Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Learning Journal Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Performance Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Revision Advice Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC_Choose Questions/Button Start Questions'), 0)

WebUI.verifyElementNotChecked(findTestObject('MVC_Choose Questions/Core Questions checkbox'), 0)

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/All Curriculum'), 0)

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/With Questions - All'), 0)

WebUI.verifyElementNotChecked(findTestObject('MVC_Choose Questions/With Questions - Not Seen Before'), 0)

WebUI.verifyElementNotChecked(findTestObject('MVC_Choose Questions/With Questions - Wrong Before'), 0)

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/Revision Type - Revision'), 0)

WebUI.verifyElementNotChecked(findTestObject('MVC_Choose Questions/Revision Type - Exam'), 0)

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/Question Difficulty All'), 0)

WebUI.verifyElementNotChecked(findTestObject('MVC_Choose Questions/Question Difficulty Adapt For Me'), 0)

WebUI.verifyElementNotChecked(findTestObject('MVC_Choose Questions/Question Difficulty Select Difficulty Parent'), 0)

WebUI.click(findTestObject('MVC_Choose Questions/Question Difficulty Select Difficulty Parent'))

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/Question Difficulty - Select Difficulty - Child - All'), 
    0)

not_run: WebUI.verifyElementNotChecked(findTestObject('MVC_Choose Questions/Question Difficulty - Select Difficulty - Child - Easy'), 
    0)

not_run: WebUI.verifyElementNotChecked(findTestObject('null'), 0)

not_run: WebUI.verifyElementNotChecked(findTestObject('null'), 0)

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/Check_Question Type_BAQ'), 0)

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/Check_Question Type_PSQ'), 0)

WebUI.verifyElementPresent(findTestObject('MVC_Choose Questions/Button_Apply_Keyword Filter'), 0)

WebUI.click(findTestObject('MVC_Choose Questions/Question Difficulty All'), FailureHandling.STOP_ON_FAILURE)

String ExpectedPlaceholder = 'eg. diabetes, thyroid'

String placeholder = WebUI.getAttribute(findTestObject('MVC_Choose Questions/Keyword Filter Field'), 'ActualPlaceholder')

if (ExpectedPlaceholder == placeholder) {
    KeywordUtil.markPassed('Placeholder is  as expected.')
}

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('MVC_Choose Questions/Select Curriculum'))

WebUI.verifyTextPresent('Abstract Reasoning', false)

WebUI.verifyTextPresent('Decision Analysis', false)

WebUI.verifyTextPresent('Quantitative Reasoning', false)

WebUI.verifyTextPresent('Verbal Reasoning', false)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 11)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '20 questions', '30 questions'
        , '40 questions', '50 questions', '60 questions', '70 questions', '80 questions', '90 questions', '100 questions'
        , 'All questions (185)'])

WebUI.verifyTextPresent('All', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.check(findTestObject('MVC_Choose Questions/Abstract Reasoning'))

WebUI.delay(5)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 6)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '20 questions', '30 questions'
        , '40 questions', '50 questions', '56 questions'])

WebUI.verifyTextPresent('Curricula: Abstract Reasoning', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.uncheck(findTestObject('MVC_Choose Questions/Abstract Reasoning'))

WebUI.delay(2)

WebUI.check(findTestObject('MVC_Choose Questions/Quantitative Reasoning'))

WebUI.delay(5)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 2)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '16 questions'])

WebUI.verifyTextPresent('Curricula: Quantitative Reasoning', false)

WebUI.verifyTextPresent('Best Answer Question', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/Check_Question Type_BAQ'), 0)

WebUI.verifyTextPresent('Problem Solving Question', false)

WebUI.verifyElementChecked(findTestObject('MVC_Choose Questions/Check_Question Type_PSQ'), 0)

WebUI.uncheck(findTestObject('MVC_Choose Questions/Check_Question Type_PSQ'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/Check_Question Type_PSQ'))

WebUI.delay(1)

WebUI.uncheck(findTestObject('MVC_Choose Questions/Check_Question Type_BAQ'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 2)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '16 questions'])

WebUI.delay(1)

WebUI.uncheck(findTestObject('MVC_Choose Questions/Check_Question Type_PSQ'))

WebUI.delay(1)

WebUI.uncheck(findTestObject('MVC_Choose Questions/Check_Question Type_BAQ'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 2)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '16 questions'])

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/Check_Question Type_PSQ'))

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/Check_Question Type_BAQ'))

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/With Questions - Not Seen Before'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 2)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '16 questions'])

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/With Questions - Wrong Before'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/With Questions - All'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 2)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '16 questions'])

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/DA1 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/DA2 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/DA3 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/DA4 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/DA5 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/DA6 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/QR1 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['1 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/QR2 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['2 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/QR3 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['3 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/QR4 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['4 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/QR5 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['5 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/QR6 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['6 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyTextNotPresent('Editor\'s Choice', false)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/Abstract Reasoning'))

WebUI.delay(0)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['6 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/Decision Analysis'))

WebUI.delay(0)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

not_run: WebUI.verifyEqual(Count, 2)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '12 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('MVC_Choose Questions/Keyword Filter Field'), 'test')

WebUI.click(findTestObject('MVC_Choose Questions/Button_Apply_Keyword Filter'))

WebUI.delay(1)

WebUI.verifyTextPresent('Keywords: test', false)

WebUI.verifyTextPresent('Curricula: Abstract Reasoning, Decision Analysis & 1 Others', false)

WebUI.delay(0)

int count = 0

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

not_run: WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['2 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('E:\\Katalon Studio\\Screenshots\\Tags_UKCAT.png')

WebUI.closeBrowser()


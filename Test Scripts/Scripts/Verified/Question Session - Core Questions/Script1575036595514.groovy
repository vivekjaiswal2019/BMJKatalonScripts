import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab'))

not_run: WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Resource dropdown'))

WebUI.selectOptionByLabel(findTestObject('MVC_Choose Questions/Exam Resource dropdown'), 'MRCP Part 1', false)

WebUI.verifyOptionSelectedByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'MRCP Part 1', false, 0)

WebUI.delay(1)

WebUI.click(findTestObject('MVC Exam Revision/Button Start your revision session'))

WebUI.delay(2)

not_run: WebUI.verifyElementNotPresent(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 0)

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.verifyTextPresent('Current Options Selected', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyTextPresent('Curricula: All', false)

WebUI.verifyTextPresent('MRCP Part 1', false)

WebUI.verifyTextPresent('3205', false)

WebUI.verifyElementText(findTestObject('MVC_Choose Questions/Total Count of questions'), '3205')

WebUI.click(findTestObject('MVC_Choose Questions/Select Curriculum'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Basic Sciences'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['2 questions'])

WebUI.verifyTextPresent('Curricula: Basic Sciences', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.click(findTestObject('MVC_Choose Questions/Core Questions checkbox'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.verifyTextPresent('Curricula: Basic Sciences', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyElementPresent(findTestObject('MVC_Choose Questions/Core Questions Image'), 0)

not_run: WebUI.verifyElementAttributeValue(findTestObject('MVC_Choose Questions/Total Count of questions'), 'text', '2', 
    0)

not_run: WebUI.scrollToPosition(99999, 99999)

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.uncheck(findTestObject('MVC_Choose Questions/Basic Sciences'))

WebUI.delay(1)

WebUI.check(findTestObject('MVC_Choose Questions/Lung Function'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['1 questions'])

WebUI.verifyTextPresent('Curricula: Lung Function', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyElementPresent(findTestObject('MVC_Choose Questions/Core Questions Image'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.delay(5)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 1 of 1', false)

WebUI.verifyElementPresent(findTestObject('MVC_Choose Questions/Core Questions Tag'), 0)

WebUI.verifyTextPresent('A 48-year-old male presents feeling progressively short of breath and \'wheezy\' for the last couple of months. He smokes 30 a day for the last 20 years. He had lung function tests which showed the following.', 
    false)

WebUI.navigateToUrl('https://testmy.onexamination.com/GenericAssessment/GenericAssessmentLearningJournal.aspx')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'))

WebUI.delay(1)

WebUI.getUrl()

WebUI.delay(2)

WebUI.verifyTextPresent('A 48-year-old male presents feeling progressively short of breath and \'wheezy\' for the last couple of months. He smokes 30 a day for the last 20 years. He had lung function tests which showed the following.', 
    false)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Skip question'))

WebUI.delay(2)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 1 of 1', false)

WebUI.verifyElementPresent(findTestObject('MVC_Choose Questions/Core Questions Tag'), 0)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Core Question Answer'))

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/SubmitAnswer'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/GoToSummary'))

WebUI.delay(2)

WebUI.verifyTextPresent('Test summary', false)

WebUI.verifyTextPresent('Question Session', false)


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

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'testautomation@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC_Choose Questions/With Questions - All'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC_Choose Questions/Button_Apply_Keyword Filter'))

WebUI.delay(2)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 11)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '20 questions', '30 questions'
        , '40 questions', '50 questions', '60 questions', '70 questions', '80 questions', '90 questions', '100 questions'
        , 'All questions (185)'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MVC_Choose Questions/Keyword Filter Field'), 'thyroid')

WebUI.click(findTestObject('MVC_Choose Questions/Button_Apply_Keyword Filter'))

WebUI.delay(1)

WebUI.verifyTextPresent('Keywords: thyroid', false)

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.verifyElementNotVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/Remove Keyword'))

WebUI.delay(3)

WebUI.setText(findTestObject('MVC_Choose Questions/Keyword Filter Field'), 'diabetes')

WebUI.click(findTestObject('MVC_Choose Questions/Button_Apply_Keyword Filter'))

WebUI.delay(1)

WebUI.verifyTextPresent('Keywords: diabetes', false)

WebUI.delay(1)

WebUI.setText(findTestObject('MVC_Choose Questions/Keyword Filter Field'), 'Quantitative Reasoning 4')

WebUI.click(findTestObject('MVC_Choose Questions/Button_Apply_Keyword Filter'))

WebUI.delay(1)

WebUI.verifyTextPresent('Keywords: diabetes, Quantitative Reasoning 4', false)

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['1 questions'])

WebUI.verifyElementVisible(findTestObject('MVC_Choose Questions/Button Start Questions'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.delay(5)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Question 1 of 1', false)

WebUI.verifyTextPresent('Quantitative Reasoning 4', false)

WebUI.verifyTextPresent('This chart shows the percentage of general practices in a given area that run regular clinics for people with diabetes, obesity and asthma.', 
    false)

WebUI.navigateToUrl('https://testmy.onexamination.com/GenericAssessment/GenericAssessmentLearningJournal.aspx')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'))

WebUI.delay(1)

WebUI.getUrl()

WebUI.verifyTextPresent('This chart shows the percentage of general practices in a given area that run regular clinics for people with diabetes, obesity and asthma.', 
    false)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Section'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Section Field'), 'AutomationScriptTag')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Button Tag'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/a_Tags'))

WebUI.delay(2)

WebUI.verifyTextPresent('AutomationScriptTag', false)

WebUI.verifyTextPresent('This chart shows the percentage of general practices in a given area that run regular clinics for people with diabetes, obesity and asthma.', 
    false)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Choose Questions'))

WebUI.delay(5)

WebUI.verifyTextPresent('AutomationScriptTag', false)

WebUI.verifyTextNotPresent('Editor\'s Choice', false)

WebUI.delay(1)

WebUI.navigateToUrl('https://testmy.onexamination.com/GenericAssessment/GenericAssessmentLearningJournal.aspx')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'))

WebUI.delay(1)

WebUI.getUrl()

WebUI.verifyTextPresent('This chart shows the percentage of general practices in a given area that run regular clinics for people with diabetes, obesity and asthma.', 
    false)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Section'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Delete Icon'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/a_Tags'))

WebUI.delay(2)

WebUI.verifyTextNotPresent('AutomationScriptTag', false)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Choose Questions'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('AutomationScriptTag', false)

WebUI.delay(1)

WebUI.navigateToUrl('https://testmy.onexamination.com/GenericAssessment/GenericAssessmentLearningJournal.aspx')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'))

WebUI.delay(1)

WebUI.getUrl()

WebUI.verifyTextPresent('This chart shows the percentage of general practices in a given area that run regular clinics for people with diabetes, obesity and asthma.', 
    false)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Section'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_BMJ OnExamination Assessment Session/Tags Section Field'), 'AutomationScriptTag')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Button Tag'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/a_Tags'))

WebUI.delay(2)

WebUI.verifyTextPresent('AutomationScriptTag', false)

WebUI.verifyTextPresent('This chart shows the percentage of general practices in a given area that run regular clinics for people with diabetes, obesity and asthma.', 
    false)

WebUI.scrollToPosition(99999, 99999)

WebUI.verifyElementNotVisible(findTestObject('Page_BMJ OnExamination Assessment Session/Tags_RemoveSelectedTags'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('E:\\Katalon Studio\\Screenshots\\Tags_UKCAT.png')

not_run: selenium.click('id=MainContent_rptTags_rptQuestions_11_RemoveTagCheckBox_0')

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags - Remove this Tag'))

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Label - Remove this Tag'))

WebUI.waitForPageLoad(5)

WebUI.scrollToPosition(99999, 99999)

WebUI.verifyElementVisible(findTestObject('Page_BMJ OnExamination Assessment Session/Tags_RemoveSelectedTags'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Assessment Session/Tags_RemoveSelectedTags'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextNotPresent('AutomationScriptTag', false)

WebUI.verifyTextPresent('This chart shows the percentage of general practices in a given area that run regular clinics for people with diabetes, obesity and asthma.', 
    false)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Choose Questions'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('AutomationScriptTag', false)

WebUI.takeScreenshot('E:\\Katalon Studio\\Screenshots\\Tags_UKCAT.png')

WebUI.delay(1)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'viveknoexam@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC Exam Revision/Tags Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Choose Questions'))

WebUI.delay(5)

WebUI.verifyTextPresent('MRCGP', false)

WebUI.verifyTextPresent('Editor\'s Choice', false)

WebUI.click(findTestObject('MVC_Choose Questions/Sign Out'))


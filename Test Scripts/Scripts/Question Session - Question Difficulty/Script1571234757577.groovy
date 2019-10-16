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

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/With Questions - All'))

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/Question Difficulty - Select Difficulty - Child - All'))

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/Question Difficulty - Select Difficulty - Child - Easy'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 9)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '20 questions', '30 questions'
        , '40 questions', '50 questions', '60 questions', '70 questions', '80 questions', '81 questions'])

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/QR2 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/QR2 Tag'))

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/QR1 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['1 questions'])

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Theme:Quantitative Reasoning 10', false)

WebUI.verifyTextPresent('women and children that were reported to the police in 2005.', false)

WebUI.verifyTextPresent('The total number of reported assaults was', false)

WebUI.delay(5)

WebUI.navigateToUrl('https://testmy.onexamination.com/GenericAssessment/GenericAssessmentLearningJournal.aspx')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'))

WebUI.delay(1)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Theme:Quantitative Reasoning 10', false)

WebUI.verifyTextPresent('women and children that were reported to the police in 2005.', false)

WebUI.verifyTextPresent('The total number of reported assaults was', false)

WebUI.delay(5)

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab - Old'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC Exam Revision/Sign Out'))

WebUI.closeBrowser()

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'testautomation@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/With Questions - All'))

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/Question Difficulty - Select Difficulty - Child - All'))

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/Question Difficulty - Select Difficulty - Child - Average'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 10)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['10 questions', '20 questions', '30 questions'
        , '40 questions', '50 questions', '60 questions', '70 questions', '80 questions', '90 questions', '94 questions'])

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/QR1 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['0 questions'])

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/QR1 Tag'))

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/QR2 Tag'))

WebUI.delay(1)

Count = WebUI.getNumberOfTotalOption(findTestObject('MVC_Choose Questions/Questions Dropdown'))

WebUI.verifyEqual(Count, 1)

WebUI.verifyOptionsPresent(findTestObject('MVC_Choose Questions/Questions Dropdown'), ['1 questions'])

WebUI.delay(1)

WebUI.click(findTestObject('MVC_Choose Questions/Button Start Questions'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Theme:Quantitative Reasoning 9', false)

WebUI.verifyTextPresent('The occupation with the greatest percentage of people under the age of 30 years is', false)

WebUI.delay(5)

WebUI.navigateToUrl('https://testmy.onexamination.com/GenericAssessment/GenericAssessmentLearningJournal.aspx')

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Learning Jou/LJ_QS_Link'))

WebUI.delay(1)

WebUI.verifyTextPresent('Question Session', false)

WebUI.verifyTextPresent('Theme:Quantitative Reasoning 9', false)

WebUI.verifyTextPresent('The occupation with the greatest percentage of people under the age of 30 years is', false)

WebUI.delay(5)

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab - Old'))

WebUI.delay(5)

WebUI.click(findTestObject('MVC Exam Revision/Sign Out'))

WebUI.closeBrowser()


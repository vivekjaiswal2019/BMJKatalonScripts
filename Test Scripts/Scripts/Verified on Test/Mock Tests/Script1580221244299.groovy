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

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Button Mock Tests'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Green Tick'), 0)

WebUI.verifyTextPresent('completed exam', false)

WebUI.click(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam Dropdown'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam List'), 
    'Endocrinology and Diabetes SCE', false)

WebUI.delay(1)

WebUI.verifyTextPresent('Please select from one of these Mock Tests:', false)

WebUI.verifyTextPresent('There are currently none available.', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam Dropdown'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam List'), 
    'FRCA Final', false)

WebUI.delay(2)

WebUI.verifyTextPresent('Please select from one of these Mock Tests:', false)

WebUI.verifyTextNotPresent('There are currently none available.', false)

WebUI.verifyTextPresent('Final FRCA 2017', false)

WebUI.verifyTextPresent('Mock Test based on themes from the 2017 Final FRCA examination.', false)

WebUI.verifyTextPresent('2% from 79 questions', false)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Summary button'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Resit button'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Grey Tick'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam Dropdown'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam List'), 
    'Medical Student Finals', false)

WebUI.delay(2)

WebUI.verifyTextPresent('Please select from one of these Mock Tests:', false)

WebUI.verifyTextNotPresent('There are currently none available.', false)

WebUI.verifyTextPresent('Medical Student Finals Practice Paper 2016', false)

WebUI.verifyTextPresent('A practice mock test based on representative EMQ and SBA questions.', false)

WebUI.verifyTextPresent('1/96 complete', false)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Continue test button'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Grey Tick'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam Dropdown'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam List'), 
    'Medical Student Year 1', false)

WebUI.delay(2)

WebUI.verifyTextPresent('Please select from one of these Mock Tests:', false)

WebUI.verifyTextNotPresent('There are currently none available.', false)

WebUI.verifyTextPresent('Medical Student Year 1 practice paper - 2016', false)

WebUI.verifyTextPresent('100 question practice paper for medical student year 1', false)

WebUI.verifyTextPresent('0/100 complete', false)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Start test button'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Grey Tick'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam Dropdown'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Page_BMJ OnExamination Mock tests/Page_BMJ OnExamination Mock tests/Mock Test Exam List'), 
    'MRCS Part A papers 1 and 2', false)

WebUI.delay(1)

WebUI.verifyTextPresent('Please select from one of these Mock Tests:', false)

WebUI.verifyTextNotPresent('There are currently none available.', false)

WebUI.verifyTextPresent('MRCS Part A 2016 - Paper 2', false)

WebUI.verifyTextPresent('Paper 2 - Principles of Surgery-in-General - 135 EMQ question Items', false)

WebUI.verifyTextPresent('98% from 39 questions', false)

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Page_BMJ OnExamination Mock tests/Read More Link'))

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Mock tests/Read More window'), 0)

WebUI.verifyTextPresent('Aims & Objectives', false)

WebUI.verifyTextPresent('Mock Test based on themes from Paper 1 (Applied Basic Sciences) of the January 2014 MRSC Part A examination. This test consists of 135 single best answer questions.', 
    false)

WebUI.verifyTextPresent('The pass mark for this module is: 70%', false)

WebUI.refresh()

WebUI.delay(5)

WebUI.click(findTestObject('MVC Exam Revision/Sign Out - Old'))

WebUI.delay(5)

WebUI.closeBrowser()


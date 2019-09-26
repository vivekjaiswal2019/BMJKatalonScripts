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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(2)

WebUI.verifyTextPresent('My Activity Feed', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Resource dropdown'))

WebUI.verifyOptionSelectedByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'UKCAT', false, 0)

WebUI.verifyOptionsPresent(findTestObject('MVC Exam Revision/Exam Resource dropdown'), ['Endocrinology and Diabetes SCE'
        , 'FRCS - General Surgery', 'GP ST', 'Medical Student Finals', 'MRCGP', 'MRCP Part 1', 'MRCP Part 2 Written', 'MRCPCH Foundation/Theory and Science (with T/F)'
        , 'MRCPCH Part 2', 'MRCPsych Paper 1 and 2', 'Situational Judgement Test', 'Tropical Health Education Trust module'
        , 'UKCAT'])

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Select Curriculum'))

WebUI.verifyTextPresent('Abstract Reasoning', false)

WebUI.verifyTextPresent('Decision Analysis', false)

WebUI.verifyTextPresent('Quantitative Reasoning', false)

WebUI.verifyTextPresent('Verbal Reasoning', false)

WebUI.click(findTestObject('MVC_Choose Questions/Exam Resource dropdown'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('MVC_Choose Questions/Exam Resource dropdown'), 'Tropical Health Education Trust module', 
    false)

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Select Curriculum'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyTextPresent('Medicine', false)

WebUI.verifyTextPresent('Obs and Gynae', false)

WebUI.verifyTextPresent('Paediatrics', false)

WebUI.verifyTextPresent('Surgery', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab'))

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.delay(2)

WebUI.verifyOptionSelectedByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'Tropical Health Education Trust module', 
    false, 0)

WebUI.selectOptionByLabel(findTestObject('MVC_Choose Questions/Exam Resource dropdown'), 'MRCP Part 1', false)

WebUI.click(findTestObject('MVC Exam Revision/Revision Advice Tab'))

WebUI.delay(1)

WebUI.verifyTextPresent('MRCP Part 1 Revision Advice', false)

WebUI.verifyTextPresent('The MRCP Part 1 exam aims to test your knowledge and understanding of basic medical science and common disorders, whilst also assessing your problem solving skills.', 
    false)

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Core Generate/Page_BMJ OnExamination Generate Wor/a_Scores'))

WebUI.delay(1)

WebUI.verifyTextPresent('Score Analysis - MRCP Part 1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/div_Exam resource'), 
    'MRCP Part 2 Written', false)

WebUI.delay(1)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(1)

WebUI.verifyOptionPresentByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'MRCP Part 2 Written', false, 
    0)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 'UKCAT', false)

WebUI.click(findTestObject('MVC Exam Revision/Sign Out'))

WebUI.closeBrowser()


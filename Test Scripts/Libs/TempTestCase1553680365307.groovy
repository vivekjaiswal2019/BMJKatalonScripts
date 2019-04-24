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


RunConfiguration.setExecutionSettingFile('C:\\Users\\VIVEKJ~1.GLO\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Dashboard\\20190327_152245\\execution.properties')

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

not_run: WebUI.openBrowser('https://my.onexamination.com/login.aspx')

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'vivek.jaiswal@northgateps.com')

not_run: WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword2')

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Help'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyTextPresent('Frequently Asked Questions', false)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/Page_My Dashboard - BMJ OnExaminati/span_Exam Revision'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('How would you like to study today?', false)

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_CPD'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Managed Accounts'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Video Tutorials'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/Page_My Dashboard - BMJ OnExaminati/a_Choose Questions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/Page_My Dashboard - BMJ OnExaminati/a_Core Questions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/Page_My Dashboard - BMJ OnExaminati/a_Group Learning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Admin'), 0)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Centre'), 0)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Exam Revision'))

WebUI.verifyTextPresent('How would you like to study today?', false)

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Home'), 0)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Scores'))

WebUI.verifyTextPresent('Score Analysis ', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_CPD'))

WebUI.verifyTextPresent('CPD Modules', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Centre'))

WebUI.verifyTextPresent('Partner Centre', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Partner Admin'))

WebUI.verifyTextPresent('Account Management', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Managed Accounts'))

WebUI.verifyTextPresent('You do not have any groups associated.', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Help'))

WebUI.verifyTextPresent('Frequently Asked Questions', false)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser()

''', 'Test Cases/Dashboard', new TestCaseBinding('Test Cases/Dashboard',[:]), FailureHandling.STOP_ON_FAILURE , false)
    

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


RunConfiguration.setExecutionSettingFile('C:\\Users\\VIVEKJ~1.GLO\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Choose Questions\\20190408_201315\\execution.properties')

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

not_run: WebUI.setViewPortSize(703, 703)

not_run: WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'testautomation@gmail.com')

not_run: WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword1')

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/Page_My Profile - BMJ OnExamination/a_Exam Revision'))

not_run: WebUI.click(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Choose Questions'))

not_run: WebUI.verifyTextPresent('Choose Questions', false)

not_run: WebUI.verifyTextPresent('Current Options Selected', false)

not_run: WebUI.verifyTextPresent('Keywords: None', false)

not_run: WebUI.verifyTextPresent('No of Questions', false)

not_run: WebUI.verifyTextPresent('Curricula: All', false)

not_run: WebUI.verifyTextPresent('Choose Questions', false)

not_run: WebUI.verifyTextPresent('Choose Questions', false)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Core Questions'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Group Learning'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Learning Journal'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Mock Tests'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Revision Advice'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Tags'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Work Hard'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test'), 0)

not_run: WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test'), 
    'id', 'btnGenerateRight', 0)

not_run: WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/i_Exam Options_fa fa-cogs'), 
    0)

not_run: WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test (1)'), 
    'id', 'btnGenerateLeft', 0)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/a_My Profile'))

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

not_run: WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_With Questions..._Questi'), 
    0)

not_run: WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_Filter by Curriculum_qCa'), 
    0)

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All_coreAdvanceOption'))

not_run: WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_Revision Type_RevisionTy'), 
    0)

not_run: WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_Question Difficulty_qDif'), 
    0)

not_run: WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_Filter by Tags_qTag'), 
    0)

not_run: String ExpectedPlaceholder = 'eg, deep vein thrombosis, diabetes, thyroid'

not_run: String placeholder = WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Choose Generate/input_Keyword Filter_QuestionK'), 
    'ActualPlaceholder')

not_run: if (ExpectedPlaceholder == placeholder) {
    KeywordUtil.markPassed('Placeholder is  as expected.')
}

not_run: WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All curricula_qCat'))

not_run: WebUI.verifyTextPresent('Abstract Reasoning', false)

not_run: WebUI.verifyTextPresent('Decision Analysis', false)

not_run: WebUI.verifyTextPresent('Quantitative Reasoning', false)

WebUI.verifyTextPresent('Verbal Reasoning', false)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

WebUI.check(findTestObject('Page_BMJ OnExamination Choose Generate/input_Select curriculum_Catego_UKCAT'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

WebUI.delay(5)

Count = WebUI.getNumberOfTotalOption(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'))

WebUI.verifyEqual(Count, 6)

WebUI.verifyOptionsPresent(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'), ['10 questions'
        , '20 questions', '30 questions', '40 questions', '50 questions', '56 questions'])

WebUI.verifyTextPresent('Best Answer Question', false)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_Best Answer Question_que_UKCAT_Best Answer Question'), 
    0)

WebUI.verifyTextPresent('Problem Solving Question', false)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_Best Answer Question_que_UKCAT_Problem Solving Question'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

WebUI.selectOptionByValue(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/select_DRCOGEndocrinology and'), 
    '97', false)

WebUI.delay(5)

WebUI.verifyTextPresent('Medicine', false)

WebUI.verifyTextPresent('Obs and Gynae', false)

WebUI.verifyTextPresent('Paediatrics', false)

WebUI.verifyTextPresent('Surgery', false)

WebUI.check(findTestObject('Page_BMJ OnExamination Choose Generate/input_Select curriculum_Catego - Tropical'))

WebUI.delay(5)

Count = WebUI.getNumberOfTotalOption(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'))

WebUI.verifyEqual(Count, 4)

WebUI.verifyOptionsPresent(findTestObject('Page_BMJ OnExamination Choose Generate/select_10 questions20 question'), ['10 questions'
        , '20 questions', '30 questions', '33 questions'])

WebUI.delay(2)

WebUI.verifyTextPresent('MCQ', false)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_Question Type_questionTy_Tropical_MCQ'), 
    0)

WebUI.verifyTextPresent('EMQ', false)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_Question Type_questionTy_Tropical_EMQ'), 
    0)

WebUI.verifyTextPresent('n of Many', false)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_Question Type_questionTy_Tropical_n of Many'), 
    0)

not_run: WebUI.selectOptionByValue(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/select_DRCOGEndocrinology and'), 
    '28', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_No tags_qTag'))

WebUI.verifyTextNotPresent('Core Questions', false)

WebUI.verifyTextNotPresent('Editor\\'s Choice', false)

WebUI.selectOptionByValue(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/select_DRCOGEndocrinology and'), 
    '35', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_No tags_qTag'))

WebUI.verifyTextNotPresent('My Tags', false)

WebUI.verifyTextPresent('Core Questions', false)

WebUI.verifyTextNotPresent('Editor\\'s Choice', false)

WebUI.selectOptionByValue(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/select_DRCOGEndocrinology and'), 
    '92', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_No tags_qTag'))

WebUI.verifyTextNotPresent('Core Questions', false)

WebUI.verifyTextPresent('Editor\\'s Choice', false)

''', 'Test Cases/Choose Questions', new TestCaseBinding('Test Cases/Choose Questions',[:]), FailureHandling.STOP_ON_FAILURE , false)
    

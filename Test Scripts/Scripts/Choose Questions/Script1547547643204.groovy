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

Height = WebUI.getPageHeight()

Width = WebUI.getPageWidth()

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Email address_ctl00MainC'), 'testautomation@gmail.com')

WebUI.setText(findTestObject('Page_BMJ OnExamination Sign In/input_Password_ctl00MainConten'), 'P@ssword1')

WebUI.click(findTestObject('Page_BMJ OnExamination Sign In/input_Please enter your passwo'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/Page_My Profile - BMJ OnExamination/a_Exam Revision'))

WebUI.click(findTestObject('Page_Exam Revision - BMJ OnExaminat/a_Choose Questions'))

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.verifyTextPresent('Current Options Selected', false)

WebUI.verifyTextPresent('Keywords: None', false)

WebUI.verifyTextPresent('No of Questions', false)

WebUI.verifyTextPresent('Curricula: All', false)

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Core Questions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Group Learning'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Learning Journal'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Mock Tests'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Revision Advice'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Tags'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/a_Work Hard'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test'), 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test'), 'id', 'btnGenerateRight', 
    0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/i_Exam Options_fa fa-cogs'), 0)

WebUI.verifyElementAttributeValue(findTestObject('Page_BMJ OnExamination Choose Generate/button_Generate test (1)'), 'id', 
    'btnGenerateLeft', 0)

WebUI.navigateToUrl('https://testmy.onexamination.com/Account/Default.aspx')

WebUI.verifyElementPresent(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 0)

WebUI.selectOptionByLabel(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 'UKCAT', 
    false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Page_My Dashboard - BMJ OnExaminati/select_Active revision course_'), 
    'UKCAT', false, 20)

WebUI.delay(5)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Home'))

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Choose Questions'))

WebUI.delay(5)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_With Questions..._Questi'), 0)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_Filter by Curriculum_qCa'), 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All_coreAdvanceOption'))

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_Revision Type_RevisionTy'), 0)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_Question Difficulty_qDif'), 0)

WebUI.verifyElementChecked(findTestObject('Page_BMJ OnExamination Choose Generate/input_Filter by Tags_qTag'), 0)

String ExpectedPlaceholder = 'eg, deep vein thrombosis, diabetes, thyroid'

String placeholder = WebUI.getAttribute(findTestObject('Page_BMJ OnExamination Choose Generate/input_Keyword Filter_QuestionK'), 
    'ActualPlaceholder')

if (ExpectedPlaceholder == placeholder) {
    KeywordUtil.markPassed('Placeholder is  as expected.')
}

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_All curricula_qCat'))

WebUI.verifyTextPresent('Abstract Reasoning', false)

WebUI.verifyTextPresent('Decision Analysis', false)

WebUI.verifyTextPresent('Quantitative Reasoning', false)

WebUI.verifyTextPresent('Verbal Reasoning', false)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

WebUI.check(findTestObject('Page_BMJ OnExamination Choose Generate/input_Select curriculum_Catego_UKCAT'))

WebUI.delay(5)

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

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_No tags_qTag'))

WebUI.verifyElementVisible(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/input_My Tags_qTag0'))

WebUI.verifyElementVisible(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/Core Questions_UKCAT'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/Editors Choice_UKCAT'), 
    0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/div_Filter by Tags'))

WebUI.delay(5)

WebUI.takeScreenshot('E:\\Katalon Studio\\Screenshots\\Tags_UKCAT.png')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/select_DRCOGEndocrinology and'), 
    'Tropical Health Education Trust module', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

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

WebUI.focus(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/div_Filter by Tags'))

WebUI.delay(5)

WebUI.takeScreenshot('E:\\Katalon Studio\\Screenshots\\Tags_TropicalHealth.png')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/select_DRCOGEndocrinology and'), 
    'MRCGP', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/div_Exam Options'))

WebUI.click(findTestObject('Page_BMJ OnExamination Choose Generate/input_No tags_qTag'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/Core Questions_MRCGP'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/Editors Choice_MRCGP'), 
    0)

WebUI.focus(findTestObject('Page_BMJ OnExamination Choose Generate/Page_BMJ OnExamination Generate Wor/div_Filter by Tags'))

WebUI.delay(5)

WebUI.takeScreenshot('E:\\Katalon Studio\\Screenshots\\Tags_MRCGP.png')

WebUI.scrollToPosition(0, 0)

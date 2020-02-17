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

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Exam Resource dropdown'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('MVC_Choose Questions/Exam Resource dropdown'), 'UKCAT', false)

WebUI.delay(1)

WebUI.navigateToUrl('https://testmy.onexamination.com/Assessment/RevisionAdvice.aspx')

WebUI.delay(2)

WebUI.verifyTextPresent('UKCAT Revision Advice', false)

WebUI.verifyTextPresent('Although UKCAT is designed to test a variety of cognitive and non-cognitive attributes and does not have a specific syllabus or curriculum, it is important to give some thought to the best way of tackling the various questions that are set. It is said that revision is neither necessary nor advantageous but this is only partly true and depends on how "revision" is defined. Unlike a science or history exam, there are no long lists of theories, facts or figures to memorise or learn. However, it is important to have a clear understanding of how to approach the various sorts of questions that appear on the paper. Outlined below are some general tips to keep in mind but it is also valuable to try the sample questions that appear on the OnExamination site.', 
    false)

WebUI.verifyTextPresent('Decision Analysis', false)

WebUI.verifyTextPresent('Abstract Reasoning', false)

WebUI.verifyTextPresent('Verbal Reasoning', false)

WebUI.verifyTextPresent('Quantitative Reasoning', false)

WebUI.verifyElementPresent(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Exam Options Dropdown'), 0)

WebUI.click(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Exam Options Dropdown'))

WebUI.selectOptionByLabel(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Exam Options List'), 'MRCP Part 1', 
    false)

WebUI.delay(2)

WebUI.verifyTextPresent('MRCP Part 1 Revision Advice', false)

WebUI.verifyTextPresent('The MRCP Part 1 exam aims to test your knowledge and understanding of basic medical science and common disorders, whilst also assessing your problem solving skills.', 
    false)

WebUI.doubleClick(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Header Exam Name'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_My Revision Advice - BMJ OnExamination/iframe'), 0)

WebUI.verifyElementVisible(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Button Save Changes'))

WebUI.verifyElementVisible(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Button Exit'))

WebUI.verifyElementVisible(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Button Edit History'))

WebUI.click(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Button Exit'))

WebUI.delay(2)

WebUI.verifyTextPresent('MRCP Part 1 Revision Advice', false)

WebUI.verifyTextPresent('The MRCP Part 1 exam aims to test your knowledge and understanding of basic medical science and common disorders, whilst also assessing your problem solving skills.', 
    false)

WebUI.click(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Exam Options Dropdown'))

WebUI.selectOptionByLabel(findTestObject('MVC_My Revision Advice - BMJ OnExamination/Exam Options List'), 'UKCAT', false)

WebUI.delay(2)

WebUI.click(findTestObject('MVC Exam Revision/Sign Out - Old'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.openBrowser('https://testmy.onexamination.com/login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'testautomationoneexam@gmail.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.navigateToUrl('https://testmy.onexamination.com/Assessment/RevisionAdvice.aspx')

WebUI.delay(2)

WebUI.verifyTextPresent('MRCP Part 1 Revision Advice', false)

WebUI.verifyTextPresent('The MRCP Part 1 exam aims to test your knowledge and understanding of basic medical science and common disorders, whilst also assessing your problem solving skills.', 
    false)

not_run: WebUI.verifyTextNotPresent('function frameMecontentArea1', false)

WebUI.verifyElementNotPresent(findTestObject('Page_My Revision Advice - BMJ OnExamination/iframe'), 0)

not_run: WebUI.waitForElementNotClickable(findTestObject('Page_My Revision Advice - BMJ OnExamination/Header Exam Name'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('MVC Exam Revision/Sign Out - Old'))

WebUI.delay(5)

WebUI.closeBrowser()


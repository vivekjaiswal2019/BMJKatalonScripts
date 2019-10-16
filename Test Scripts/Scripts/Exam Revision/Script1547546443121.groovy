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

WebUI.delay(2)

not_run: WebUI.verifyTextPresent('My Activity Feed', false)

not_run: WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

not_run: WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

not_run: selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UKCAT\'])[2]/following::li[1]')

not_run: selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UKCAT\'])[2]/following::li[2]')

not_run: selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UKCAT\'])[2]/following::li[3]')

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Home Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/CPD Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Managed Accounts Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Partner Centre Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Partner Admin Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Help Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/My Profile Link'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Sign Out'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Mock Tests Sub Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Group Learning Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Revision Advice Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Tags Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Learning Journal Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Performance Tab'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Button Start your revision session'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Button Group Learning'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Button Mock Tests'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Button My Performance'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Forward Arrow'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Back arrow'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Exam Details text'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Questions Answered details'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Count of Questions Details'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Exam Resource dropdown'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Count of Questions Details'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Count of Questions Details'), 0)

WebUI.verifyElementPresent(findTestObject('MVC Exam Revision/Count of Questions Details'), 0)

WebUI.click(findTestObject('MVC Exam Revision/Home Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('My Activity Feed', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/CPD Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Our Self Assessment modules will help to keep your knowledge up-to-date and support your continuous professional development.', 
    false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Managed Accounts Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('You do not have any groups associated.', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Partner Centre Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('PACES build', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Partner Admin Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Account Management', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

not_run: WebUI.click(findTestObject('MVC Exam Revision/Help Tab'))

not_run: WebUI.delay(2)

not_run: WebUI.verifyTextPresent('Frequently Asked Questions', false)

not_run: WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

not_run: WebUI.delay(2)

not_run: WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Choose Questions Sub Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Mock Tests Sub Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Please select from one of these Mock Tests:', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Group Learning Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Join your peers in this quiz format revision tool and compete against them whilst you test your knowledge.', 
    false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Revision Advice Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Revision Advice', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Tags Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Tagged Questions', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.verifyTextPresent('Exam Revision', false)

WebUI.click(findTestObject('MVC Exam Revision/Learning Journal Tab'))

WebUI.delay(2)

WebUI.verifyTextPresent('Learning Journal', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC Exam Revision/Button Start your revision session'))

WebUI.delay(2)

WebUI.verifyTextPresent('Choose Questions', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC Exam Revision/Button Group Learning'))

WebUI.delay(2)

WebUI.verifyTextPresent('Join your peers in this quiz format revision tool and compete against them whilst you test your knowledge.', 
    false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC Exam Revision/Button Mock Tests'))

WebUI.delay(2)

WebUI.verifyTextPresent('Please select from one of these Mock Tests:', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC Exam Revision/Button My Performance'))

WebUI.delay(2)

WebUI.verifyTextPresent('Score Analysis', false)

WebUI.click(findTestObject('MVC Exam Revision/Exam Revision Tab - Old'))

WebUI.delay(2)

WebUI.closeBrowser()


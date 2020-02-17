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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('https://testmy.onexamination.com/Login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_My Profile'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Change Password'))

WebUI.delay(1)

WebUI.verifyTextPresent('Change Password', false)

WebUI.takeScreenshot()

WebUI.comment('Blank data')

WebUI.click(findTestObject('Page_Change Your Password - BMJ OnE/Change Password button'))

WebUI.verifyTextPresent('Please enter your current password', false)

WebUI.verifyTextPresent('Please enter your new password', false)

WebUI.verifyTextPresent('Please confirm your new password', false)

WebUI.comment('Invalid new and confirm password')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Current Password field'), 'P@ssword1')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/New password field'), 'P@ssword')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), 'Password')

WebUI.sendKeys(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), Keys.chord(Keys.TAB))

WebUI.verifyTextPresent('Password must contain at least one number and one uppercase and lowercase letters and one special character (!@#$%^&*-_), and should be of 8-20 characters', 
    false)

WebUI.verifyTextPresent('Error: Your new password and confirmed password must match', false)

WebUI.clearText(findTestObject('Page_Change Your Password - BMJ OnE/Current Password field'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Change Your Password - BMJ OnE/New password field'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Invalid new and confirm password')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Current Password field'), 'P@ssword2')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/New password field'), 'Password')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), 'P@ssword')

WebUI.sendKeys(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), Keys.chord(Keys.TAB))

WebUI.verifyTextPresent('Password must contain at least one number and one uppercase and lowercase letters and one special character (!@#$%^&*-_), and should be of 8-20 characters', 
    false)

WebUI.verifyTextPresent('Error: Your new password and confirmed password must match', false)

WebUI.clearText(findTestObject('Page_Change Your Password - BMJ OnE/Current Password field'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Change Your Password - BMJ OnE/New password field'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Invalid current password')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Current Password field'), 'P@ssword2')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/New password field'), 'P@ssword3')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), 'P@ssword3')

WebUI.click(findTestObject('Page_Change Your Password - BMJ OnE/Change password button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://testmy.onexamination.com/Login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword2')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('Invalid login details entered', false)

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword3')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('Invalid login details entered', false)

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_My Profile'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Change Password'))

WebUI.delay(1)

WebUI.verifyTextPresent('Change Password', false)

WebUI.comment('Cancel button')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Current Password field'), 'P@ssword1')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/New password field'), 'P@ssword2')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), 'P@ssword2')

WebUI.click(findTestObject('Page_Change Your Password - BMJ OnE/Cancel button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://testmy.onexamination.com/Login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword2')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('Invalid login details entered', false)

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_My Profile'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Change Password'))

WebUI.delay(1)

WebUI.verifyTextPresent('Change Password', false)

WebUI.comment('Valid Change Password')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Current Password field'), 'P@ssword1')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/New password field'), 'P@ssword2')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), 'P@ssword2')

WebUI.click(findTestObject('Page_Change Your Password - BMJ OnE/Change password button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Message: Your password has been successfully changed', false)

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://testmy.onexamination.com/Login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword2')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('My Profile', false)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_My Profile'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Profile - BMJ OnExamination/a_Change Password'))

WebUI.delay(1)

WebUI.verifyTextPresent('Change Password', false)

WebUI.comment('Resetting default values')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Current Password field'), 'P@ssword2')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/New password field'), 'P@ssword1')

WebUI.setText(findTestObject('Page_Change Your Password - BMJ OnE/Confirm new password field'), 'P@ssword1')

WebUI.click(findTestObject('Page_Change Your Password - BMJ OnE/Change password button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Message: Your password has been successfully changed', false)

WebUI.delay(1)

WebUI.click(findTestObject('Page_My Dashboard - BMJ OnExaminati/a_Sign Out'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://testmy.onexamination.com/Login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('My Profile', false)


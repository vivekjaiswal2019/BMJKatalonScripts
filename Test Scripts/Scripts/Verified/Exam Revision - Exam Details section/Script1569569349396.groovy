import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('https://www.katalon.com/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.katalon.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://testmy.onexamination.com/Exam/Dashboard')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MVC Login page/Email address field'), 'vivek.jaiswal@northgateps.com')

WebUI.setText(findTestObject('MVC Login page/Password field'), 'P@ssword1')

WebUI.click(findTestObject('MVC Login page/Login Button'))

WebUI.delay(2)

WebUI.click(findTestObject('MVC_Choose Questions/Exam Resource dropdown'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('MVC_Choose Questions/Exam Resource dropdown'), 'UKCAT', false)

WebUI.delay(1)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UKCAT\'])[2]/following::li[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UKCAT\'])[2]/following::div[14]')

WebUI.verifyTextPresent('Your exam was on 05 July 2019', false)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UKCAT\'])[2]/following::li[2]')

WebUI.delay(1)

not_run: selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Your exam was on 05 July 2019\'])[1]/following::div[4]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Your exam was on 05 July 2019\'])[1]/following::div[5]')

WebUI.verifyTextPresent('question(s) answered', false)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UKCAT\'])[2]/following::li[3]')

WebUI.delay(1)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'question(s) answered\'])[1]/following::div[10]')

WebUI.verifyTextPresent('Your Overall Progress:', false)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Your Overall Progress:\'])[1]/following::span[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Your Overall Progress:\'])[1]/following::span[2]')

WebUI.verifyTextPresent('questions', false)

WebUI.closeBrowser()


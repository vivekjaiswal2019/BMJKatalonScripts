import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Score Computing')

suiteProperties.put('name', 'Score Computing')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\GitHub\\BMJKatalonScripts\\BMJKatalonScripts\\Test Scripts\\Reports\\Score Computing\\20190523_174354\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Score Computing', suiteProperties, [new TestCaseBinding('Test Cases/Reset Scores', 'Test Cases/Reset Scores',  null), new TestCaseBinding('Test Cases/Question Session - Correctly Answered', 'Test Cases/Question Session - Correctly Answered',  null), new TestCaseBinding('Test Cases/Reset Scores', 'Test Cases/Reset Scores',  null), new TestCaseBinding('Test Cases/Question Session - Incorrectly Answered', 'Test Cases/Question Session - Incorrectly Answered',  null)])

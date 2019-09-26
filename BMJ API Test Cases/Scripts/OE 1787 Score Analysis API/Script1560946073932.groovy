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

RP1 = WS.sendRequest(findTestObject('OE 1787 Score Analysis API', [('Token') : findTestData('OE 1787 Score Analysis API').getValue(
                1, 1), ('ExamID') : findTestData('OE 1787 Score Analysis API').getValue(2, 1), ('Mobile') : findTestData(
                'OE 1787 Score Analysis API').getValue(3, 1)]))

WS.verifyElementPropertyValue(RP1, 'status', 200)
WS.verifyElementPropertyValue(RP1, 'response.totalQuestions', 3204)
WS.verifyElementPropertyValue(RP1, 'response.questionsAttempted', 149)
WS.verifyElementPropertyValue(RP1, 'response.currentMean', 24.8)
WS.verifyElementPropertyValue(RP1, 'response.naiveMean', 20.8)
WS.verifyElementPropertyValue(RP1, 'response.examMean', 53.8)
WS.verifyElementPropertyValue(RP1, 'response.examPerformanceInfo.examPerformance', 3)
WS.verifyElementPropertyValue(RP1, 'response.examPerformanceInfo.examPerformanceText', "Based on your recent performance the likelihood of you doing well in the exam is LOW.")
WS.verifyElementPropertyValue(RP1, 'response.examPerformanceInfo.examPerformanceMessage', "Do not panic there are plenty more questions to try.")

RP2 = WS.sendRequest(findTestObject('OE 1787 Score Analysis API', [('Token') : findTestData('OE 1787 Score Analysis API').getValue(
	1, 2), ('ExamID') : findTestData('OE 1787 Score Analysis API').getValue(2, 2), ('Mobile') : findTestData(
	'OE 1787 Score Analysis API').getValue(3, 2)]))

WS.verifyElementPropertyValue(RP2, 'status', 200)
WS.verifyElementPropertyValue(RP2, 'response.totalQuestions', 3205)
WS.verifyElementPropertyValue(RP2, 'response.questionsAttempted', 149)
WS.verifyElementPropertyValue(RP2, 'response.currentMean', 24.8)
WS.verifyElementPropertyValue(RP2, 'response.naiveMean', 20.8)
WS.verifyElementPropertyValue(RP2, 'response.examMean', 53.8)
WS.verifyElementPropertyValue(RP2, 'response.examPerformanceInfo.examPerformance', 3)
WS.verifyElementPropertyValue(RP2, 'response.examPerformanceInfo.examPerformanceText', "Based on your recent performance the likelihood of you doing well in the exam is LOW.")
WS.verifyElementPropertyValue(RP2, 'response.examPerformanceInfo.examPerformanceMessage', "Do not panic there are plenty more questions to try.")
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

for (def i = 1; i < 7; i = (i + 1)) {
    RP = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                    1, i)]))

    WS.verifyElementPropertyValue(RP, 'status', 200)
	
}

for (def j = 7; j < 11; j = (j + 1)) {
    RP = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                    1, j)]))

    WS.verifyElementPropertyValue(RP, 'status', 400)
	
}

RP1 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 1)]))

WS.verifyElementPropertyValue(RP1, 'status', 200)

RP2 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 2)]))

WS.verifyElementPropertyValue(RP2, 'status', 200)

RP3 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 3)]))

WS.verifyElementPropertyValue(RP3, 'status', 200)

RP4 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 4)]))

WS.verifyElementPropertyValue(RP4, 'status', 200)

RP5 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 5)]))

WS.verifyElementPropertyValue(RP5, 'status', 200)

RP6 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 6)]))

WS.verifyElementPropertyValue(RP6, 'status', 200)

RP7 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 7)]))

WS.verifyElementPropertyValue(RP7, 'status', 400)

RP8 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 8)]))

WS.verifyElementPropertyValue(RP8, 'status', 400)

RP9 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 9)]))

WS.verifyElementPropertyValue(RP9, 'status', 400)

RP10 = WS.sendRequest(findTestObject('OE 1786 Reset Password API', [('emailAddress') : findTestData('OE 1786 Reset Password API').getValue(
                1, 10)]))

WS.verifyElementPropertyValue(RP10, 'status', 400)


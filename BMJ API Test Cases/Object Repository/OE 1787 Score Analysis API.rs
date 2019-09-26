<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>OE 1787 Score Analysis API</name>
   <tag></tag>
   <elementGuidId>3a82a376-fea8-497f-ae1a-7c935c3aad19</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://testapi.onexamination.com/1.1.5/v2/userExam/scoreAnalysis?token=&amp;examId=&amp;mobileQuestionsOnly=</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementPropertyValue(response, 'response.examPerformanceInfo.examPerformanceMessage', &quot;Do not panic there are plenty more questions to try.&quot;)
WS.verifyElementPropertyValue(response, 'status', 200)

WS.verifyElementPropertyValue(response, 'response.totalQuestions', 3204)

WS.verifyElementPropertyValue(response, 'response.questionsAttempted', 149)
WS.verifyElementPropertyValue(response, 'response.currentMean', 24.8)
WS.verifyElementPropertyValue(response, 'response.naiveMean', 20.8)
WS.verifyElementPropertyValue(response, 'response.examMean', 53.8)
WS.verifyElementPropertyValue(response, 'response.examPerformanceInfo.examPerformance', 3)
WS.verifyElementPropertyValue(response, 'response.examPerformanceInfo.examPerformanceText', &quot;Based on your recent performance the likelihood of you doing well in the exam is LOW.&quot;)

WS.verifyElementPropertyValue(response, 'response.examPerformanceInfo.examPerformanceMessage', &quot;Do not panic there are plenty more questions to try.&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

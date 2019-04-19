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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.callTestCase(findTestCase('Sign in/Sign in_ valid email, pw'), [:], FailureHandling.STOP_ON_FAILURE)

'Maximize the window\r\n'
WebUI.maximizeWindow()

WebUI.click(findTestObject('OLT/Tab_Button/a_Client Management'))

WebUI.click(findTestObject('OLT/Tab_Button/a_OLT Management'))

WebUI.setText(findTestObject('Object Repository/OLT/Textbox/input_OLT Name_name'), 'Demo1')

WebUI.setText(findTestObject('Object Repository/OLT/Textbox/input_Username_user_name'), 'Hoai')

WebUI.setText(findTestObject('Object Repository/OLT/Textbox/input_Password_password'), '123456')

WebUI.click(findTestObject('OLT/Tab_Button/button_Create'))

WebUI.waitForPageLoad(3)

def erro = WebUI.getText(findTestObject('OLT/Error Mess/blank_IP address'))

WebUI.verifyMatch(erro, 'The ip address field is required.', false)

WebUI.closeBrowser()
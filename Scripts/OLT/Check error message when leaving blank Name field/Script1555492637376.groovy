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

WebUI.callTestCase(findTestCase('Sign in/Sign in_ valid email, pw'), [:], FailureHandling.STOP_ON_FAILURE)

'Maximize the window\r\n'
WebUI.maximizeWindow()

WebUI.click(findTestObject('OLT/Tab_Button/a_Client Management'))

WebUI.click(findTestObject('OLT/Tab_Button/a_OLT Management'))

WebUI.setText(findTestObject('OLT/Textbox/input_IP Address_ip_address'), '175.67.54.5')

WebUI.setText(findTestObject('Object Repository/OLT/Textbox/input_Username_user_name'), 'Hoai')

WebUI.setText(findTestObject('Object Repository/OLT/Textbox/input_Password_password'), '123456')

WebUI.click(findTestObject('OLT/Tab_Button/button_Create'))

def errormess1 = WebUI.getText(findTestObject('OLT/Error Mess/errormess_name'))

WebUI.verifyMatch(errormess1, 'The Name field is required.', false)

WebUI.closeBrowser()
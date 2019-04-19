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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automation.viralsoft.vn/admin/login')

WebUI.setText(findTestObject('null'), 'admin@automation.com')

WebUI.setEncryptedText(findTestObject('null'), 'CSt51UwWECc=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Backpack Admin/a_Client Management'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Backpack Admin/a_OLT Management'))

WebUI.setText(findTestObject('null'), 'demo1')

WebUI.setText(findTestObject('null'), 'hoai')

WebUI.setEncryptedText(findTestObject('null'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))


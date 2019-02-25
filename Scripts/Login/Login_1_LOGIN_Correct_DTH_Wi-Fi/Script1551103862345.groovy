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

Mobile.startApplication('C:\\Users\\MSA-testautomation', false)

Mobile.delay(2)

Mobile.tap(findTestObject('CTA/ACCEDI'), 0)

Mobile.tap(findTestObject('Text box/Username o indirizzo email'), 0)

Mobile.setText(findTestObject('Text box/Username o indirizzo email'), 'test_8313359@test.it', 2)

Mobile.tap(findTestObject('Text box/Password'), 0)

Mobile.setText(findTestObject('Text box/Password'), 'Qwerty123', 2)

Mobile.tap(findTestObject('CTA/ACCEDI'), 0)

Mobile.closeApplication()

Mobile.delay(0)


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

'Start app.\r\n'
Mobile.startApplication('C:\\Users\\MSA-testautomation\\59.apk', true)

'Delay 2'
Mobile.delay(2)

'Effettuo un check nella home page.'
Mobile.checkElement(findTestObject('Bottom Bar Elements/Home'), 0)

'Verifica della label homepage.'
Mobile.verifyElementExist(findTestObject('Bottom Bar Elements/Home'), 0)

'Effettuo un tap sulla bottom bar di Guida TV'
Mobile.tap(findTestObject('Bottom Bar Elements/Guida TV'), 0)

'Effettuo check sulla Home Page di Guida TV.'
Mobile.checkElement(findTestObject('Top Bar elements/GUIDA TV'), 0)

'Verifica della label Guida TV.'
Mobile.verifyElementExist(findTestObject('Top Bar elements/GUIDA TV'), 0)

'Delay 2'
Mobile.delay(2)

'Effettuo un tap nella sezione Sky On Demand.'
Mobile.tap(findTestObject('Navigation Bar Elements/Sky On Demand'), 0)

'Effettuo check sulla label Sky On Demand.'
Mobile.checkElement(findTestObject('Navigation Bar Elements/Sky On Demand'), 0)

'Verifica della label Sky On Demand.'
Mobile.verifyElementExist(findTestObject('Navigation Bar Elements/Sky On Demand'), 0)

'Delay 2'
Mobile.delay(2)

'Effettuo un tap nella sezione Programmazione.'
Mobile.tap(findTestObject('Navigation Bar Elements/Programmazione'), 0)

'Effettuo check sulla label Programmazione.'
Mobile.checkElement(findTestObject('Navigation Bar Elements/Programmazione'), 0)

'Verifica della label Programmazione.'
Mobile.verifyElementExist(findTestObject('Navigation Bar Elements/Programmazione'), 0)

'Deley 5'
Mobile.delay(5)

Mobile.closeApplication()


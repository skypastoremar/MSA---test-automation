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

'Load della sezione Scelti per te questa settimana.'
Mobile.waitForElementPresent(findTestObject('Guida Tv/Section Elements/Scelti per te questa settimana'), 30)

'Verifica della label Programmazione.'
Mobile.verifyElementExist(findTestObject('Navigation Bar Elements/Programmazione'), 30)

'Verifica della icona di Profile nella top bar.'
Mobile.verifyElementExist(findTestObject('Top Bar elements/Profile'), 30)

'Verifica della icona di Search nella top bar.'
Mobile.verifyElementExist(findTestObject('Top Bar elements/Search'), 30)

'Verifica della icona di Assistenza nella top bar.'
Mobile.verifyElementExist(findTestObject('Top Bar elements/Assistenza'), 30)

'Verifica del title (Guida Tv) della top bar.'
Mobile.verifyElementText(findTestObject('Top Bar elements/GUIDA TV'), 'GUIDA TV')

'Tap nella section di Sky On Demand.'
Mobile.tap(findTestObject('Navigation Bar Elements/Sky On Demand'), 60)

'Load della sezione SCELTI PER TE.'
Mobile.waitForElementPresent(findTestObject('Guida Tv/Section Elements/SCELTI PER TE'), 30)

'Verifica della label Sky On Demand.'
Mobile.verifyElementExist(findTestObject('Navigation Bar Elements/Sky On Demand'), 30)

'Effettuo un tap nella sezione Programmazione.\r\n'
Mobile.tap(findTestObject('Navigation Bar Elements/Programmazione'), 60)

'Load della sezione Scelti per te questa settimana.'
Mobile.waitForElementPresent(findTestObject('Guida Tv/Section Elements/Scelti per te questa settimana'), 30)


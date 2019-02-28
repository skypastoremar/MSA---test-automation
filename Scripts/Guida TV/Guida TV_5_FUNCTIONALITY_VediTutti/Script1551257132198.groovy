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

'Riceve la label della sezione dove tapperà "Vedi tutti".'
text = Mobile.getText(findTestObject('Guida Tv/Section Elements/Sezione programmazione'), 60)

'Tap sulla CTA "Vedi tutti".'
Mobile.tap(findTestObject('Guida Tv/Section Elements/Vedi tutti'), 60)

'Load del titolo del contenuto in evidenza.'
Mobile.waitForElementPresent(findTestObject('Guida Tv/Hero Elements/Titolo del contenuto'), 30)

'Check sulla label della sezione.'
Mobile.verifyElementText(findTestObject('Subsection Elements/Subsection title'), text)

'Tap sul button di back.'
Mobile.tap(findTestObject('Subsection Elements/Back button'), 60)

'Load immagine di hero.'
Mobile.waitForElementPresent(findTestObject('Guida Tv/Hero Elements/Immagine'), 30)

'Check sull\'immagine di Hero.\r\n'
Mobile.verifyElementAttributeValue(findTestObject('Guida Tv/Hero Elements/Immagine'), 'resource-id', 'it.sky.msa:id/heroImageImageView', 
    30)


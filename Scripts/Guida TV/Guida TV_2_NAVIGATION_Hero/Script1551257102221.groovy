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

'Verifica se esite l\'immagine del contenuto in evidenza.'
Mobile.verifyElementAttributeValue(findTestObject('Guida Tv/Hero Elements/Immagine'), 'resource-id', 'it.sky.msa:id/heroImageImageView', 
    60)

Mobile.delay(2)

'Verifica se esite la label "IN EVIDENZA"'
Mobile.verifyElementText(findTestObject('Guida Tv/Hero Elements/IN EVIDENZA'), 'IN EVIDENZA')

'Verifica che esiste il titolo del contenuto in evidenza.'
Mobile.verifyElementExist(findTestObject('Guida Tv/Hero Elements/Titolo del contenuto'), 30)

'Verifica che è presente la programmazione del contenuto.'
Mobile.verifyElementExist(findTestObject('Guida Tv/Hero Elements/Programmazione'), 30)

'Verifica se esiste l\'immagine del logo canale nel contenuto in evidenza.'
Mobile.verifyElementAttributeValue(findTestObject('Guida Tv/Hero Elements/Logo canale'), 'resource-id', 'it.sky.msa:id/heroChannelLogoImageView', 
    60)


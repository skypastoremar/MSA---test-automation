import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import sun.security.util.KeyUtil as KeyUtil

Mobile.tap(findTestObject('Text box/Username o indirizzo email'), 60)

Mobile.setText(findTestObject('Text box/Username o indirizzo email'), 'test_21855446@test.it', 30)

Mobile.tap(findTestObject('Text box/Password'), 60)

Mobile.setText(findTestObject('Text box/Password'), 'Qwerty123', 30)

Mobile.tap(findTestObject('CTA/ACCEDI'), 60)

Mobile.waitForElementPresent(findTestObject('Bottom Bar Elements/Home'), 30)


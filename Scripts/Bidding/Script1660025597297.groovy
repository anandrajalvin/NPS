import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('UI Check/Open Broswer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_NPS Auctions/Page_NPS Auctions/NPS Login/Page_NPS Auctions/button_Login'))

WebUI.sendKeys(findTestObject('Page_NPS Auctions/Page_NPS Auctions/NPS Login/Page_NPS Auctions/input_Email address_email'), 
    'abdul.auctionsoftware+nps01@gmail.com')

WebUI.sendKeys(findTestObject('Page_NPS Auctions/Page_NPS Auctions/NPS Login/Page_NPS Auctions/input_Password_password'), 
    'Test@12345')

WebUI.click(findTestObject('Page_NPS Auctions/Page_NPS Auctions/span_Login'))

WebUI.click(findTestObject('Page_NPS Auctions/Page_NPS Auctions/NPS Login/Page_NPS Auctions/Page_NPS Auctions/div_AUCTION'))

WebUI.click(findTestObject('Page_NPS Auctions/Page_NPS Auctions/NPS Login/Page_NPS Auctions/Page_NPS Auctions/span_cancelClear All'))

WebUI.click(findTestObject('Page_NPS Auctions/img'))

WebUI.sendKeys(findTestObject('Page_NPS Auctions/Page_NPS Auctions/NPS Login/Page_NPS Auctions/Page_NPS Auctions/input_Enter Bid Amt_wsprice'), 
    '50')

WebUI.click(findTestObject('Page_NPS Auctions/Page_NPS Auctions/NPS Login/Page_NPS Auctions/Page_NPS Auctions/button_Place Proxy Bid'))

WebUI.click(findTestObject('Page_NPS Auctions/Page_NPS Auctions/Page_NPS Auctions/button_Submit'))

WebUI.check(findTestObject('Toast Messgae/Toast_Message'))

WebUI.getText(findTestObject('Toast Messgae/Toast_Message'))


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

WebUI.click(findTestObject('Button/Page_AuctionSoftware- Large/Register_Btn'))

WebUI.sendKeys(findTestObject('Buyer register Inputs/Page_AuctionSoftware- Large/input_Enter your first name_first_name'), 
    'Riyaz')

WebUI.sendKeys(findTestObject('Buyer register Inputs/Page_AuctionSoftware- Large/input_Enter your last name_last_name'), 
    'Tester')

WebUI.sendKeys(findTestObject('Buyer register Inputs/Page_AuctionSoftware- Large/input_Enter your email address_email'), 
    'abdul.auctionsoftware@gmail.com')

WebUI.sendKeys(findTestObject('Buyer register Inputs/Page_AuctionSoftware- Large/input_Enter your mobile number_phone'), 
    '9898989898')

WebUI.sendKeys(findTestObject('Buyer register Inputs/Page_AuctionSoftware- Large/input_Enter your password_password'), '12345678')

WebUI.sendKeys(findTestObject('Buyer register Inputs/Page_AuctionSoftware- Large/input_Re enter your password_confirm_password'), 
    '12345678')

WebUI.sendKeys(findTestObject('Buyer register Inputs/Page_AuctionSoftware- Large/input_Enter your address line 1_address1'), 
    'TEST')

WebUI.sendKeys(findTestObject('Buyer register Inputs/Page_AuctionSoftware- Large/input_Enter your address line 2_address2'), 
    'TEST')

WebUI.selectOptionByIndex(findTestObject('Drop_Down/select_Enter your state'), '2')


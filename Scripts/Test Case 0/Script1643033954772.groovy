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

WebUI.openBrowser('')

WebUI.navigateToUrl(https://hocmai.vn/loginv2/signup.php?fbclid=IwAR1Cef95qQbmEoRZ5-iu3eejHKYl9ZFV0drus9KLmBQADH-mv_FTIgxQo-s)

WebUI.click(findTestObject('Page_ng k nhp hc - HOCMAI/form_tên'))

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/tên đăng ký'), 'Gia The Cong')

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/EMAIL'), 'emailcuacong@gmail.com')

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/SDT'), '0383116650')

WebUI.setEncryptedText(findTestObject('Page_ng k nhp hc - HOCMAI/password'), '9U2aCDWvphd7MK74UHsnGA==')

WebUI.setEncryptedText(findTestObject('Page_ng k nhp hc - HOCMAI/repasword'), '9U2aCDWvphd7MK74UHsnGA==')

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Chnh sch bo mt, iu khon dch v v chnh _799942'))

WebUI.click(findTestObject('Page_Thng tin ti khon - HOCMAI/KICH HOAT'))

WebUI.setText(findTestObject('Page_Thng tin ti khon - HOCMAI/CODE'), '8912')


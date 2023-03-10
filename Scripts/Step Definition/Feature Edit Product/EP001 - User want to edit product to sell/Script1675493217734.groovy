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

WebUI.navigateToUrl('secondhand-store.herokuapp.com/login')

WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), 'ndesyntha@gmail.com')

WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), 'Desyntha@123')

WebUI.click(findTestObject('Page_Login/login_btn'))

WebUI.callTestCase(findTestCase('Pages/User Add Product/Navigate to Sell List'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/User Edit Product/Navigate to Edit Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/User Edit Product/Click Button Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/User Add Product/Navigate to Sell List'), [:], FailureHandling.STOP_ON_FAILURE)

productPrice = WebUI.getText(findTestObject('Edit Product/product_price'))

WebUI.verifyMatch(productPrice, 'Rp 10.000,00', false)

WebUI.delay(6)

WebUI.closeBrowser()


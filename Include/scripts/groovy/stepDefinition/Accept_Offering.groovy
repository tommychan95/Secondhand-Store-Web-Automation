package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Accept_Offering {
	@Given("Sellers navigate to Login page")
	public void sellers_navigate_to_Login_page() {
		WebUI.callTestCase(findTestCase('Pages/User Login/Navigate to login page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers input username {string}")
	public void sellers_input_username(String Email) {
		WebUI.setText(findTestObject('Page_Login/login_input_email'), Email)
	}

	@When("Sellers input passwords {string}")
	public void sellers_input_passwords(String Password) {
		WebUI.setText(findTestObject('Page_Login/login_input_password'), Password)
	}

	@When("Sellers click button Login")
	public void sellers_click_button_Login() {
		WebUI.callTestCase(findTestCase('Pages/User Login/Click Button Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers click List Product")
	public void sellers_click_List_Product() {
		WebUI.click(findTestObject('Page_Pilih produk penawaran-Ika/List_Product'))
		
	}

	@When("Sellers click button Diminati")
	public void sellers_click_button_Diminati() {
		WebUI.callTestCase(findTestCase('Pages/Choose product - Ika/Click Button Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers click item product")
	public void sellers_click_item_product() {
		WebUI.click(findTestObject('Page_Accept Offering/card_product4'))
	}

	@When("Sellers click button Terima Penawaran")
	public void sellers_click_button_Terima_Penawaran() {
		WebUI.callTestCase(findTestCase('Pages/Accept offering - Ika/Click Button Terima Penawaran'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Page_Accept Offering/alert_accept_success'))
		WebUI.closeBrowser()
	}
}
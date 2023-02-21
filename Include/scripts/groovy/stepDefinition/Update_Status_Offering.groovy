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



class Update_Status_Offering {
	@Given("Selllers navigate to Login page")
	public void selllers_navigate_to_Login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('secondhand-store.herokuapp.com/login')
		WebUI.maximizeWindow()
	}

	@When("Selllers input username {string}")
	public void selllers_input_username(String email) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), email)
	}

	@When("Selllers input passwords {string}")
	public void selllers_input_passwords(String password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), password)
	}

	@When("Selllers click button Login")
	public void selllers_click_button_Login() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("Selllers click List Product")
	public void selllers_click_List_Product() {
		WebUI.click(findTestObject('Page_Pilih produk penawaran-Ika/List_Product'))
	}

	@When("Selllers click button Diminati")
	public void selllers_click_button_Diminati() {
		WebUI.callTestCase(findTestCase('Pages/Accept offering - Ika/Click Button Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllers click item product")
	public void selllers_click_item_product() {
		WebUI.click(findTestObject('Page_Status Penawaran/Page_Secondhand Store/card_product_offering'))
	}


	@When("Selllers click buttons Status")
	public void selllers_click_buttons_Status() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Click Button Status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllers click pilih statuss berhasil")
	public void selllers_click_pilih_statuss_berhasil() {
		WebUI.click(findTestObject('Page_Status Penawaran/radiobutton_berhasil_terjual'))
	}

	@When("Selllers click buttons kirim status")
	public void selllers_click_buttons_kirim_status() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Click Button Kirim Status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("alert success update showup")
	public void alert_success_update_showup() {
		WebUI.verifyElementPresent(findTestObject('Page_Accept Offering/alert_update_status_success'), 0)
		WebUI.getText(findTestObject('Page_Accept Offering/alert_accept_success'))
		WebUI.closeBrowser()
	}
	
	@When("Selllers click item product to be canceled")
	public void selllers_click_item_product_to_be_canceled() {
		WebUI.click(findTestObject('Page_Status Penawaran/Page_Secondhand Store/card_product_offering2'))
	}

	@When("Selllerrs click pilih status batalkan")
	public void selllerrs_click_pilih_status_batalkan() {
		WebUI.click(findTestObject('Page_Status Penawaran/radiobutton_batalkan_terjual'))
	}

	@When("Selllerrs click button kirim status")
	public void selllerrs_click_button_kirim_status() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Click Button Kirim Status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("product missing from diminati page")
	public void product_missing_from_diminati_page() {
		WebUI.verifyElementNotPresent(findTestObject('Page_Accept Offering/button_status'), 0)
		WebUI.closeBrowser()
	}
}
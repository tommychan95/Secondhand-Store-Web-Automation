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

	// product yang berhasil statusnya
	//positive case

	@Given("Selller navigate to Login page")
	public void selller_navigate_to_Login_page() {
		WebUI.callTestCase(findTestCase('Pages/User Login/Navigate to login page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selller input username {string}")
	public void selller_input_username(String string) {
		WebUI.setText(findTestObject('Page_Login/login_input_email'), Email)
	}

	@When("Selller input passwords {string}")
	public void selller_input_passwords(String string) {
		WebUI.setText(findTestObject('Page_Login/login_input_password'), Password)
	}

	@When("Selller click button Login")
	public void selller_click_button_Login() {
		WebUI.callTestCase(findTestCase('Pages/User Login/Click Button Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selller click List Product")
	public void selller_click_List_Product() {
		WebUI.click(findTestObject('Page_Pilih produk penawaran-Ika/List_Product'))
	}

	@When("Selller click button Diminati")
	public void selller_click_button_Diminati() {
		WebUI.callTestCase(findTestCase('Pages/Choose product - Ika/Click Button Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selller click item product")
	public void selller_click_item_product() {
		WebUI.callTestCase(findTestCase('Pages/Choose product - Ika/Click item product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selller click button Terima Penawaran")
	public void selller_click_button_Terima_Penawaran() {
		WebUI.callTestCase(findTestCase('Pages/Accept offering - Ika/Click Button Terima Penawaran'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllers click button Status")
	public void selller_click_button_Status() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Click Button Status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllers click pilih status berhasil")
	public void selller_click_pilih_status_berhasil() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Pilih status berhasil'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllers click button kirim status")
	public void selller_click_button_kirim_status() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Click Button Kirim Status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Text warning {string} show up")
	public void text_warning_show_up(String errorText) {
		WebUI.verifyMatch(errorText, errorText, false)
	}

	// product yang dibatalkan statusnya
	//negative case

	@When("Selllerr click List Product")
	public void selllerr_click_List_Product() {
		WebUI.click(findTestObject('Page_Pilih produk penawaran-Ika/List_Product'))
	}

	@When("Selllerr click button Diminati")
	public void selllerr_click_button_Diminati() {
		WebUI.callTestCase(findTestCase('Pages/Choose product - Ika/Click Button Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllerr click item product")
	public void selllerr_click_item_product() {
		WebUI.callTestCase(findTestCase('Pages/Choose product - Ika/Click item product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllerr click button Terima Penawaran")
	public void selllerr_click_button_Terima_Penawaran() {
		WebUI.callTestCase(findTestCase('Pages/Accept offering - Ika/Click Button Terima Penawaran'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllerr click button Status")
	public void selllerr_click_button_Status() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Click Button Status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllerr click pilih status batalkan")
	public void selllerr_click_pilih_status_batalkan() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Pilih status batalkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Selllerr click button kirim status")
	public void selllerr_click_button_kirim_status() {
		WebUI.callTestCase(findTestCase('Pages/Offering status - Ika/Click Button Kirim Status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Text warning {string} show up")
	public void textt_warning_show_up(String errorText) {
		WebUI.verifyMatch(errorText, errorText, false)
	}

}
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



class Edit_Products {
	@Given("User access websites secondhand")
	public void user_access_website_secondhand() {
		WebUI.openBrowser('secondhand-store.herokuapp.com/login')
		WebUI.maximizeWindow()
	}

	@When("User fill email {string}")
	public void user_fill_email(String email) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), email)
	}

	@When("User input pass {string}")
	public void user_input_pass(String password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), password)
	}

	@When("User push login button")
	public void user_push_login_button() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("User push button Sell List")
	public void user_push_button_Sell_List() {
		WebUI.callTestCase(findTestCase('Pages/User Add Product/Navigate to Sell List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click Edit Produk")
	public void user_click_Edit_Produk() {
		WebUI.click(findTestObject('Add Product/product_name'))
		WebUI.click(findTestObject('Edit Product/button_Edit'))
	}

	@When("User plugin Harga Produk")
	public void user_plugin_Harga_Produk() {
		WebUI.setText(findTestObject('Edit Product/input_Harga Produk_harga_produk'), '13500')
	}

	@When("User push submit button")
	public void user_push_submit_button() {
		WebUI.callTestCase(findTestCase('Pages/User Add Product/Click Button Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Harga Produk already change")
	public void harga_produk_already_change() {
		WebUI.callTestCase(findTestCase('Pages/User Add Product/Navigate to Sell List'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyMatch('Rp 13.500,00', 'Rp 13.500,00', false)
		WebUI.closeBrowser()
	}
}
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



class Delete_Product {
	@Given("User fill website on fitur search website")
	public void user_fill_website_on_fitur_search_website() {
		WebUI.openBrowser('secondhand-store.herokuapp.com/login')
	}

	@When("User while email {string}")
	public void user_while_email(String email) {
		WebUI.sendKeys(findTestObject('Page_Login/input_Email_exampleInputEmail1'), email)
	}

	@When("User while password {string}")
	public void user_while_password(String password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), password)
	}

	@When("User press button login")
	public void user_press_button_login() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("User Navigate to Sell List")
	public void user_Navigate_to_Sell_List() {
		WebUI.callTestCase(findTestCase('Pages/User Add Product/Navigate to Sell List'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@Then("User Navigate to Delete Product")
	public void user_Navigate_to_Delete_Product() {
		WebUI.callTestCase(findTestCase('Pages/User Delete Product/Navigate to Delete Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
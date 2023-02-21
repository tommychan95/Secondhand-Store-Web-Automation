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



class Register {
	@Given("User navigate to Register page")
	public void user_navigate_to_Register_page() {
		WebUI.callTestCase(findTestCase('Pages/User Register/Navigate to Register page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User write full name {string}")
	public void user_write_full_name(String full_name) {
		WebUI.setText(findTestObject('Page Register/register_input_name'), full_name)
	}

	@When("User write email {string}")
	public void user_write_email(String email) {
		WebUI.setText(findTestObject('Page Register/register_input_email'), email)
	}

	@When("User write password {string}")
	public void user_write_password(String password) {
		WebUI.setText(findTestObject('Page Register/register_input_password'), password)
	}

	@When("User click button Register")
	public void user_click_button_Register() {
		WebUI.callTestCase(findTestCase('Pages/User Register/Click button register'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Text Verified email show up")
	public void text_Verified_email_show_up() {
		WebUI.getText(findTestObject('Page Register/register_text_verified'))
	}

	@Then("Text warning email already used show up")
	public void text_warning_email_already_used_show_up() {
		WebUI.getText(findTestObject('Page Register/alert_email_registered'))
		WebUI.closeBrowser()
	}
}
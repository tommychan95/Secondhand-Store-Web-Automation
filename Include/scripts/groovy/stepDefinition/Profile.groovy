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



class Profile {
	@Given("User navigate to Profile page")
	public void user_navigate_to_profile_page() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Navigate to Profile Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input name {string}")
	public void user_input_name(String name) {
		WebUI.callTestCase(findTestCase('Pages/Profile/Insert Name'), [('name') : name], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input city {string}")
	public void user_input_city(String city) {
		WebUI.callTestCase(findTestCase('Pages/Profile/Change City'), [('city') : city], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input address {string}")
	public void user_input_address(String address) {
		WebUI.callTestCase(findTestCase('Pages/Profile/Insert Address'), [('address') : address, ('regex'): false], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input phone number {string}")
	public void user_input_phone(String phone) {
		WebUI.callTestCase(findTestCase('Pages/Profile/Insert Phone Number'), [('phone') : phone], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click button submit")
	public void user_click_button_Login() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Click Submit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Text success show up")
	public void text_success_show_up() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Verify Popup Success'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}

}
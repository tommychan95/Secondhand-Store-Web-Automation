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



class Search_Category {
	@Given("User access secondhand website")
	public void user_access_secondhand_website() {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/login')
	}

	@When("User while username with {string}")
	public void user_while_username_with(String email) {
		WebUI.sendKeys(findTestObject('Page_Login/input_Email_exampleInputEmail1'), email)
	}

	@When("User while password with {string}")
	public void user_while_password_with(String password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), password)
	}

	@When("User press button Login")
	public void user_press_button_Login() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@Then("User press button Hobby")
	public void user_press_button_Hobby() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Search by Hobby'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User access web secondhand")
	public void user_access_web_secondhand() {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/login')
	}

	@When("User fill username {string}")
	public void user_fill_username(String email) {
		WebUI.sendKeys(findTestObject('Page_Login/input_Email_exampleInputEmail1'), email)
	}

	@When("User fill pass {string}")
	public void user_fill_pass(String password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), password)
	}

	@When("User click Login")
	public void user_click_Login() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@Then("User click button Kesehatan")
	public void user_click_button_Kesehatan() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Search by Kesehatan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
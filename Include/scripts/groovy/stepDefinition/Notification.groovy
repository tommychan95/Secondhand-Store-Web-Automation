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



class Notification {
	@Given("User has successfully login into the website")
	public void user_has_successfully_login_into_the_website() {
		WebUI.openBrowser('secondhand-store.herokuapp.com/login')
		WebUI.maximizeWindow()
	}

	@When("User input username {string}")
	public void user_input_username(String Email) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), Email)
	}

	@When("User input passwords {string}")
	public void user_input_passwords(String Password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), Password)
	}

	@When("User click Login Button")
	public void user_click_Login_Button() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("User click Notification Button")
	public void user_click_Notification_Button() {
		WebUI.callTestCase(findTestCase('Pages/Notification/Click Notification Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Notification details displayed")
	public void notification_details_displayed() {
		WebUI.verifyElementVisible(findTestObject('Page_Notification/div_Penawaran_Produk'))
	}
}
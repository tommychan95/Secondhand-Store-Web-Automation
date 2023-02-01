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



class Logout {
	@Given("User already login")
	public void user_already_login() {
		WebUI.callTestCase(findTestCase('Pages/User Login/Navigate to login page'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Page_Login/login_input_email'), 'irmapujiandrianis@gmail.com')
		WebUI.setText(findTestObject('Page_Login/login_input_password'), 'Admin123')
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("user click logo user in navbar")
	public void user_click_logo_user_in_navbar() {
		WebUI.click(findTestObject('Page Logout/btn_logo_user'))
	}

	@When("user click button logout")
	public void user_click_button_logout() {
		WebUI.click(findTestObject('Page Logout/btn_logout'))
	}

	@Then("button Masuk will show up")
	public void button_Masuk_will_show_up() {
		WebUI.verifyElementPresent(findTestObject('Page_Login/homepage_btn_login'), 0)
		WebUI.closeBrowser()
	}
}
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



class Offering {
	@Given("Buyer has successfully login into website")
	public void buyer_has_successfully_login_into_website() {
		WebUI.openBrowser('secondhand-store.herokuapp.com/login')
		WebUI.maximizeWindow()
	}

	@When("Buyer input username {string}")
	public void buyer_input_username(String Email) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), Email)
	}

	@And("Buyer input password {string}")
	public void buyer_input_password(String Password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), Password)
	}

	@And("Buyer click on LOGIN Button")
	public void buyer_click_on_LOGIN_Button() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@And("Buyer click on PRODUCT Image")
	public void buyer_click_on_PRODUCT_Image() {
		WebUI.click(findTestObject('Page_Offering/img_Product_Patung_Motor'))
	}

	@And("Buyer click on INTERESTED Button")
	public void buyer_click_on_INTERESTED_Button() {
		WebUI.click(findTestObject('Page_Offering/button_interested'))
	}

	@And("Buyer input Offering Price {string}")
	public void buyer_input_Offering_Price(String Harga_Tawar) {
		WebUI.sendKeys(findTestObject('Page_Offering/input_Harga_Tawar'), Harga_Tawar)
	}

	@And("Buyer click SEND Button")
	public void buyer_click_SEND_Button() {
		WebUI.click(findTestObject('Page_Offering/button_Send'))
	}

	@Then("Message Harga Tawar Berhasil dikirim displayed")
	public void message_Harga_Tawar_Berhasil_dikirim_displayed() {
		WebUI.waitForElementVisible(findTestObject('Page_Offering/message_Harga_tawar_berhasil'), 2)
	}
}
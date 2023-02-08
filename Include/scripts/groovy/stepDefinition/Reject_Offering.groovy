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



class Reject_Offering {
	@Given("Seller has login into the secondhand store website")
	public void seller_has_login_into_the_secondhand_store_website() {
		WebUI.openBrowser('secondhand-store.herokuapp.com/login')
		WebUI.maximizeWindow()
	}

	@When("Seller input email {string}")
	public void seller_input_email(String Email) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), Email)
	}

	@When("Seller input Password {string}")
	public void seller_input_Password(String Password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), Password)
	}

	@When("Seller click LOGIN Button")
	public void seller_click_LOGIN_Button() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("Seller click List Menu")
	public void seller_click_List_Menu() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click List Menu'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click Interested Menu")
	public void seller_click_Interested_Menu() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click Diminati Menu'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click Product")
	public void seller_click_Product() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click Interested Product 1'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click Reject Button")
	public void seller_click_Reject_Button() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click Reject'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click Yes Button")
	public void seller_click_Yes_Button() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click Yes'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller wait for Message displayed {string}")
	public void seller_wait_for_Message_displayed(String string) {
		WebUI.waitForElementVisible(findTestObject('Page_Reject_Offering/Msg_Tawaran_produk_ditolak'), 2)
	}

	@When("Seller click Productt")
	public void seller_click_Productt() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click Interested Product 2'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click Rejects Button")
	public void seller_click_Rejects_Button() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click Reject'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click No Button")
	public void seller_click_No_Button() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click No'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Seller click Back Button")
	public void seller_click_Back_Button() {
		WebUI.click(findTestObject('Page_Reject_Offering/arrow-left_button'))
	}
	
	@When("Seller click Interestedd Menu")
	public void seller_click_Interestedd_Menu() {
		WebUI.callTestCase(findTestCase('Pages/Reject Offering/Click Diminati Menu'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Product still in Interested Menu")
	public void product_still_in_Interested_Menu() {
		WebUI.verifyElementVisible(findTestObject('Page_Reject_Offering/p_Samsung_Galaxy_A8_Elektronik'))
	}
}
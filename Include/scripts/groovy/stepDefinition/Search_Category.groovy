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
	@Given("User open secondhand website")
	public void user_open_secondhand_website() {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/')
	}

	@When("User click button Hobby")
	public void user_click_button_Hobby() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Click button Hoby'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Just product with category Hoby will appear")
	public void just_product_with_category_Hoby_will_appear() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Search by Hobby'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}

	@When("User click button Kesehatann")
	public void user_click_button_Kesehatann() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Click button Kesehatan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Just product with category kesehatan will appear")
	public void just_product_with_category_kesehatan_will_appear() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Search by Kesehatan'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}

	@When("User click button Baju")
	public void user_click_button_Baju() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Click button Baju'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Just product with category Baju will appear")
	public void just_product_with_category_Baju_will_appear() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Search by baju'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}

	@When("User click button Elektronik")
	public void user_click_button_Elektronik() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Click button Elektronik'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Just product with category Elektronik will appear")
	public void just_product_with_category_Elektronik_will_appear() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Serach by Elektronik'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}

	@When("User click button Kendaraan")
	public void user_click_button_Kendaraan() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Click button Kendaraan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Just product with category Kendaraan will appear")
	public void just_product_with_category_Kendaraan_will_appear() {
		WebUI.callTestCase(findTestCase('Pages/User Search by Category Product/Search by Kendaraan'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}
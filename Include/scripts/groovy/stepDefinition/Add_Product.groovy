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



class Add_Product {

	@Given("User success access secondhand website")
	public void user_success_access_secondhand_website() {
		WebUI.openBrowser('secondhand-store.herokuapp.com/login')
		WebUI.maximizeWindow()
	}

	@When("User login account")
	public void user_login_account() {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), 'ndesyntha@gmail.com')
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), 'Desyntha@123')
		WebUI.verifyElementPresent(findTestObject('Page_Login/login_btn'), 3)
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("User click button Sell List")
	public void user_click_button_Sell_List() {
		WebUI.callTestCase(findTestCase('Pages/User Add Product/Navigate to Sell List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click button Add Product")
	public void user_click_button_Add_Product() {
		WebUI.callTestCase(findTestCase('Pages/User Add Product/Navigate to Add Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Nama Produk {string}")
	public void user_input_Nama_Produk(String product_name) {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Name'), product_name)
	}

	@When("User input Harga Produk {string}")
	public void user_input_Harga_Produk(String product_price) {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Price'), product_price)
	}

	@When("User choose Categori")
	public void user_choose_Categori() {
		WebUI.waitForElementPresent(findTestObject('Add Product/dropdown_Category'), 0)
		WebUI.selectOptionByValue(findTestObject('Add Product/select_Pilih KategoriHobyKendaraanBajuElekt_b1877d'), '1', false)
	}

	@When("User input Deskripsi {string}")
	public void user_input_Deskripsi(String product_desc) {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Description'), product_desc)
	}

	@When("User click btn submit")
	public void user_click_btn_submit() {
		WebUI.click(findTestObject('Add Product/button_Terbitkan'))
	}

	@Then("Product already created")
	public void product_already_created() {
		WebUI.click(findTestObject('Add Product/button_icon_list'))
		WebUI.verifyElementPresent(findTestObject('Add Product/product_name'), 0)
		WebUI.closeBrowser()
	}

	@Then("User receive a failed product add notification")
	public void user_receive_a_failed_product_add_notification() {
		WebUI.callTestCase(findTestCase('Pages/User Add Product/Notification Unsuccess Add Product'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}
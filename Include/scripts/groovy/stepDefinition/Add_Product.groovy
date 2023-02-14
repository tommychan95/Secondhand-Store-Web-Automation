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
	@Given("User successfully access secondhand website")
	public void user_successfully_access_secondhand_website() {
		WebUI.openBrowser('secondhand-store.herokuapp.com/login')
	}

	@When("User input username {string}")
	public void user_input_username(String email) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), email)
	}

	@When("User input passwordd {string}")
	public void user_input_passwordd(String password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), password)
	}

	@When("User click login button")
	public void user_click_login_button() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("User click Sell List")
	public void user_click_Sell_List() {
		WebUI.click(findTestObject('Sell List/btn_sell list'))
	}

	@When("User click Add Product")
	public void user_click_Add_Product() {
		WebUI.click(findTestObject('Sell List/a_Tambah Produk'))
	}

	@When("User fill Nama Produk")
	public void user_fill_Nama_Produk() {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Name'), 'Jedai Hercules')
	}

	@When("User fill Harga Produk")
	public void user_fill_Harga_Produk() {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Price'), '20000')
	}

	@When("User choose Kategori")
	public void user_choose_Kategori() {
		WebUI.selectOptionByValue(findTestObject('Add Product/select_Pilih KategoriHobyKendaraanBajuElekt_b1877d'), '1', false)
	}

	@When("User fill Deskripsi")
	public void user_fill_Deskripsi() {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Description'), 'Good Quality Produk')
	}

	@Then("User click submit button")
	public void user_click_submit_button() {
		WebUI.click(findTestObject('Add Product/btn_Publish'))
	}

	@Given("User success open browser secondhand")
	public void user_success_open_browser_secondhand() {
		WebUI.openBrowser('secondhand-store.herokuapp.com/login')
	}

	@When("User fill email with {string}")
	public void user_fill_email_with(String email) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_email'), email)
	}

	@When("User fill pwd with {string}")
	public void user_fill_pwd_with(String password) {
		WebUI.sendKeys(findTestObject('Page_Login/login_input_password'), password)
	}

	@When("User press btn login")
	public void user_press_btn_login() {
		WebUI.click(findTestObject('Page_Login/login_btn'))
	}

	@When("User press btn sell list")
	public void user_press_btn_sell_list() {
		WebUI.click(findTestObject('Sell List/btn_sell list'))
	}

	@When("User press btn add product")
	public void user_press_btn_add_product() {
		WebUI.click(findTestObject('Sell List/a_Tambah Produk'))
	}

	@When("User fill product name")
	public void user_fill_product_name() {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Name'), 'Bolpoint')
	}

	@When("User fill product price")
	public void user_fill_product_price() {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Price'), '5000')
	}

	@When("User choose category")
	public void user_choose_category() {
		WebUI.selectOptionByValue(findTestObject('Add Product/select_Pilih KategoriHobyKendaraanBajuElekt_b1877d'), '4', false)
	}

	@When("User fill description")
	public void user_fill_description() {
		WebUI.sendKeys(findTestObject('Add Product/textfield_Product Description'), 'Ini dijual ya')
	}

	@When("User receives a failed product add notification")
	public void user_receives_a_failed_product_add_notification() {
		WebUI.callTestCase(findTestCase('Pages/User Add Product/Notification Unsuccess Add Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User press btn submit")
	public void user_press_btn_submit() {
		WebUI.click(findTestObject('Add Product/btn_Publish'))
	}
}
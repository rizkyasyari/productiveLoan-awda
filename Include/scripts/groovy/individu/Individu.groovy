package individu

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
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
import com.kms.katalon.keyword.excel.ExcelKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.Keys

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


class Individu {


	//	def path = RunConfiguration.getProjectDir().replace('/', '\\')
	//	def excel = ExcelKeywords.getExcelSheetByName('Data Files/' + GlobalVariable.Data, 'Login')

	@Given("I open the Url")
	def IOpenTheUrl() {


		'Setup Driver Browser'
		RunConfiguration.setWebDriverPreferencesProperty('args', ['window-size=1920,1080'])

		//		Map<String, Object> chromePrefs = new HashMap<String, Object>();
		//		chromePrefs.put("profile.default_content_setting_values.notifications", 2);
		//		RunConfiguration.setWebDriverPreferencesProperty('prefs', chromePrefs);

		'Opening Browser'
		WebUI.openBrowser(GlobalVariable.Url)

		WebUI.maximizeWindow()

		'Deleting Cookies'
		WebUI.deleteAllCookies()
	}

	@When("I choice individu on loan application form")
	def ChoiceLoanApplication() {
		'Choise Individu'
		WebUI.click(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/arrow-pengajuan-pinjaman'))
		WebUI.click(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/pengajuan-Individu'))
	}

	@And("I write phone number form")
	def WritePhoneNumber() {
		'Write Phone Number'
		WebUI.setText(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/input_Nomor Handphone Pemohon'), '086773647308')
	}

	@And("I write otp code form")
	def WriteOTP() {
		'Click Send OTP'
		WebUI.click(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/button_Kirim OTP'))

		WebUI.delay(1)

		'Input OTP'
		WebUI.setText(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/input_Kode OTP'), '8888')
	}

	@And("I click Lanjut button")
	def ClickLanjut() {
		'Click Lanjut'
		WebUI.click(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/button_LANJUT'))
	}

	@Then("verify the Pertanyaan Pembiyaan in step")
	def VerifyPembiayaan() {
		'Verify Pertanyaan Pembiayaan'

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/body_Formulir Pembiayaan Modal Usaha    123_046b86'),3)

		WebUI.takeScreenshot()
	}
}

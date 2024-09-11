import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang3.RandomStringUtils as RandStr
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils
import java.util.concurrent.ThreadLocalRandom as ThreadLocalRandom
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

//import com.kms.katalon.core.configuration.RunConfiguration
'buka browser (default: chrome)'
WebUI.openBrowser('')

'maximize window size'
WebUI.maximizeWindow()

'go to url --> https://admin-fat.maucash.id/productive-loan/index.html#/'
WebUI.navigateToUrl(GlobalVariable.Url)

//'Pilih Pembiayaan Modal Usaha\n'
//WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_Formulir Pembiayaan Modal Usaha'))
'Pilih Pengajuan Pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_pengajuanPinjaman'))

'Pilih Individu'
WebUI.click(findTestObject('Bisnis/span_Badan Usaha'))

//WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_noHandphonePemohon'), noHandphonePemohon)
//def randomString = RandomStringUtils.randomNumeric(16);
'Input nomor hp'
def randomPhoneNumber = ThreadLocalRandom.current().nextLong(100000000, 999999999)

WebUI.setText(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/input_Nomor Handphone Pemohon'), 
    String.valueOf('08' + randomPhoneNumber))

WebUI.delay(3)

'Click Send OTP'
WebUI.click(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/button_Kirim OTP'))

WebUI.delay(1)

'Input OTP'
WebUI.setText(findTestObject('Object Repository/Page_Pembiayaan Modal Usaha - Maucash - Maucash/input_Kode OTP'), '8888')

WebUI.takeFullPageScreenshot()

'klik tombol lanjut'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/btn_lanjut'))

'pilih produk pembiayaan'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_produkPembiayaan'))

'pilih invoice financing\r\n'
WebUI.click(findTestObject('Individu/Working Capital/new/txt_invoiceFinancing'))

'pilih tenor pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_tenorPinjaman'))

WebUI.click(findTestObject('Individu/Working Capital/new/li_1bulan'))

'input jumlah pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_amountPinjaman'))

'pilih tujuan pembiayaan'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_tujuaanPembiayaan'))

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/li_Ekspansi Bisnis'))

WebUI.takeFullPageScreenshot()

'klik tombol lanjut'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/button_LANJUT_1'))

WebUI.setText(findTestObject('Bisnis/txt_namaBadanUsaha'), 'PT Invoice Financing')

WebUI.click(findTestObject('Bisnis/slc_bentukBadanUSaha'))

WebUI.click(findTestObject('Bisnis/txt_Commanditer Venotschap (CV)'))

// Generate a random 16-digit number
'generate angka npwp'
def randomNumber = ThreadLocalRandom.current().nextLong(1000000000000000, 9999999999999999)

// Replace 'your_test_object' with the actual Test Object representing the text field
WebUI.setText(findTestObject('Bisnis/txt_NPWP'), String.valueOf(randomNumber))

WebUI.click(findTestObject('Bisnis/icon_camera'))

//RunConfiguration.setWebUiDriverProperty("prefs", "{\"profile.default_content_setting_values.media_stream_camera\": 1}")
//Map desiredCapabilities = RunConfiguration.getDriverPreferencesProperties("WebUI")
//Map prefs = desiredCapabilities.get("prefs")
//prefs.put("download.default_directory", "Your location")
//RunConfiguration.setWebDriverPreferencesProperty("prefs", prefs)
//Robot robot = new Robot();
//robot.delay(5000);
//robot.keyPress(KeyEvent.VK_TAB);
//robot.keyRelease(KeyEvent.VK_TAB);
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
WebUI.click(findTestObject('Bisnis/btn_capture'))

WebUI.setText(findTestObject('Bisnis/txt_emailBadanUsaha'), 'PTInvoiceFinancing@gmail.com')

WebUI.setText(findTestObject('Bisnis/txt_alamatTempatUsaha'), 'Jl.PT Invoice Financing')

'Input Provinsi Tempat Usaha'
WebUI.click(findTestObject('Bisnis/new/input_Provinsi Badan Usaha_el-input__inner'))

WebUI.click(findTestObject('Bisnis/new/span_DKI Jakarta'))

'Input Kota atau Kabupaten Tempat Usaha'
WebUI.click(findTestObject('Bisnis/new/input_Kabupaten atau Kota Badan Usaha_el-input__inner'))

WebUI.click(findTestObject('Bisnis/new/span_Jakarta Barat'))

'Input Kecamatan Tempat Usaha'
WebUI.click(findTestObject('Bisnis/new/input_Kecamatan Badan Usaha_el-input__inner'))

WebUI.click(findTestObject('Bisnis/new/span_Grogol Petamburan'))

'Input Kelurahan Tempat Usaha'
WebUI.click(findTestObject('Bisnis/new/input_Kelurahan Badan Usaha_el-input__inner'))

WebUI.click(findTestObject('Bisnis/new/span_Tanjung Duren Selatan'))

WebUI.setText(findTestObject('Bisnis/new/txt_namaLengkapPenanggungJawabPerusahaan'), 'H. Cecep PT Invoice Financing')

WebUI.setText(findTestObject('Bisnis/new/txt_noHPPenanggungJawabPerusahaan'), '089717178111')

WebUI.setText(findTestObject('Bisnis/new/txt_jabatan'), 'Just an ordinary staff')

'Klik checkbox'
WebUI.click(findTestObject('Object Repository/Bisnis/clickbox_bisnis1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Bisnis/clickbox_bisnis2'))

WebUI.delay(1)

WebUI.click(findTestObject('Bisnis/clickbox_bisinis3'))

//WebUI.verifyElementClickable(findTestObject('Object Repository/Bisnis/btn_lanjutBisnisStage2'))
WebUI.takeFullPageScreenshot()

'Klik lanjut'
WebUI.click(findTestObject('Object Repository/Bisnis/btn_lanjutBisnisStage2'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()


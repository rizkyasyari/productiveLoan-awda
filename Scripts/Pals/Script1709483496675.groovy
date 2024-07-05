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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin-fat.maucash.id/productive-loan/index.html#/')

'Pilih Menikah'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_menikah'))

'Pilih apakah pisah harta'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/slc_pisahHarta'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_tidak'))

'Klik icon camera untuk foto ktp pasangan'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/img_camera'))


'klik tombil capture'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/btn_capture'))

'Input Nomor KTP Pasangan'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_noKTPPasangan'), '3173036912901001')

'Input Nama Pasangan sesuai KTP'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_namaLengkapPasangan'), 'Bodohnya')

'Input Tempat Tanggal Lahir Pasangan sesuai KTP'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/input_Tempat Lahir Pasangan_el-input__inner'), 'jaka')

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_jakartaBarat'))

'Input Tanggal Lahir Pasangan sesuai KTP'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_tanggalLahirPasangan'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_5'))

'Input Bulan Lahir Pasangan sesuai KTP'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/input_Tanggal Lahir Pasangan_el-input__inner_1'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_april'))

'Input Tahun Lahir Pasangan sesuai KTP'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/input_Tanggal Lahir Pasangan_el-input__inner_1_2'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_1990'))


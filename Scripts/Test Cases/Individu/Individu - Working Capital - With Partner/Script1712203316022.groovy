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

'buka browser (default: chrome)'
WebUI.openBrowser('')

'maximize window size'
WebUI.maximizeWindow()

'go to url --> https://admin-fat.maucash.id/productive-loan/index.html#/'
WebUI.navigateToUrl(GlobalVariable.Url)

'Pilih Pembiayaan Modal Usaha\n'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_Formulir Pembiayaan Modal Usaha'))

'Pilih Pengajuan Pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_pengajuanPinjaman'))

'Pilih Individu'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_individu'))

'Input nomor hp'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_noHandphonePemohon'), noHandphonePemohon)

'klik tombol kirim OTP'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/btn_kirimOTP'))

'input kode otp'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_kodeOTP'), kodeOTP)

WebUI.takeFullPageScreenshot()

'klik tombol lanjut'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/btn_lanjut'))

'pilih produk pembiayaan'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_produkPembiayaan'))

'pilih working capital'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_workingCapital'))

'pilih tenor pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_tenorPinjaman'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/li_5 bulan'))

'input jumlah pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_amountPinjaman'))

'pilih tujuan pembiayaan'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_tujuaanPembiayaan'))

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/li_Ekspansi Bisnis'))

WebUI.takeFullPageScreenshot()

'klik tombol lanjut'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/button_LANJUT_1'))

'klik icon camera untuk foto ktp'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/input_Foto Identitas (KTP)_el-input__inner'))

WebUI.delay(10)

'klik tombol capture'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/span_Capture'))

'input nomor ktp'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_noKTP'), ktp)

'input nama lengkap sesuai KTP'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_namaLengkap'), namaLengkap)

'pilih jenis kelamin'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/span_Jenis Kelamin_el-radio__inner'))

'input tempat lahir debitur seusai ktp'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_tempatLahir'), tempatLahir)

WebUI.click(findTestObject('Individu/Working Capital/new/txt_jakartaSelatan'))

'input tanggal lahir sesuai ktp'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_tanggalLahir'))

WebUI.click(findTestObject('Individu/Working Capital/new/li_5'))

'input bulan lahir sesuai ktp'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/input_Tanggal Lahir_el-input__inner_1'))

WebUI.click(findTestObject('Individu/Working Capital/new/txt_mei'))

'input tahun lahir sesuai ktp'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/input_Tanggal Lahir_el-input__inner_1_2'))

WebUI.click(findTestObject('Individu/Working Capital/new/txt_1989'))

'pilih status pernikahan debitur'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_statusPernikahanDebitur'))

'Pilih Menikah'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_menikah'))

'input email'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_email'), email)

'Pilih apakah pisah harta'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/slc_pisahHarta'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_tidak'))

'Klik icon camera untuk foto ktp pasangan'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/img_camera'))

'klik tombil capture'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/btn_capture'))

'Input Nomor KTP Pasangan'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_noKTPPasangan'), ktpPasangan)

'Input Nama Pasangan sesuai KTP'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_namaLengkapPasangan'), namaLengkapPasangan)

'Input Tempat Tanggal Lahir Pasangan sesuai KTP'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/input_Tempat Lahir Pasangan_el-input__inner'), tempatLahirPasangan)

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_jakartaBarat'))

'Input Tanggal Lahir Pasangan sesuai KTP'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_tanggalLahirPasangan'))

WebUI.click(findTestObject('Individu/Working Capital/Stage 2/Married/txt_2'))

'Input Bulan Lahir Pasangan sesuai KTP'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/input_Tanggal Lahir Pasangan_el-input__inner_1'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_april'))

'Input Tahun Lahir Pasangan sesuai KTP'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/input_Tanggal Lahir Pasangan_el-input__inner_1_2'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 2/Married/txt_1990'))

'input alamat ktp'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_alamatSesuaiKTP'), alamatKTP)

'pilih provinsi sesuai ktp'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_provinsiKTP'))

WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_provinsiKTP'), provinsiKTP)

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/span_DKI Jakarta'))

'pilih kota dan kabupaten sesuai ktp'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_kotaAtauKabupatenKTP'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_jakartaSelatan'))

'pilih kecamatan sesuai ktp'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_kecamatanKTP'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/span_Kebayoran Lama'))

'input kelurahan sesuai ktp'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_kelurahanKTP'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_grogolSelatan'))

'input alamat domisili'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_alamatDomisili'), alamatDomisili)

'klik tombol lanjut'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/btn_lanjut_1'))

'Input Nama Tempat Usaha'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_namaTempatUsaha'), namaTempatUsaha)

'Input Alamat Tempat Usaha'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_alamatTempatUsaha'), alamatTempatUsaha)

'Input Provinsi Tempat Usaha'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_provinsiTempatUsaha'))

WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_provinsiTempatUsaha'), provinsiTempatUsaha)

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_DKIJakarta'))

'Input Kota atau Kabupaten Tempat Usaha'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_kotaAtauKabupatenTempatUsaha'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/li_Jakarta Barat'))

'Input Kecamatan Tempat Usaha'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_kecamatanTempatUsaha'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_grogolPetamburan'))

'Input Kelurahan Tempat Usaha'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_kelurahanTempatUsaha'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_tanjungDurenSelatan'))

'Klik checkbox'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/span_Kode Pos Sesuai Tempat Usaha_el-checkb_7a8f53'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/span_Kode Pos Sesuai Tempat Usaha_el-checkb_7a8f53'))

WebUI.takeFullPageScreenshot()

'Klik tombol lanjut'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/btn_lanjut'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Individu/Working Capital/Stage 3/img'), 600)

berhasil = WebUI.getText(findTestObject('Object Repository/Individu/Working Capital/Stage 3/txt_Terima kasih telah melakukan pengajuan _1e795e'))

WebUI.comment(berhasil)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


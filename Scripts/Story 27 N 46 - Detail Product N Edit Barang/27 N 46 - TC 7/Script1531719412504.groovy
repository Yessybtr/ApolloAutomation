import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.comment('Edit Nama Barang field blank')

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), 'content-desc', 
    'ubahinfoButton', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.comment('Ubah Jumlah Stok')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), 'content-desc', 
    'input_anumberpicker', GlobalVariable.G_ShortTimeOut)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), '40', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), 'text', 
    '40', GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), GlobalVariable.G_ShortTimeOut)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), 'content-desc', 'productSubmitBtn', 
    0)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), GlobalVariable.G_ShortTimeOut)

Mobile.comment('Error message will appear')

Alert = Mobile.getText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Error Message - Nama Barang field'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyEqual(Alert, 'Nama Barang is required')


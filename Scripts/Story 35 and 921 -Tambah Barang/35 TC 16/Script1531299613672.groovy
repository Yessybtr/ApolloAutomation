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

Mobile.comment(' Check if Harga Jual equal or below Harga Beli')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), 'content-desc', 
    'productSalePriceTextInput', GlobalVariable.G_ShortTimeOut)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), '60000', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), '60.000')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), 'content-desc', 'productSubmitBtn', 
    GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), GlobalVariable.G_ShortTimeOut)

ErMsg = Mobile.getText(findTestObject('Sidebar Menu/Produk/Tambah Barang/ErMsg1 - Harga Jual'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyEqual(ErMsg, 'Harga jual sama/lebih rendah dari harga beli.')


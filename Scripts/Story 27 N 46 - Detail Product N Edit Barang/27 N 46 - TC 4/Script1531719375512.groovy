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

Mobile.comment('Edit Stock by Increase or decrease product')

for (def index : (0..10)) {
    Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/PlusTap - JumlaH Stock'), GlobalVariable.G_ShortTimeOut)

    Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/PlusTap - JumlaH Stock'), 'content-desc', 
        'action_plus_anumberpicker', GlobalVariable.G_ShortTimeOut)

    Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/PlusTap - JumlaH Stock'), 5)
}

for (def index : (0..2)) {
    Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Minus Tap - Jumlah Stock'), GlobalVariable.G_ShortTimeOut)

    Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Minus Tap - Jumlah Stock'), 'content-desc', 
        'action_minus_anumberpicker', GlobalVariable.G_ShortTimeOut)

    Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Minus Tap - Jumlah Stock'), 5)
}

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)


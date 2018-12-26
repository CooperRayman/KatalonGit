import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://www.auto24.ee/main/mainindex.php")
selenium.click("id=searchParam-bodytype")
selenium.select("id=searchParam-bodytype", "label=regexp:\\s+universaal")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Keretüüp'])[2]/following::option[6]")
selenium.select("id=searchParam-cmm-1-make", "label=Audi")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Mark'])[1]/following::option[30]")
selenium.click("id=searchParam-cmm-1-model_id")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Mudel'])[1]/following::label[1]")
selenium.click("id=searchParam-fuel")
selenium.select("id=searchParam-fuel", "label=bensiin")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Kütus'])[1]/following::option[3]")
selenium.click("id=searchParam-year")
selenium.type("id=searchParam-year", "2009")
selenium.click("name=otsi")
selenium.click("link=Audi A6 Facelift S-Line 2.8 TSI 140 kW")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Vaata lähemalt »'])[1]/following::img[1]")

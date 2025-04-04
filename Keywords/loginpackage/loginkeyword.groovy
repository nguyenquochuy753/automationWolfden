package loginpackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginkeyword {
	@Keyword
	def login(String username, String password) {

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://dev.wolfden.win/')

		WebUI.setText(findTestObject('Object Repository/UI/Page_Authorize - Wolfden/authorizeInput'),
				"racebook")

		WebUI.click(findTestObject('Object Repository/UI/Page_Authorize - Wolfden/submitBtn'))

		WebUI.click(findTestObject('UI/Page_Home_Wolfden/loginBtn'))

		TestObject usernameField = findTestObject('UI/Page_Login - Wolfden/usernameInput')

		WebUI.click(usernameField)

		for (char ch : username.toCharArray()) {
			WebUI.sendKeys(usernameField, String.valueOf(ch))
			WebUI.delay(0.5)
		}

		WebUI.delay(5)

		TestObject passwordField = findTestObject('UI/Page_Login - Wolfden/passwordInput')

		WebUI.click(passwordField)

		for (char ch : password.toCharArray()) {
			WebUI.sendKeys(passwordField, String.valueOf(ch))
			WebUI.delay(0.5)
		}

		WebUI.delay(5)

		WebUI.click(findTestObject('UI/Page_Login - Wolfden/loginBtn'))
	}
}

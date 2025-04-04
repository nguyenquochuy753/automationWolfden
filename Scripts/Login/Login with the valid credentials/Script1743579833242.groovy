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

CustomKeywords.'authorizepackage.authorizekeyword.authorize'('racebook')

WebUI.delay(5)

WebUI.click(findTestObject('UI/Page_Login - Wolfden/usernameInput'))

WebUI.setText(findTestObject('UI/Page_Login - Wolfden/usernameInput'), 'nguyenqhuy753101')

WebUI.delay(5)

WebUI.click(findTestObject('UI/Page_Login - Wolfden/passwordInput'))

WebUI.sendKeys(findTestObject('Object Repository/UI/Page_Login - Wolfden/passwordInput'), 'h')

WebUI.delay(0.5)

WebUI.sendKeys(findTestObject('Object Repository/UI/Page_Login - Wolfden/passwordInput'), 'u')

WebUI.delay(0.5)

WebUI.sendKeys(findTestObject('Object Repository/UI/Page_Login - Wolfden/passwordInput'), 'y')

WebUI.sendKeys(findTestObject('Object Repository/UI/Page_Login - Wolfden/passwordInput'), '1')

WebUI.delay(0.5)

WebUI.sendKeys(findTestObject('Object Repository/UI/Page_Login - Wolfden/passwordInput'), '2')

WebUI.delay(0.5)

WebUI.sendKeys(findTestObject('Object Repository/UI/Page_Login - Wolfden/passwordInput'), '3')

WebUI.delay(5)

WebUI.click(findTestObject('UI/Page_Login - Wolfden/loginBtn'))

WebUI.click(findTestObject('UI/Page_Home_Wolfden/profileNavigation'))

WebUI.verifyElementText(findTestObject('UI/Page_Profile_Wolfden/displayNameTxt'), 'nguyenqhuy7531')

WebUI.verifyElementText(findTestObject('UI/Page_Profile_Wolfden/usernameTxt'), '@nguyenqhuy753101')

WebUI.closeBrowser()


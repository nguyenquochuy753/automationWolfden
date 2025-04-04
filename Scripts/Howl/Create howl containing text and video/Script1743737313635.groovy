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

text = 'Test'

CustomKeywords.'loginpackage.loginkeyword.login'('nguyenqhuy753101', 'huy123')

WebUI.click(findTestObject('UI/Page_Home_Wolfden/newHowlBtn'))

WebUI.sendKeys(findTestObject('UI/Page_CreateHowl_Wolfden/writehowlTextbox'), text)

WebUI.uploadFile(findTestObject('UI/Page_CreateHowl_Wolfden/uploadFileBtn'), 'C:\\\\Users\\\\HUY\\\\Downloads\\\\minion.mp4')

WebUI.click(findTestObject('UI/Page_CreateHowl_Wolfden/howlBtn'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('UI/Page_Howl_Wolfden/yourHowlWasSentTxt'), 'Your Howl was sent')

WebUI.verifyElementText(findTestObject('UI/Page_Howl_Wolfden/displayNameTxt'), 'nguyenqhuy7531')

WebUI.verifyElementText(findTestObject('UI/Page_Howl_Wolfden/usernameTxt'), '@nguyenqhuy753101')

WebUI.verifyElementText(findTestObject('UI/Page_Howl_Wolfden/enteredTextTxt'), text)

WebUI.verifyElementPresent(findTestObject('UI/Page_Howl_Wolfden/uploadedVideo'), 0)

CustomKeywords.'howlpackage.howlkeyword.deleteHowl'()

WebUI.closeBrowser()


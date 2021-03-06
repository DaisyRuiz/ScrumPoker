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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://lifecharger.org/')

WebUI.setText(findTestObject('Object Repository/Page_Life Charger   a new beginning (2)/input_s'), 'Life')

WebUI.click(findTestObject('Object Repository/Page_Life Charger   a new beginning (2)/span_fa fa-search'))

//WebUI.verifyElementPresent('Object Repository/Page_Life Charger   a new beginning/a_Home',2)
WebUI.click(findTestObject('Object Repository/Page_Life Charger   a new beginning/a_About'))

WebUI.click(findTestObject('Object Repository/Page_Life Charger   a new beginning (1)/a_Archives'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://lifecharger.org/')

WebUI.click(findTestObject('Page_Life Charger   a new beginning (1)/Page_Life Charger   a new beginning/a_Archives'))

WebUI.click(findTestObject('Page_Life Charger   a new beginning (1)/Page_Archives  Life Charger/a_What is Discipline'))

WebUI.click(findTestObject('Page_Life Charger   a new beginning (1)/Page_What is Discipline  Life Charg/a_Click to email this to a fri'))

WebUI.click(findTestObject('Page_Life Charger   a new beginning (1)/Page_What is Discipline  Life Charg/a_Cancel'))

WebUI.navigateToUrl('http://lifecharger.org/')

WebUI.click(findTestObject('Page_Life Charger   a new beginning (1)/Page_Archives  Life Charger/Page_What is Discipline  Life Charg/a_facebook'))

WebUI.switchToWindowTitle('LifeCharger.org - Inicio | Facebook')

WebUI.setText(findTestObject('Object Repository/Page_Life Charger   a new beginning (1)/Page_Archives  Life Charger/Page_LifeCharger.org - Inicio  Face/input_email'), 
    'testingsyesoftware@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Life Charger   a new beginning (1)/Page_Archives  Life Charger/Page_LifeCharger.org - Inicio  Face/input_pass'), 
    'SYE12345')

WebUI.submit(findTestObject('input_u_0_3'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://thetestingworld.com/testings/register.php')

WebUI.doubleClick(findTestObject('Testingworld/Page_Login  Sign Up Forms/input_fld_username'))

WebUI.doubleClick(findTestObject('Testingworld/Page_Login  Sign Up Forms/input_fld_email'))

WebUI.click(findTestObject('Testingworld/Page_Login  Sign Up Forms/input_add_type'))

WebUI.click(findTestObject('Testingworld/Page_Login  Sign Up Forms/input_terms'))

WebUI.closeBrowser()


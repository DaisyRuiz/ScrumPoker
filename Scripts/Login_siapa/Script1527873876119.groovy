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
import org.openqa.selenium.WebDriver as WebDriver
import org.apache.xpath.Arg
import org.codehaus.groovy.tools.groovydoc.Main
import org.openqa.selenium.By
import org.openqa.selenium.By.ByClassName
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.server.htmlrunner.HTMLLauncher.Args
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static org.testng.Assert.assertNotNull;

WebUI.openBrowser("http://ec2-34-237-100-2.compute-1.amazonaws.com/siapa/web-v2/login")
WebUI.navigateToUrl("http://ec2-34-237-100-2.compute-1.amazonaws.com/siapa/web-v2/inicio")
WebDriver driver = DriverFactory.getWebDriver();

//Inicar sesión
WebUI.setText(findTestObject('Object Repository/Objetos Login_SIAPA/input_email'), "sye@syesoftware.com")
WebElement pass =driver.findElement(By.id("sp-password")).sendKeys("qqqqqq0");
 //Si la contraseña no es correcta da clic a recuperar contraseña
Thread.sleep(2000);
String passactual =driver.findElement(By.id("sp-password")).getAttribute("value");
String passEsperado= "qqqqqq";
Thread.sleep(2000);
 


if(passactual == passEsperado) {
WebUI.click(findTestObject('Object Repository/Objetos Login_SIAPA/button_Iniciar sesion'))

}else   {

WebElement RecuperarPas = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div[2]/div/label/a")).click()
WebElement email= driver.findElement(By.xpath("/html/body/app-root/app-login/app-dialog[1]/div[1]/div[2]/div/div/form/div/input")).sendKeys("Da@da");
WebElement enviar= driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
}





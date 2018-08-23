import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.sql.Driver
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
import org.openqa.selenium.By
import org.openqa.selenium.By.ByClassName
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//Llamar test case de Inicar sesión
def info= WebUI.callTestCase(findTestCase('Login_siapa'),[:], FailureHandling.STOP_ON_FAILURE)
WebDriver driver = DriverFactory.getWebDriver();
//driver.findElement(By.xpath("//span[@class='d-none d-md-inline pl-2']")).click()
Thread.sleep(3000);
//Dar clic en el módulo Asignación de ruta
//driver.findElement(By.linkText("Asignación de ruta")).click()
driver.findElement(By.xpath("//*[@id='sidebar']/div/div[1]/a/span")).click()
//Dar clic en editar (una ruta)
WebUI.click(findTestObject('Object Repository/Objetos AsinaciondeRuta_SIAPA/i_fa fa-edit (1)'))
//Ingresar numero de terminal y seleccionar ejecutivo
WebUI.setText(findTestObject('Object Repository/Objetos AsinaciondeRuta_SIAPA/input_numero_terminal (1)'), "Katalon")
paginas = driver.findElements(By.cssSelector("button[title='Editar']"))
////int pages= paginas.size()
//paginas.get(pages-12).click()
Thread.sleep(3000);
driver.findElement(By.xpath("class=['select2-selection__rendered']")).click();
Ejecutivos = driver.findElements(By.className("select2-results__option"))
System.out.println(Ejecutivos)
Ejecutivos.get(13).click()
//Boton Cancelar
//driver.findElement(By.className("btn-danger")).click()
//Boton asignar ruta o actualizar
driver.findElement(By.className("btn-success")).click()




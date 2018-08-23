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

//Llamar test case de Inicar sesión
def info= WebUI.callTestCase(findTestCase('login'),[:], FailureHandling.STOP_ON_FAILURE)
WebDriver driver = DriverFactory.getWebDriver();


Thread.sleep(2000);
//Seleccionar modulo usuarios
driver.findElement(By.xpath("//span[(text() = 'Usuarios' or . = 'Usuarios')]")).click()

//WebUI.click(findTestObject('Objetos Login_SIAPA /Page_SIAPA toma de lectura/span_Usuarios'))
not_run: WebUI.click(findTestObject('Objetos Login_SIAPA /Page_SIAPA toma de lectura/img_sp-sibar-img'))

//Dar clic en botón nuevo usuario
not_run: WebUI.click(findTestObject('Objetos crear usuario_SIAPA/button_ Nuevo Usuario'))

//Llenar campos de texto
not_run: WebUI.setText(findTestObject('Objetos crear usuario_SIAPA/input_sp-nombres'), "Usuario prueba Katalon")
not_run: WebUI.setText(findTestObject('Objetos crear usuario_SIAPA/input_email'),"katalon@gmail.com")
not_run: WebUI.setText(findTestObject('Objetos crear usuario_SIAPA/input_sp-password'), "12345678")
not_run: WebUI.click(findTestObject('Objetos crear usuario_SIAPA/select_Selecciona un rol'))
not_run: WebUI.selectOptionByIndex(findTestObject('Objetos crear usuario_SIAPA/select_Selecciona un rol'),12)
not_run: WebUI.setText(findTestObject('Objetos crear usuario_SIAPA/input_sp-empleado'), "8080")
not_run: WebUI.setText(findTestObject('Objetos crear usuario_SIAPA/input_n_ejecutivo'), "080")

//Dar clic boton para agregar usuario
not_run: WebUI.click(findTestObject('Objetos crear usuario_SIAPA/button_Crear usuario'))

//Dar clic para editar usuario
not_run: WebUI.clickOffset(findTestObject('Objetos EditarUsuario_SIAPA /button_btn btn-outline-primary') ,4, 3)
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-sm']")).click()

//Editar campos de texto
WebUI.setMaskedText(findTestObject('Objetos EditarUsuario_SIAPA /input_sp-nombres'), "Pedro Gonzalez")
WebUI.setMaskedText(findTestObject('Objetos EditarUsuario_SIAPA /input_email'), "gonzalez@gonzalez.com")
WebUI.setText(findTestObject('Objetos EditarUsuario_SIAPA /input_area'), "Medición y facturación")
WebUI.setText(findTestObject('Objetos EditarUsuario_SIAPA /input_departamento'),"Medición")

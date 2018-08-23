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
import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop
//Llamar testcase de login
 def info=WebUI.callTestCase(findTestCase('login'),[:], FailureHandling.STOP_ON_FAILURE)
//Seleccionar asignación
Thread.sleep(2000);
WebUI.click(findTestObject('Objetos_CargardeRutas_SIAPA/span_Asignacin de ruta'))

WebUI.click(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/button_Imprimir'))
WebUI.click(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/button_btnpicker btnpickerenab'))
WebUI.click(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/button_Jun'))
WebUI.click(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/td_Abr'))
WebUI.click(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/td_18'))
WebUI.click(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/select_Por Asignar'))
WebUI.selectOptionByIndex(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/select_Por Asignar'), 1, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/input_porcion'),"12")
WebUI.setText(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/input_centro_operativo'), "ggal13")
WebUI.click(findTestObject('Object Repository/Objetos imprimir reporte_SIAPA/button_Imprimir (1)'))

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

//LLamar tescase de login
def info= WebUI.callTestCase(findTestCase('login'),[:], FailureHandling.STOP_ON_FAILURE)
WebDriver driver = DriverFactory.getWebDriver();
Thread.sleep(2000);
//Sleccionar módulo de encuestas
WebUI.click(findTestObject('Objetos CrearEditar encuestas_SIAPA/span_Encuestas'))
//Dar clic en botón
WebUI.click(findTestObject('Objetos CrearEditar encuestas_SIAPA/button_Crear encuesta'))
//Ingresar información de la encuesta
WebUI.setText(findTestObject('Objetos CrearEditar encuestas_SIAPA/input_nombre'),"Katalon encuesta")
WebElement fecha_de_inicio = driver.findElement(By.xpath("/html/body/app-root/app-encuesta/div/div/main/div[2]/div/form/div[2]/div[1]/div/my-date-picker/div/div/div/button"));
fecha_de_inicio.click();
driver.findElement(By.xpath("(//td[@class='daycell currmonth tablesingleday'])[7]")).click();
WebElement fecha_fin =driver.findElement(By.xpath('/html/body/app-root/app-encuesta/div/div/main/div[2]/div/form/div[2]/div[2]/div/my-date-picker/div/div/div/button'));
fecha_fin.click();
driver.findElement(By.xpath("(//td[@class='daycell currmonth tablesingleday'])[7]")).click();

//Agrega pregunta
WebUI.click(findTestObject('Object Repository/Objetos CrearEditar encuestas_SIAPA/button_ Pregunta eleccin nica'))
WebUI.setText(findTestObject('Object Repository/Objetos CrearEditar encuestas_SIAPA/input_form-control ng-untouche'), "jjkkkkk")
 
Borrar_pregunta = false;
  if (Borrar_pregunta == true ) { 
	 driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
   Thread.sleep(3000);
  } 
  else if (Borrar_pregunta == false) {
  WebElement repuesta1 =driver.findElement(By.xpath("//input[@placeholder='Respuesta']")).sendKeys("aaaaa1");
   WebElement repuesta2 =driver.findElement(By.xpath("(//input[@placeholder='Respuesta'])[2]")).sendKeys("aaaaa2");
   
  Agregar_masrespuestas=true;
   if (Agregar_masrespuestas== true){
	   WebElement masrespuestas= driver.findElement(By.xpath("/html/body/app-root/app-encuesta/div/div/main/div[2]/div/form/div[4]/div[2]/div/div/div/div/div[2]/div[3]/button")).click();
	   WebElement repuesta3 = driver.findElement(By.xpath("(//input[@placeholder='Respuesta'])[3]")).sendKeys("aaaaaaaaa");
	   }else if(Agregar_masrespuestas==false){
	 
	}
	   WebElement otrapregunta= driver.findElement(By.cssSelector('button.mx-1:nth-child(1)')).click();
	   WebElement Pregunta1 =driver.findElement(By.xpath("(//input[@placeholder='Pregunta'])[2]")).sendKeys("whaaaaaaat");
	   WebElement repuesta4 =driver.findElement(By.xpath("(//input[@placeholder='Respuesta'])[4]")).sendKeys("aaa2121");
	   WebElement repuesta5 =driver.findElement(By.xpath("(//input[@placeholder='Respuesta'])[5]")).sendKeys("aaa2212");
		WebElement opcionunica= driver.findElement(By.xpath("(//input[@value='2'])[2]")).click();
	   }
  masrazones= true;
  otrapregunta= true;
	  if (otrapregunta== true) {
		  WebElement razon1 = driver.findElement(By.xpath("//input[@placeholder='Razón']")).sendKeys("ajsjsjsdkdkd");
		  WebElement razon2 = driver.findElement(By.xpath("(//input[@placeholder='Razón'])[2]")).sendKeys("ajsjsjsdkdkd");
	  
	   if( masrazones == true  ) {
		  WebUI.click(findTestObject('Object Repository/Objetos CrearEditar encuestas_SIAPA/button_ Razn'))  
	     // WebElement agregarmasrazones = driver.findElement(By.cssSelector("button[class=btn btn-outline-primary mx-1]")).click();
		 WebElement razon3 = driver.findElement(By.xpath("(//input[@placeholder='Razón'])[3]")).sendKeys("qewfgshdjdjjdjkkdkkkdd");
	  
	  }   
	  }		  
		WebElement crearencuesta = driver.findElement(By.cssSelector("button[class='btn btn-outline-success']")).click();
	



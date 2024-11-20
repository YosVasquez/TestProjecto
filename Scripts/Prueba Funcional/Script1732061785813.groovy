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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/formulario/lista.php')

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/button_img'))

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/input_Tareas_task-input'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BOSCOLISTA/select_PersonalTrabajoComprasCitasEjercicio_dcdaaf'), 
    'ejercicio', true)

WebUI.setText(findTestObject('Object Repository/Page_BOSCOLISTA/input_Tareas_task-input'), 'Hacer 20 minutos de cardio')

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/button_Aadir'))

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/div_Ejercicio        1 Tasks'))

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/div_Hacer 20 minutos de cardio      Modific_fb4a3d'))

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/button_Modificar'))

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/input_Tareas_task-input'))

WebUI.setText(findTestObject('Object Repository/Page_BOSCOLISTA/input_Tareas_task-input'), 'Hacer 30 minutos de cardio')

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/button_Aadir'))

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/button_Modificar'))

WebUI.setText(findTestObject('Object Repository/Page_BOSCOLISTA/input_Tareas_task-input'), 'Hacer 40 minutos de cardio')

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/button_Aadir'))

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/button_Eliminar'))

WebUI.click(findTestObject('Object Repository/Page_BOSCOLISTA/button_Descargar'))


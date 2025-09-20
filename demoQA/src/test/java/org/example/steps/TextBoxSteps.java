package org.example.steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.datatable.DataTable;
import org.example.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

/**
 * Step definitions para el escenario de llenado del formulario Text Box.
 * Cada método está vinculado a un paso del archivo feature.
 */
public class TextBoxSteps {
    private WebDriver driver;
    private TextBoxPage textBoxPage;
    private String outputText;

    @Dado("que estoy en la página de Text Box")
    public void abrirPaginaTextBox() {
        // Indica la ruta completa de chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        textBoxPage = new TextBoxPage(driver);
    }

    @Cuando("ingreso los datos requeridos")
    public void ingresoDatos(DataTable table) {
        // Obtiene los datos de la tabla del feature
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        Map<String, String> datos = rows.get(0);
        textBoxPage.setName(datos.get("nombre"));
        textBoxPage.setEmail(datos.get("email"));
        textBoxPage.setAddress(datos.get("dirección"));
        textBoxPage.setAddress2(datos.get("dirección2"));
    }

    @Cuando("envío el formulario")
    public void envioFormulario() {
        textBoxPage.submit();
    }

    @Entonces("veo los datos ingresados en la confirmación")
    public void verificarDatos() {
        outputText = textBoxPage.getOutputText();
        // Verifica que la salida contiene los datos ingresados
        Assert.assertTrue(outputText.contains("Juan Perez"));
        Assert.assertTrue(outputText.contains("juan@mail.com"));
        Assert.assertTrue(outputText.contains("Calle 123"));
        Assert.assertTrue(outputText.contains("Piso 2, Local B"));
        driver.quit();
    }
}

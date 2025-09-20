package org.example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Runner para ejecutar los tests de Cucumber.
 * Configura la ruta de los features y el paquete de los steps.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "org.example.steps"
)
public class RunCucumberTest {
    // Clase vacía, solo para ejecutar los tests
}

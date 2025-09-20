package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page Object para el formulario Text Box de demoqa.com
 * Encapsula la interacción con los elementos del formulario.
 */
public class TextBoxPage {
    private WebDriver driver;

    // Selectores de los campos del formulario
    private By nameInput = By.id("userName");
    private By emailInput = By.id("userEmail");
    private By addressInput = By.id("currentAddress");
    private By address2Input = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By outputBox = By.id("output");

    /**
     * Constructor que recibe el WebDriver
     */
    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Ingresa el nombre en el campo correspondiente
     */
    public void setName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    /**
     * Ingresa el email en el campo correspondiente
     */
    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    /**
     * Ingresa la dirección en el campo correspondiente
     */
    public void setAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
    }

    /**
     * Ingresa la segunda dirección en el campo correspondiente
     */
    public void setAddress2(String address2) {
        driver.findElement(address2Input).sendKeys(address2);
    }

    /**
     * Hace clic en el botón de enviar
     */
    public void submit() {
        driver.findElement(submitButton).click();
    }

    /**
     * Obtiene el texto de la caja de confirmación
     */
    public String getOutputText() {
        WebElement output = driver.findElement(outputBox);
        return output.getText();
    }
}


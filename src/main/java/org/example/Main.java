package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    public static void main(String[] args) {
        // Establece la ubicación del ejecutable del controlador de Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SSSA\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Inicializa el controlador de Chrome
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // página del formulario
        driver.get("https://tasks.evalartapp.com/automatization/");

        // Espera hasta que la página cargue completamente
        try {
            Thread.sleep(2000); // Espera 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Encuentra el campo de usuario y escribe el nombre de usuario
        WebElement usuarioField = driver.findElement(By.name("username"));
        usuarioField.sendKeys("782803");

        // Encuentra el campo de contraseña y escribe la contraseña
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("10df2f32286b7120MS00LTMwODI4Nw==30e0c83e6c29f1c3");

        // Encuentra el botón de inicio de sesión
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        try {
            Thread.sleep(3000);
            completarFormulario(driver,wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cierra el navegador al finalizar
        driver.quit();

    }

    // Método para completar el formulario
    public static void completarFormulario(WebDriver driver, WebDriverWait wait) {
        System.out.println("se ejecuta el ciclo");
    }

}
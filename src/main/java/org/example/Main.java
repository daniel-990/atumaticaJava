package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Establece la ubicación del ejecutable del controlador de Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SSSA\\Documents\\NetBeansProjects\\pruebaBancolombia\\chromedriver-win64\\chromedriver.exe");

        // Inicializa el controlador de Chrome
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // página del formulario
        driver.get("https://tasks.evalartapp.com/automatization/");

        // Espera hasta que la página cargue completamente
        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement usuarioField = driver.findElement(By.name("username"));
        usuarioField.sendKeys("782803");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("10df2f32286b7120MS00LTMwODI4Nw==30e0c83e6c29f1c3");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        try {
            Thread.sleep(1000);
            completarFormulario(driver,wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Método para completar el formulario
    public static void completarFormulario(WebDriver driver, WebDriverWait wait) {
        System.out.println("se ejecuta el ciclo");
        for (int ciclo = 1; ciclo <= 10; ciclo++) {
            System.out.println("ciclo "+ciclo);

            WebElement mensajeError = driver.findElement(By.cssSelector("p.text-2xl.text-center.text-red-500"));
            String textoMensaje = mensajeError.getText();

            if (textoMensaje.equals("Ha cometido un error, intente de nuevo")) {
                System.out.println("El mensaje de error es correcto: ");
                ciclo = 1;
            }

            if(ciclo == 1){
                completarTextarea1(driver);
                completarMatematica1(driver);
            }else if(ciclo == 2){
                completarTextarea2(driver);
                completarMatematica2(driver);
            }else if(ciclo == 3){
                completarTextarea3(driver);
                completarMatematica3(driver);
            }else if(ciclo == 4){
                completarTextarea4(driver);
                completarMatematica4(driver);
            }else if(ciclo == 5){
                completarTextarea5(driver);
                completarMatematica5(driver);
            }else if(ciclo == 6){
                completarTextarea6(driver);
                completarMatematica6(driver);
            }else if(ciclo == 7){
                completarTextarea7(driver);
                completarMatematica7(driver);
            }else if(ciclo == 8){
                completarTextarea8(driver);
                completarMatematica8(driver);
            }else if(ciclo == 9){
                completarTextarea9(driver);
                completarMatematica9(driver);
            }else if(ciclo == 10){
                completarTextarea10(driver);
                completarMatematica10(driver);
            }

            WebElement enviarBoton = driver.findElement(By.xpath("//button[@type='submit']"));
            enviarBoton.click();
        }
        // Cierra el navegador al finalizar
        driver.quit();
    }

    public static void completarTextarea1(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("t");
        }
    }

    public static void completarTextarea2(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 126; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarTextarea3(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarTextarea4(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarTextarea5(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarTextarea6(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarTextarea7(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarTextarea8(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarTextarea9(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarTextarea10(WebDriver driver){
        // Ciclo para completar el text area 226 veces
        for (int ciclo = 1; ciclo <= 226; ciclo++) {
            WebElement textField = driver.findElement(By.tagName("textarea"));
            textField.sendKeys("Q");
        }
    }
    public static void completarMatematica1(WebDriver driver){

        // Ciclo para completar operacion matematica
        int multiplicaion1 = 35*39;
        int multiplicaion2 = 23*121*230*83;
        int resta2 = 220;
        int resta = 235-265-multiplicaion1-resta2+multiplicaion2;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica2(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica3(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica4(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica5(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica6(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica7(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica8(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica9(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
    public static void completarMatematica10(WebDriver driver){

        /*
            204-90*106+21*60*168*87-248+299=?
        * */
        // Ciclo para completar operacion matematica
        int resta = 204-90*106+21*60*168*87-248+299;

        String resultado = resta+"";
        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        for (WebElement radio : radioButtons) {
            // Obtener el valor del radio button actual
            String valorRadioActual = radio.getAttribute("value");
            // Comparar el valor actual con el resultado deseado
            if (valorRadioActual.equals(resultado)) {
                radio.click();
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
    }
}
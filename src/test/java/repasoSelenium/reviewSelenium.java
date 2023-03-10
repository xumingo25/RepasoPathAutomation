package repasoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewSelenium {
    public static void main(String[] args) throws InterruptedException{
        //Configurar una propiedad para enlazar el browser al driver

        String rutaProyecto = System.getProperty("user.dir");

        String rutaDriver = "\\src\\test\\resources\\drivers\\chromedriver.exe";

        String rutaCompleta = rutaProyecto+rutaDriver;
        System.out.println(rutaCompleta);


        //Configurado el driver de google chrome
        System.setProperty("webdriver.chrome.driver",rutaProyecto+rutaDriver);

        //Instanciar un browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://open.spotify.com/?");

        Thread.sleep(5000);

        //Manipular un elemento web
        //Formas

        //#1 (Olvidenla despues)
        driver.findElement(By.xpath("//button[contains(text(),'Registrarte')]")).click();

        Thread.sleep(5000);

        //Forma #2 (tampoco hacerlo asi)
        By locatorTxtCorreo = By.id("email");

        WebElement txtCorreo = driver.findElement(locatorTxtCorreo);

        txtCorreo.click();

        txtCorreo.sendKeys("pathAutomation@gmail.com");

        driver.close();


    }
}

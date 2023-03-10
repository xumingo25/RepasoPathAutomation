package repasoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewSelenium {
    public static void main(String[] args) {
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

        try {
            Thread.sleep(5000);
        }catch(Exception e){
            System.out.println("Ocurrio un problema");
        }

        driver.close();


    }
}

package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class driver {
    //Variable
    public WebDriver driver;


    //Retornar
    public WebDriver returnDriver()
    {
        return driver;
    }

    //Activar el Navegador
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    public void setupTest() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //Linea de Url
    public void goto_url(String url_address) throws InterruptedException{
        driver.get(url_address);
        System.out.printf(" --- Maximizando Navegador -- \n");
        driver.manage().window().maximize();
      String wid=String.valueOf(driver.manage().window().getSize().width)+" xp";
      String hei=String.valueOf(driver.manage().window().getSize().height)+" xp";
      System.out.printf("Window size: width = "+wid+", height = "+hei+"\n");;
    }



    public void VerificaExitencia(WebElement ele_web) {

        try {
            if(!ele_web.isDisplayed())
            {
                System.out.printf("Existe Elemento : OK \n");
            }

        }catch (Exception e)
        {
            System.out.printf("Existe Elemento : No \n");
        }

    }
    //Espera Implícita
    public void implicitwait() {

        try{
            Thread.sleep(6000);
        }
        catch(InterruptedException ie){
        }
    }
    //Ejecucion de los Metodos
    public driver(){
        setupClass();
        setupTest();
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

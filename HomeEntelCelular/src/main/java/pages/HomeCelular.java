package pages;
import driver.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomeCelular {
     driver dv;
    public HomeCelular(driver Driver){
        this.dv=Driver;
        PageFactory.initElements(this.dv.returnDriver(),this);
    }
    //Campos
    @FindBy(xpath = "/html/body/div[6]/section[1]/div/div/div/div[2]/div/div/div/div/div[1]/form/div/div[1]/div[1]/input")
    WebElement TextSeccion;
    @FindBy(xpath = "/html/body/div[6]/section[1]/nav/div/div/div[1]/div/div/span")
    WebElement btnOferta;
    @FindBy(xpath = "/html/body/div[6]/section[1]/div/div/div/div[2]/div/div/div/div/div[1]/form/div/div[1]/button")
    WebElement btnTeLlamamos;
    @FindBy(xpath = "//*[@id=\"banner-form-catalogo\"]/div/div[5]/img")
    WebElement TextConfirmacion;


    //Acciones

    public void ingresar(String var1){
        dv.VerificaExitencia(TextSeccion);
        TextSeccion.sendKeys("");
        TextSeccion.sendKeys(var1);
        TextSeccion.click();
    }
    public void BotonEnvio(){

        btnTeLlamamos.click();
    }
    public void OfertaMigra(){

        btnOferta.click();
    }
    public void Verificar(String valor){
        if(valor.equals(TextConfirmacion.getAttribute("alt"))){
            System.out.println("Mensaje enviado \n");
        }else{
            System.out.println("El mensaje no se envio \n");

        }
    }



}


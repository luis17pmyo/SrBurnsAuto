package POM;

import driver.driver;
import pages.variables;
import pages.HomeCelular;

public class EntelPOM {

    //instanciar
    driver dv;
    HomeCelular ap2;
    variables v=new variables();
    public EntelPOM(driver Driver){
        this.dv= Driver;
        this.ap2=new HomeCelular(this.dv);

    }

    public void irApagina(String url) throws InterruptedException {
        dv.goto_url(url);
        dv.implicitwait();
    }
    public void OfertaMigra(){
        ap2.OfertaMigra();
    }
    public void Entrar(String values) throws InterruptedException{

        ap2.ingresar(values);
        Thread.sleep(2000);
        ap2.BotonEnvio();

    }

    public void Mandar()throws InterruptedException {
        System.out.printf("----- Ir a la Url ---- \n"+v.url+" \n");
        irApagina(v.url);
        System.out.printf("---- Ir Oferta exclusiva Online -- \n");
        OfertaMigra();
        System.out.printf("---- Agregar Numero ----\n");
        Entrar(v.celular);
        System.out.printf("---- Enviar solicitud ----\n");
        dv.implicitwait();
        ap2.Verificar(v.Confirmacion);
        System.out.printf("--- Fin ---");
        dv.implicitwait();

    }



}

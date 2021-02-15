package test;

import driver.driver;
import POM.EntelPOM;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoTest {
    //instanciar
    driver dv=new driver();
    EntelPOM a2p=null;

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Inicio de prueba de Migra o Renueva");
    }
    @Test(priority = 1 ,testName = "Mandar Numero")
    public void MandarCelular() throws InterruptedException{
        this.a2p=new EntelPOM(dv);
        a2p.Mandar();
    }

    @AfterClass
    public void teardown()
    {
        dv.teardown();
    }
}

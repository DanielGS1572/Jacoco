package code.coverage.demo;

import org.junit.Assert;
import org.junit.Test;
import packageTest.*;

import java.util.Arrays;

public class CodeCoverageTest {

    //JaCoCo Java Code Coverage Mechanics
    @Test
    public void test1(){
        //se puede esperar algo del codigo o no, simplemente se podría llamar
        Assert.assertEquals(Prueba1.start(),"start");
    }
    @Test
    public void test2(){
        Prueba1.stop();
    }
    @Test
    public void test3(){
        Prueba1 p = new Prueba1();     //Las pruebas toma en cuenta el constructor
    }
    @Test
    public void test4(){
        Prueba1.main(null);       //Las pruebas toma en cuenta el metodo main
    }
//http://fcqi.tij.uabc.mx/usuarios/luisgmo/data/8.2%20prb-cal-mant.pdf

    @Test
    public void test5(){
        Prueba1.branch(true);
        Prueba1.branch(false);
    }

}

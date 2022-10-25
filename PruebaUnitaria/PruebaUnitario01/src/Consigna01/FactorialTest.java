package Consigna01;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FactorialTest {
    
    Factorial factorial = null;
    public FactorialTest() {
        factorial = new Factorial();
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Iniciando la prueba ...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Prueba terminada ...");
    }

    /**
     * @see Factorial#calcular(Long)
     */
    @Test
    public void testCalcular() {
      //  fail("Unimplemented");
        System.out.println("Aprobado ...");
        assertEquals("P1 0!", (long)factorial.calcular((long)0), 1);
        assertEquals("P2 1!", (long)factorial.calcular((long)1), 1);
        assertEquals("P3 2!", (long)factorial.calcular((long)2), 2);
        assertEquals("P4 5!", (long)factorial.calcular((long)5), 120);
        assertEquals("P5 10!", (long)factorial.calcular((long)10), 3628800);
        assertEquals("P6 20!", (long)factorial.calcular((long)20),
        (long)Long.valueOf("2432902008176640000"));
        //assertEquals("P7 10!", (long)factorial.calcular((long)10ab), 0);
        //assertEquals("P8 10!", (long)factorial.calcular((long)ba10), 0);
        //assertEquals("P9 10!", (long)factorial.calcular((long)5.34), 0);
        //assertEquals("P10 10!", (long)factorial.calcular((long)" "), 0);
        //assertEquals("P11 10!", (long)factorial.calcular((long)""), 0);
        //assertEquals("P12 10!", (long)factorial.calcular(null), 0);

    }
    @Test
    public void p12() {
    assertEquals("P12 10!", (long)factorial.calcular(null), 0);
    }

    @BeforeClass
     public static void primeroClass() {
     System.out.println("Yo primero");
     }
     
     @AfterClass
     public static void ultimoClass() {
     System.out.println("Yo último");
     }
}

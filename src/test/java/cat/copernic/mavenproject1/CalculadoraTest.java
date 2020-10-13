/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.mavenproject1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author pep
 */
public class CalculadoraTest extends TestCase {
    
    public CalculadoraTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        assertEquals(5, Calculadora.suma(3, 2));
    }
    
    @Test
    public void testProducto() {
        assertEquals(14, Calculadora.producto(2, 7));
    }
    
}

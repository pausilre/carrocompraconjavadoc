/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 */
public class MicompraTest {
    
    public MicompraTest() {
    }
    
 

    /**
     * Test of getPantalones method, of class Micompra.
     */
    @Test
    public void testGetPantalones() {
        System.out.println("getPantalones");
        Micompra instance = new Micompra();
        instance.realizarCompra();
        instance.realizarCompra();
        int expResult = 2;
        int result = instance.getPantalones();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCamisas method, of class Micompra.
     */
    @Test
    public void testGetCamisas() {
        System.out.println("getCamisas");
        Micompra carrito2 = new Micompra();
        carrito2.realizarCompra();
        assertEquals(carrito2.getCamisas(), 1);
       
    }

    /**
     * Test of getSudaderas method, of class Micompra.
     */
    @Test
    public void testGetSudaderas() {
        System.out.println("getSudaderas");
        Micompra carrito3 = new Micompra();
        carrito3.realizarCompra();
        int expResult = 1;
        int result = carrito3.getSudaderas();
        assertTrue(expResult==result);
    }

    /**
     * Test of sumaCamisasyPantalones method, of class Micompra.
     */
    @Test
    public void testSumaCamisasyPantalones() {
        System.out.println("sumaCamisasyPantalones");
        int pantalones = 5;
        int camisas = 2;
        Micompra instance = new Micompra();
        int expResult = 7;
        int result = instance.sumaCamisasyPantalones(pantalones, camisas);
        assertEquals(expResult, result);
    }
    
}

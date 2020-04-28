/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pelosi.pl12;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pelosi
 */
public class ExposicaoIT {
    
    public ExposicaoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDesignacao method, of class Exposicao.
     */
    @Test
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        Exposicao instance = null;
        String expResult = "";
        String result = instance.getDesignacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesignacao method, of class Exposicao.
     */
    @Test
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String designacao = "";
        Exposicao instance = null;
        instance.setDesignacao(designacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnoRealizacao method, of class Exposicao.
     */
    @Test
    public void testGetAnoRealizacao() {
        System.out.println("getAnoRealizacao");
        Exposicao instance = null;
        int expResult = 0;
        int result = instance.getAnoRealizacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnoRealizacao method, of class Exposicao.
     */
    @Test
    public void testSetAnoRealizacao() {
        System.out.println("setAnoRealizacao");
        int anoRealizacao = 0;
        Exposicao instance = null;
        instance.setAnoRealizacao(anoRealizacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuadros method, of class Exposicao.
     */
    @Test
    public void testGetQuadros() {
        System.out.println("getQuadros");
        Exposicao instance = null;
        List<Quadro> expResult = null;
        List<Quadro> result = instance.getQuadros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuadros method, of class Exposicao.
     */
    @Test
    public void testSetQuadros() {
        System.out.println("setQuadros");
        List<Quadro> quadros = null;
        Exposicao instance = null;
        instance.setQuadros(quadros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQuadro method, of class Exposicao.
     */
    @Test
    public void testAddQuadro() {
        System.out.println("addQuadro");
        Quadro quadro = null;
        Exposicao instance = null;
        boolean expResult = false;
        boolean result = instance.addQuadro(quadro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerQuadro method, of class Exposicao.
     */
    @Test
    public void testRemoverQuadro() {
        System.out.println("removerQuadro");
        Quadro quadro = null;
        Exposicao instance = null;
        boolean expResult = false;
        boolean result = instance.removerQuadro(quadro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Exposicao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Exposicao instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Exposicao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Exposicao instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Exposicao.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Exposicao o = null;
        Exposicao instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

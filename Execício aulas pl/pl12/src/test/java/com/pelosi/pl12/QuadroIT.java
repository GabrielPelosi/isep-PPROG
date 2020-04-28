/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pelosi.pl12;

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
public class QuadroIT {
    
    public QuadroIT() {
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
     * Test of getDesignacao method, of class Quadro.
     */
    @Test
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        Quadro instance = null;
        String expResult = "";
        String result = instance.getDesignacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesignacao method, of class Quadro.
     */
    @Test
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String designacao = "";
        Quadro instance = null;
        instance.setDesignacao(designacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeAutor method, of class Quadro.
     */
    @Test
    public void testGetNomeAutor() {
        System.out.println("getNomeAutor");
        Quadro instance = null;
        String expResult = "";
        String result = instance.getNomeAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeAutor method, of class Quadro.
     */
    @Test
    public void testSetNomeAutor() {
        System.out.println("setNomeAutor");
        String nomeAutor = "";
        Quadro instance = null;
        instance.setNomeAutor(nomeAutor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnoCriacao method, of class Quadro.
     */
    @Test
    public void testGetAnoCriacao() {
        System.out.println("getAnoCriacao");
        Quadro instance = null;
        int expResult = 0;
        int result = instance.getAnoCriacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnoCriacao method, of class Quadro.
     */
    @Test
    public void testSetAnoCriacao() {
        System.out.println("setAnoCriacao");
        int anoCriacao = 0;
        Quadro instance = null;
        instance.setAnoCriacao(anoCriacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Quadro.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Quadro instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Quadro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Quadro instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Quadro.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Quadro o = null;
        Quadro instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

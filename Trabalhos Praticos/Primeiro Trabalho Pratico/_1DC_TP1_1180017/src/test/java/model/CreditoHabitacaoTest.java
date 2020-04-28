/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pelosi
 */
public class CreditoHabitacaoTest {
 
    
    public CreditoHabitacaoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSpread method, of class CreditoHabitacao.
     */
        @Test
        public void testGetSpread() {
        CreditoHabitacao credHab = new CreditoHabitacao("JoseTeste","Chefe de Pedreiro",90000,240,15f);
        System.out.println("getSpread");
        float expResult = 15.0f;
        float result = credHab.getSpread();
        assertEquals(expResult, result, 0.0);
    }


    /**
     * Test of getEuribor method, of class CreditoHabitacao.
     */
    @Test
    public void testGetEuribor() {
        CreditoHabitacao credHab = new CreditoHabitacao("JoseTeste","Chefe de Pedreiro",90000,240,15f);
        System.out.println("getEuribor");
        float expResult = 0.1f;
        float result = CreditoHabitacao.getEuribor();
        assertEquals(expResult, result, 0.0);
    }



    /**
     * Test of toString method, of class CreditoHabitacao.
     */
    @Test
    public void testToString() {
        CreditoHabitacao credHab = new CreditoHabitacao("JoseTeste","Chefe de Pedreiro",90000,240,15f);
        System.out.println("toString");
        String expResult = "CreditoHabitacao: Nome: JoseTeste, Profissão: Chefe de Pedreiro, Prazo: 240, Montante: 90000,00 spread: 15,00";
        String result = credHab.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularMontanteAReceberPorCadaCredito method, of class CreditoHabitacao.
     */
    @Test
    public void testCalcularMontanteAReceberPorCadaCredito() {
        CreditoHabitacao credHab = new CreditoHabitacao("JoseTeste","Chefe de Pedreiro",90000,240,15f);
        System.out.println(credHab.calcularMontanteAReceberPorCadaCredito());
        System.out.println(credHab.calcularMontanteTotalJuros());
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        float expResult = 226466.25F;
        float result = credHab.calcularMontanteAReceberPorCadaCredito();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularMontanteTotalJuros method, of class CreditoHabitacao.
     */
    @Test
    public void testCalcularMontanteTotalJuros() {
        CreditoHabitacao credHab = new CreditoHabitacao("JoseTeste","Chefe de Pedreiro",90000,240,15f);
        System.out.println("calcularMontanteTotalJuros");
        float expResult = 136466.25F;
        float result = credHab.calcularMontanteTotalJuros();
        assertEquals(expResult, result, 0.0);
    }
    
}

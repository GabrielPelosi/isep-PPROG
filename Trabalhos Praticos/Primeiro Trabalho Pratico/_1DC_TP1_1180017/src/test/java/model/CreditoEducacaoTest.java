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
public class CreditoEducacaoTest {
    
    public CreditoEducacaoTest() {
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
     * Test of getPeriodoCarencia method, of class CreditoEducacao.
     */
    @Test
    public void testGetPeriodoCarencia() {
        CreditoEducacao credEd1 = new CreditoEducacao("Gabriel", "Arquiteto",18000,60,24);
        System.out.println("getPeriodoCarencia");
        int expResult = 24;
        int result = credEd1.getPeriodoCarencia();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class CreditoEducacao.
     */
    @Test
    public void testToString() {
        CreditoEducacao credEd1 = new CreditoEducacao("Gabriel", "Arquiteto",18000,60,24);
        System.out.println("toString");
        String expResult = "CreditoHabitacao: Nome: Gabriel, Profissão: Arquiteto, Prazo: 60, Montante: 18000,00 Periodo de Carencia: 24";
        String result = credEd1.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularMontanteAReceberPorCadaCredito method, of class CreditoEducacao.
     */
    @Test
    public void testCalcularMontanteAReceberPorCadaCredito() {
        CreditoEducacao credEd1 = new CreditoEducacao("Gabriel", "Arquiteto",18000,60,24);
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        float expResult = 19275.0F;
        float result = credEd1.calcularMontanteAReceberPorCadaCredito();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularMontanteTotalJuros method, of class CreditoEducacao.
     */
    @Test
    public void testCalcularMontanteTotalJuros() {
        CreditoEducacao credEd1 = new CreditoEducacao("Gabriel", "Arquiteto",18000,60,24);
        System.out.println("calcularMontanteTotalJuros");
        float expResult = 1275.0F;
        float result = credEd1.calcularMontanteTotalJuros();
        assertEquals(expResult, result, 0.0);
    }
    
}

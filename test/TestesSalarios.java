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
 * @author Gustavo
 */
public class TestesSalarios {
    
    public TestesSalarios() {
    }
    
    @Test
    public void descontoProgramadorVintePorCento() {
        float salario = 4000;
        Programador p = new Programador(salario);
        
        assertEquals(20, p.calcularDesconto(), 0.001);
    }
    
    @Test
    public void descontoProgramadorDezPorCento() {
        float salario = 3000;
        Programador p = new Programador(salario);
        
        assertEquals(10, p.calcularDesconto(), 0.001);
    }
    
    @Test
    public void descontoTestadorDBAVintePorCento() {
        float salario = 3000;
        Testador t = new Testador(salario);
        Salario s = new Salario();
      //  assertEquals(25, s.desconto(t), 0.001);
    }
    
    @Test
    public void descontoTestadorDBADezPorCento() {
        float salario = 1000;
        Testador t = new Testador(salario);
        Salario s = new Salario();
    //    assertEquals(15, s.desconto(t), 0.001);
    }
}
    

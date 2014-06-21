/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class TestaCalculadora {
    
    public TestaCalculadora() {
    }
    
    @Test
    public void calculoUm(){
        Calculadora c = new Calculadora("1 + 4 + 3");
        assertEquals(8, c.resolve(), 0.001);
    }
    
    @Test
    public void calculoDois(){
        Calculadora c = new Calculadora("4 / 2 + 1 - 3");
        assertEquals(0, c.resolve(), 0.001);
    }
    
    @Test
    public void calculoTres(){
        Calculadora c = new Calculadora("1 + 2 * 3 + 4");
        assertEquals(11, c.resolve(), 0.001);
    }  
       
}

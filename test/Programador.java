/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
class Programador extends Funcionario {
  
    public Programador(float sal) {
    
        this.setSalario(sal);
        this.setSalarioMaximo(3000);
        this.setDescontoMaximo(20);
        this.setDescontoMinimo(10);
        
    }
    
}

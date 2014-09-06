/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
class Testador {
    
    private float salario;
    
    private float salarioMaximo = 2500;
    private float descontoMaximo = 25;
    private float descontoMinimo = 15;

    public Testador(float salario) {
        
        this.salario = salario;
        
    }
    
    public float calculaDescontos() {
        Salario s = new Salario(salario, salarioMaximo, descontoMaximo, descontoMinimo);
        return s.desconto();
    }
    
}

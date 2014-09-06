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

    private float salario;
    
    private float salarioMaximo = 3000;
    private float descontoMaximo = 20;
    private float descontoMinimo = 10;
    
    public Programador(float salario) {
        
        this.salario = salario;
        
    }

    public float calculaDescontos() {
        Salario s = new Salario(salario, salarioMaximo, descontoMaximo, descontoMinimo);
        return s.desconto();
    }
    
}

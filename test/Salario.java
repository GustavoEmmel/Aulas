/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
class Salario {
    
    private float salario;   
    private float salarioMaximo;
    private float descontoMaximo;
    private float descontoMinimo;

    public Salario(float salario, float salarioMaximo, float descontoMaximo, float descontoMinimo) {
        
        this.salario = salario;
        this.salarioMaximo = salarioMaximo;
        this.descontoMaximo = descontoMaximo;
        this.descontoMinimo = descontoMinimo;
        
    }

    public float desconto() {
        if(salario > salarioMaximo){
            return descontoMaximo;
        } else {
            return descontoMinimo;
        }
    }
    
}

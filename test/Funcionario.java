/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public abstract class Funcionario {
    
    private String nome;
    
    private float salario, salarioMaximo;
    private float descontoMaximo, descontoMinimo;
    
    public Funcionario(){
        
    }
    
    public float calcularDesconto(){
         if(this.salario > this.salarioMaximo){
            return this.descontoMaximo;
        } else {
            return this.descontoMinimo;
        }
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
     public void setSalarioMaximo(float salario){
        this.salarioMaximo = salario;
    }
    
    public void setDescontoMaximo(float desc){
        this.descontoMaximo = desc;
    }
    
    public void setDescontoMinimo(float desc){
        this.descontoMinimo = desc;
    }
     
}

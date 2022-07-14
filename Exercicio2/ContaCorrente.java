/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;


public class ContaCorrente {
    private int numConta;
    private String nomeCorretista;
    private float saldo;
    
    //Método constructor
    public ContaCorrente(int numConta,String nomeCorretista,float saldo){
        this.numConta = numConta;
        this.nomeCorretista = nomeCorretista;
        this.saldo = saldo;
    }
    
    //Métodos acessores
    //numConta
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    //nomeCorretista
    public String getNomeCorretista() {
        return nomeCorretista;
    }

    public void setNomeCorretista(String nomeCorretista) {
        this.nomeCorretista = nomeCorretista;
    }
    //saldo
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void alterarNome(String nome){
        this.nomeCorretista = nome;
        
    }
    
    public void depositaConta(float deposito){
        
        if(deposito >= 0){
            this.saldo = saldo+deposito;
        }else{
            System.out.println("Não é possivel depositar valores negativos");
        }
        
    }
    
    public void saqueConta(float saque){
        
           if(saque >= 0){
               if((this.saldo - saque) >= 0){
                this.saldo = saldo - saque;
               }else{
                   System.out.println("ERROR**");
                   System.out.println("Não é permitido sacar valor maior que o saldo");
                  System.out.println("Seu saldo é de: "+saldo);
                  
               }
            }else{
                System.out.println("Não é possivel sacar valores negativos");
            } 
        
            
    }
    
    public void exibirDados(){
        System.out.println("Número da conta: "+numConta);
        System.out.println("Nome do corretista: "+nomeCorretista);
        System.out.println("Saldo atual: "+saldo+" reais");
    }
    
    
}

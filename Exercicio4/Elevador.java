/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;


public class Elevador {
    private int andarAtual=0,totalAndares,capacidadeElevador,pessoasAtual;

    //Método constructor
    public int getTotalAndares(){
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    //Métodos acessores
    public void setCapacidadeElevador(int capacidadeElevador) {    
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getPessoasAtual() {
        return pessoasAtual;
    }

    public void setPessoasAtual(int pessoasAtual) {
        this.pessoasAtual = pessoasAtual;
    }
    
    
    //Métodos
    public void inicializa(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        pessoasAtual = 0;
    }
    
    public void entra(int entraPessoas){
        if((entraPessoas+pessoasAtual) <= capacidadeElevador){
            pessoasAtual += entraPessoas;
            System.out.println("O elevador possui atualmente "+pessoasAtual+" pessoas");
        }else{
            System.out.println("não é permitido entrar mais pessoas do que a capacidade máxima");
            
        }
    }
    
    public void sai(int saiPessoas){
        if((pessoasAtual - saiPessoas ) > 0 ){
            pessoasAtual -= saiPessoas;
            System.out.println("O elevador possui atualmente "+pessoasAtual+" pessoas");
        }else{
            System.out.println("Não é permitido a saída de mais pessoas do que a quantidade atual");
        }
    }
    
    public void sobe(int sobeAndar){
        if((andarAtual + sobeAndar) >= 0 && (andarAtual + sobeAndar) <= totalAndares){
            andarAtual += sobeAndar;
            System.out.println("Você está no "+andarAtual+"° andar");
        }else{
            System.out.println("Não é permitido subir para este andar");
        }
    }
    
    public void desde(int desceAndar){
        if((andarAtual - desceAndar) >= 0 && (andarAtual - desceAndar) <= totalAndares ){
            andarAtual -= desceAndar;
            System.out.println("Você está no "+andarAtual+"° andar");
        }
    }
    
    
}

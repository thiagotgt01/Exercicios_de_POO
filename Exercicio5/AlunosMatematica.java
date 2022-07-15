/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;


public class AlunosMatematica {
    private int matricula;
    private float nota1,nota2,notaTrabalho;
    private String nome;

    //Constructor
    public AlunosMatematica(int matricula, float nota1, float nota2, float notaTrabalho, String nome) {
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
        this.nome = nome;
    }
    
    public float media(){
        return ((nota1+nota2)*2.5f+notaTrabalho*2)/7;
    }
    
    public float provaFinal(){
        float media = media();
        if(media >= 7){
            System.out.println("Aluno aprovado por média");
        }else{
            System.out.println("É necessário tirar "+(7+(7-media))+ " para ser aprovado");
        }
        return 0;
    }
    
    
    
    
    
    
}

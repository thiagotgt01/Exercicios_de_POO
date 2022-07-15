/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;


public class Main {
    public static void main(String[] args){
    
        AlunosMatematica am = new AlunosMatematica(1995, 8.0f, 7.0f,4.5f, "Thiago Silva de Oliveira");
        
        System.out.println("Sua média é: "+am.media());
        am.provaFinal();
    }
}

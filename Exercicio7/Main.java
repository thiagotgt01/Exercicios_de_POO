/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;

/**
 *
 * @author thiag
 */
public class Main {
    public static void main(String[] args){
        Funcionario atendente = new Funcionario("Antonio", "Carlos Pereira", 1450d);
        Funcionario motorista = new Funcionario("Pedro", "Oliveira dos Santos", 2750d);
        
        atendente.dadosFuncionario();
        motorista.dadosFuncionario();
    }
}

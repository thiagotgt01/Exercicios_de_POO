/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(1995, "Thiago Oliveira", 10);
        Scanner leitor = new  Scanner(System.in);
        int opcao;
        char op = 'S';
        
        cc.exibirDados();
        
        while(op == 's' || op == 'S'){
        System.out.println("Qual operação deseja realizar ?");
        System.out.println("1 - DEPOSITO");
        System.out.println("2 - SAQUE");
        System.out.println("3 - DADOS DA CONTA");
        System.out.println("4 - ATUALIZAR NOME DO CORRENTISTA");
        
        opcao = leitor.nextInt();
        
        
            switch(opcao){
                case 1:
                    System.out.println(" -- DEPOSITO --");
                    System.out.print("Informe o valor do deposito: ");
                    cc.depositaConta(leitor.nextFloat());
                    System.out.println("deposito realizado, saldo atual é: "+cc.getSaldo());
                    
                    break;
                case 2:
                    System.out.println(" -- SAQUE -- ");
                    System.out.print("Informe o valor do saque: ");
                    cc.saqueConta(leitor.nextFloat());
                    
                    //System.out.println("saque realizado, saldo atual é: "+cc.getSaldo());
                    
                    break;
                case 3:
                    System.out.println(" -- DADOS DA CONTA --");
                    cc.exibirDados();
                    break;
                case 4:
                    System.out.println(" -- ATUALIZAR NOME DO CORRENTISTA --");
                    cc.alterarNome(leitor.nextLine());
                    break;
                default:
                    System.out.println("Selecione uma opção válida");
            }
            System.out.println("Deseja realizar outra operação ? (S/N)");
            op = leitor.next().charAt(0);
        }
        
    }
}

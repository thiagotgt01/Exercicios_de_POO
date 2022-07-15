/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        BombaCombustivel bc = new BombaCombustivel(5.68f, 6.88f, 7.29f, 100f); //valores baseados no cenário real
        int opcao;
        char continua= 's';
               
        System.out.println(" -- Posto Carango velho -- ");
        System.out.println("Informe o tipo de combustível");
        System.out.println("1 -- Álcool");
        System.out.println("2 -- Gasolina");
        System.out.println("3 -- Diesel");
        bc.alterarCombustivel(leitor.nextInt());
        
            while(continua == 's' || continua == 'S'){
            System.out.println("Informe a operação: ");
            System.out.println("1 - alterar a quantidade de combustivel");
            System.out.println("2 - alterar tipo de combustível");
            System.out.println("3 - alterar valor do combustível");
            System.out.println("4 - abastecer por litro");
            System.out.println("5 - abastecer por valor");

            opcao = leitor.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe a quantidade de combustível disponível na bomba");
                    bc.alterarQuantidadeCombustivel(leitor.nextFloat());
                    break;
                case 2:
                    System.out.println("Selecione um tipo de combustível");
                    System.out.println("1 - álcool");
                    System.out.println("2 - gasolina");
                    System.out.println("3 - diesel");
                    bc.alterarCombustivel(leitor.nextInt());
                    break;
                case 3:
                    System.out.println("Informe qual o valor do "+bc.getNomeCombust());
                    bc.alterarValor(leitor.nextFloat());
                    break;

                case 4:
                    System.out.println("Informe quantos litros deseja abastecer de "+bc.getNomeCombust());
                    bc.abastecerPorLitro(leitor.nextFloat());
                    break;
                case 5:
                    System.out.println("Informe o valor a ser pago pelo combustível");
                    bc.abastecerPorValor(leitor.nextFloat());
                    break;
                default:
                    System.out.println("Informe um valor válido");
            }
            System.out.println("Deseja realizar outra operação na Bomba ? (S/N)");
            continua = leitor.next().charAt(0);
        }
            System.out.println("Posto carango velho agradece ! volte sempre xD");
        
        
        
        
        
        
    }
}

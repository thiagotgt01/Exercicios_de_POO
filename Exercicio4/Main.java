/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Elevador e= new Elevador();
        int opcao;
        char continua = 's';
        
        System.out.println("Elevador System");
        System.out.println("Inicializando ...");
        System.out.print("Informe a capacidade máxima de pessoas suportadas pelo elevador: ");
        e.setCapacidadeElevador(leitor.nextInt());
        System.out.print("Informe o total de andares dentro do prédio: ");
        e.setTotalAndares(leitor.nextInt());
        while(continua == 's' || continua=='S'){
            System.out.println(" -- Operações --");
            System.out.println("1 - Entrar pessoas");
            System.out.println("2 - Sair pessoas");
            System.out.println("3 - Subir andar");
            System.out.println("4 - Descer andar");
            opcao = leitor.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Quantidade atual de pessoas no elevador : "+e.getPessoasAtual());
                    System.out.print("Quantas pessoas irão entrar no elevador ?:");
                    e.entra(leitor.nextInt());
                    break;
                case 2:
                    System.out.println("Quantidade atual de pessoas no elevador : "+e.getPessoasAtual());
                    System.out.print("Quantas pessoas irão sair no elevador ?:");
                    e.sai(leitor.nextInt());
                    break;
                case 3:

                    System.out.println("Andar atual :"+e.getAndarAtual());
                    System.out.print("Quantos andares irá subir ?");
                    e.sobe(leitor.nextInt());

                    break;
                case 4:
                    System.out.println("Andar atual :"+e.getAndarAtual());
                    System.out.print("Quantos andares irá descer ?");
                    e.desde(leitor.nextInt());
                    break;
            }
            
            System.out.println("Deseja operar o elevador novamente ? (S/N)");
            continua = leitor.next().charAt(0);
            
        }
        
    }
}

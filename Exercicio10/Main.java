/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10;

import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        Jogador j = new Jogador();
        
        int d,m,a;
        
        System.out.print("Inscrição de jogadores\n");
        System.out.print("Nome do jogador: ");
        j.setNome(s.nextLine());
        System.out.print("Posição \n 1 - Ataque\n 2 - Meio-campo\n 3 - Defesa\n 4 - Goleiro\n");
        j.setPosicao(s.nextInt());
        System.out.print("Data de nascimento\n");
        System.out.print("Dia: ");
        d = s.nextInt();
        System.out.print("Mês: ");
        m = s.nextInt();
        System.out.print("Ano: ");
        a = s.nextInt();
        j.setDataDeNascimento(d, m, a);
        System.out.print("Nacionalidade: ");
        j.setNacionalidade(s.next());
        System.out.print("Altura: ");
        j.setAltura(s.nextFloat());
        System.out.print("Peso: ");
        j.setPeso(s.nextFloat());
        
        
        j.dados();
        
        
        
        
    }
}

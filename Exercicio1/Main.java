/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;



public class Main {
    
    public static void main(String[] args) throws ParseException{
         
    Pessoa pessoa = new Pessoa();
    Scanner leitor = new Scanner(System.in);
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String receberData;
    Date dataFormatada;
    
    System.out.print("Informe o nome: ");
    pessoa.setNome(leitor.nextLine());
    System.out.print("Informe a altura: ");
    pessoa.setAltura(leitor.nextFloat());
    System.out.print("Informe a data de nascimento: ");
    receberData = leitor.next();
    dataFormatada = formato.parse(receberData);
    pessoa.setDataNascimento(dataFormatada);
    
    pessoa.dadosPessoa();
    
    
    }
}

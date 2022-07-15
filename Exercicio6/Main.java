/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6;


public class Main {
    public static void main(String[] args){
        Invoice inv = new Invoice(453, "Mesa para computador", 2, 349.99f);
        
        System.out.println("Loja de suprimentos de informática");
        System.out.println(" -- Fatura -- ");
        System.out.println("Número do Item: "+inv.getNumItemFaturado());
        System.out.println("Descrição do item: "+inv.getDescricaoItem());
        System.out.println("Quantidade de item: "+inv.getQuantItem());
        System.out.println("Preço por item: "+inv.getPrecoItem());
        System.out.println("Total da compra: "+inv.getInvoiceAmount());
        
    }
}

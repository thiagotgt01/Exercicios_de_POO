/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio9;

/**
 *
 * @author thiag
 */
public class Main {
    public static void main(String [] args){
        Data d = new Data(23, 02, 1995);
        Voo v = new  Voo(d, 132);
        
       v.setVagas(0);
        
        System.out.println(v.proximoLivre());
        System.out.println(v.proximoLivre());
        int i =0,soma=0;
        
        while( i < 5){
            soma += i;
            i++;
            
        }
        System.out.println(soma);
        
    }
}

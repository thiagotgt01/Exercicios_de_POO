/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio8;

/**
 *
 * @author thiag
 */
public class Main {
    public static void main(String [] args){
        Data data = new  Data(23, 02, 1995);
        
        
        System.out.println(data.compara(data.Clone()));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private float altura;
    
    //Método constructor
    public Pessoa(){
        
    }
    
    //Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public int calculaIdade(Date dataNascimento){
        Calendar dataDeNascimento = new GregorianCalendar();
        dataDeNascimento.setTime(dataNascimento);
        
        Calendar today = Calendar.getInstance();
        
        int idade =today.get(Calendar.YEAR) - dataDeNascimento.get(Calendar.YEAR);
        
        dataDeNascimento.add(Calendar.YEAR, idade);
        
        if(today.before(dataDeNascimento)){
            idade--;
        }
        return idade;
    }
    
    public void dadosPessoa(){
        System.out.println("Nome: "+nome);
        System.out.println("Data de nascimento: "+dataNascimento);
        System.out.println("Altura: "+altura);
        System.out.println("Tem "+calculaIdade(dataNascimento)+" anos de idade");
        
    }
    
    
    
}

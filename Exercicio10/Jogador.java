/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10;

import java.util.Calendar;
import java.util.Date;

public class Jogador {
    
    private String nome;
    private int posicao;
    private Data dataDeNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;
    private Calendar calendar = Calendar.getInstance();
    
    

    //Constructor
    
    
    
    //Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        switch(posicao){
            case 1:
                //Ataque
                this.posicao = posicao;
                break;
            case 2:
                this.posicao = posicao;
                //Meio-campo
                break;
            case 3:
                this.posicao = posicao;
                //Defesa
                break;
            case 4:
                this.posicao = posicao;
                //Goleiro
                break;
            default:
                System.out.println("Valor inválido");
             
        }
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int d, int m, int a) {
        
        this.dataDeNascimento = new Data(d, m, a);
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    //Métodos
    
    public void dados(){
        System.out.println("   ----- DADOS DO JOGADOR -----");
        System.out.println("Nome :"+this.nome);
        System.out.println("Posição: "+posicaoNome());
        System.out.println("Data de nascimento: "+dataDeNascimento.getDia()+"/"+dataDeNascimento.getMes()+"/"+dataDeNascimento.getAno());
        System.out.println("Nacionalidade :"+getNacionalidade());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        System.out.println("Idade: "+idade()+" anos");
        System.out.println("Irá se aposentar em "+(calendar.get(Calendar.YEAR)+aposentar())+" restam "+aposentar()+" anos");
    }
    
    
    public int idade(){
        return   calendar.get(Calendar.YEAR)-dataDeNascimento.getAno();
    }
    
    public int aposentar(){
        switch (posicao) {
            case 1:
                //Ataque
                return 35 - idade();
                
            case 2:
                return 38 - idade();
                //Meio-campo
                
            case 3:
                return 40 - idade();
                //Defesa
                
            case 4:
                return 40 - idade();
                //Goleiro
                
        }
        return 0;
    }
    
    private String posicaoNome(){
        switch(this.posicao){
            case 1:
                //Ataque
                return "Ataque";
            case 2:
                return "Meio-campo";
                //Meio-campo
                
            case 3:
                return "Defesa";
                //Defesa
                
            case 4:
                return "Goleiro";
                //Goleiro
                
        }
            return "";

    }
}

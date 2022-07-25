/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio9;


public class Voo {

    private int vagasLivres,numVoo;
    private boolean [] vagas;
    Data data = new Data(2, 2, 1995);
    
    
    //Constructor

    public Voo(Data data, int numVoo) {
        this.vagas = new boolean [100];
        this.vagasLivres = 100;
        this.data = data;
        this.numVoo = numVoo;
        
        
    }
    
    //acessores

    public boolean[] getVagas() {
        return vagas;
    }

    public void setVagas(int vaga) {
        this.vagas[vaga] = true;
    }
    
    
    //Metodos
    public int proximoLivre(){
        if(this.vagasLivres == 0){
            return 0;
        }else{
            for(int i=0;i<100;i++){
                if(this.vagas[i] == false){
                    return i+1;
                }
            }
        }
        return 0;
    }
    
    public boolean verifica(int vaga){
        if(vaga >= 1 && vaga <= 100){
            if(this.vagas[vaga -1] == false){
                //cadeira vazia
                return false;
            }
        }
        //cadeira ocupada
        return true;
    }
    
    public boolean ocupa(int vaga){
        if(this.vagasLivres == 0){
            System.out.println("Avião sem vagas disponíveis! ");
            return false;
            
        }
        
        if(verifica(vaga) == false){
            this.vagas[vaga - 1] = true;
            this.vagasLivres--;
            System.out.println("Assento populado! posição: "+(vaga -1)+"/100");
            return true;
            
        }
        
        
        
        
        return false;
    }
    
    public int getVoo(){
        return this.numVoo;
    }
    
    
    
}

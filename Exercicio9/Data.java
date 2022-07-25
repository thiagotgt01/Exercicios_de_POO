package Exercicio9;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiag
 */
public class Data {
    private int dia,mes,ano;

    //Contructor
    public Data(int dia, int mes, int ano) {
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        if( 
           this.dia < 1 || this.dia > getDiasNoMes() ||
           this.mes < 1 || this.mes > 12 ||
           this.ano < 1
           ){
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
        
    }

    //Acessores
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //Métodos
    
    private boolean isBissexto(){
        return (this.ano % 4 == 0) && (this.ano % 100 != 0);
    }
    
    private int getDiasNoMes(){
        if(this.mes < 8){
            if(this.mes == 2){
                if(isBissexto()){
                    return 29;
                }else{
                    return 28;
                }
            }else if(this.mes %2 == 0){
                return 30;
            }else{
                return 31;
            }
        }else if(this.mes < 13){
            if(this.mes %2 ==0){
                return 31;
                
            }else{
                return 30;
            }
        }
            
        return 0;
    }
    
    public String getMesExtenso(){
        String [] mesExtenso = {
            "Janeiro",
            "Fevereiro",
            "Março",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro"
                
        };
          return mesExtenso[this.mes - 1]      ;
    }
    
    //
    public int compara(Data data){
        //data = outro objeto da classe data
        if(this.ano > data.ano){
            return 1;
        }else if(this.ano == data.ano){
            if(this.mes > data.mes){
                return 1;
            }else if(this.mes == data.mes){
                if(this.dia > data.dia){
                    return 1;
                }else if(this.dia == data.dia){
                    return 0;
                }
            }
        }
        
        
        return -1;
    }
    
    public Data Clone(){
        Data dataClone = new Data(this.dia,this.mes,this.ano);
        return dataClone;
    }
    
}

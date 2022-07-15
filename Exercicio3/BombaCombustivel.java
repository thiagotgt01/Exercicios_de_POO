/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;


public class BombaCombustivel {
    
    
    private int tipoDeCombustivel;
    private float valorPorLitro;
    private float quantidadeDeCombustivel;
    private float alcool,gasolina,diesel;
    private String nomeCombust;
    
    

    //Método constructor
    
    public BombaCombustivel(float alcool, float gasolina, float diesel,float quantCombustivel) {
        this.alcool = alcool;
        this.quantidadeDeCombustivel = quantCombustivel;
        this.gasolina = gasolina;
        this.diesel = diesel;
    }

    //Métodos acessores
    public String getNomeCombust(){
        return nomeCombust;
    }
    
    public float getAlcool() {
        return alcool;
    }

    public void setAlcool(float alcool) {
        this.alcool = alcool;
    }

    public float getGasolina() {
        return gasolina;
    }

    public void setGasolina(float gasolina) {
        this.gasolina = gasolina;
    }

    public float getDiesel() {
        return diesel;
    }

    public void setDiesel(float diesel) {    
        this.diesel = diesel;
    }
    
    public int getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(int tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public float getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(float quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }
    
    
    //Métodos
    public void abastecerPorValor(float abastecerValor){
        switch(tipoDeCombustivel){
            case 1:
                if(abastecerValor > 0){
                    System.out.println("Foi pago "+abastecerValor+" reais");
                    System.out.println("Foi abastecido: "+(abastecerValor/alcool)+" litros de álcool");
                }else{
                    System.out.println("Error");
                    System.out.println("Não é permitido inserir valor menor que zero");
                }
                break;
            case 2:
                if(abastecerValor > 0){
                    System.out.println("Foi pago "+abastecerValor+" reais");
                    System.out.println("Foi abastecido: "+(abastecerValor/gasolina)+" litros de gasolina");
                }else{
                    System.out.println("Error");
                    System.out.println("Não é permitido inserir valor menor que zero");
                }
                break;
            case 3:
                if(abastecerValor > 0){
                    System.out.println("Foi pago "+abastecerValor+" reais");
                    System.out.println("Foi abastecido: "+(abastecerValor/diesel)+" litros de diesel");
                }else{
                    System.out.println("Error");
                    System.out.println("Não é permitido inserir valor menor que zero");
                }
                break;
            
        }
    }
        
    public void abastecerPorLitro(float abastecerLitro){
        switch(tipoDeCombustivel){
            case 1:
                if(abastecerLitro > 0){
                    System.out.println("Foi abastecido "+abastecerLitro+" de álcool");
                    System.out.println("Total a ser pago: "+(abastecerLitro*alcool)+" reais");
                }else{
                    System.out.println("Error");
                    System.out.println("Não é permitido inserir valor menor que zero");
                }
                break;
            case 2:
                if(abastecerLitro > 0){
                    System.out.println("Foi abastecido "+abastecerLitro+" de gasolina");
                    System.out.println("Total a ser pago: "+(abastecerLitro*gasolina)+" reais");
                }else{
                    System.out.println("Error");
                    System.out.println("Não é permitido inserir valor menor que zero");
                }
                break;
            case 3:
                if(abastecerLitro > 0){
                    System.out.println("Foi abastecido "+abastecerLitro+" de diesel");
                    System.out.println("Total a ser pago: "+(abastecerLitro*diesel)+" reais");
                }else{
                    System.out.println("Error");
                    System.out.println("Não é permitido inserir valor menor que zero");
                }
                break;
            
        }
    }
    
    public void alterarValor (float valor){
        switch(tipoDeCombustivel){
            case 1:
                
                this.alcool = valor;
                break;
            case 2:
                
                this.gasolina = valor;
                break;
            case 3:
                
                this.diesel = valor;
                break;
            
        }
    }
    
    public void alterarCombustivel(int tipoCombustivel){
        
        switch(tipoCombustivel){
            case 1:
                System.out.println(" -- Álcool selecionado ! -- \n");
                this.tipoDeCombustivel = tipoCombustivel;
                nomeCombust= "álcool";
                break;
            case 2:
                System.out.println(" -- Gasolina selecionada ! -- \n");
                this.tipoDeCombustivel = tipoCombustivel;
                nomeCombust= "gasolina";
                break;
            case 3:
                System.out.println(" -- Diesel selecionado ! -- \n");
                this.tipoDeCombustivel = tipoCombustivel;
                nomeCombust= "diesel";
                break;
            default:
                System.out.println(" -- Valor inválido -- \n");
        }
    }
    
    public void alterarQuantidadeCombustivel(float quantCombustivel){
        if(quantCombustivel > 0){
            this.quantidadeDeCombustivel = quantCombustivel;
        }else{
            System.out.println("Error");
            System.out.println("Não é permitido inserir valor menor que zero");
        }
            
    }
    
    
    
    

    

    
    
}

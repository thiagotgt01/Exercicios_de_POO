/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6;

/**
 *
 * @author thiag
 */
public class Invoice {
    private int numItemFaturado;
    private String descricaoItem;
    private int quantItem;
    private float precoItem;

    public Invoice(int numItemFaturado, String descricaoItem, int quantItem, float precoItem) {
        this.numItemFaturado = numItemFaturado;
        this.descricaoItem = descricaoItem;
        if(quantItem < 0){
            this.quantItem = 0;
        }else{
            this.quantItem = quantItem;
        }
        if(precoItem < 0){
            this.precoItem = 0;
        }else{
            this.precoItem = precoItem;
        }
 
    }

    public int getNumItemFaturado() {
        return numItemFaturado;
    }

    public void setNumItemFaturado(int numItemFaturado) {
        this.numItemFaturado = numItemFaturado;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantItem() {
        return quantItem;
    }

    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }
    
    public double getInvoiceAmount(){
        
        return precoItem*quantItem;
    }
    
    
    
    
}

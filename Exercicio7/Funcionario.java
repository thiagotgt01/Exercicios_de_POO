/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;


public class Funcionario {
    private String nome,sobreNome;
    private double salarioMensal;

    public Funcionario(String nome, String sobreNome, double salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        if(salarioMensal < 0){
            this.salarioMensal = 0;
        }else{
            this.salarioMensal = salarioMensal;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public double salarioAnual(){
        return salarioMensal*12;
    }
    public double aumentoSalario(){
        return salarioMensal+(salarioMensal*0.1d);
    }
    
    public void dadosFuncionario(){
        System.out.println(" -- Dados --");
        System.out.println("Nome: "+nome);
        System.out.println("Sobrenome: "+sobreNome);
        System.out.println("Salario mensal: "+salarioMensal);
        System.out.println("Salario anual: "+salarioAnual());
        System.out.println("aumento de 10% no salario. Salario atual: "+aumentoSalario());
        this.salarioMensal = aumentoSalario();
        System.out.println("Novo salario anual: "+salarioAnual());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo;

import java.util.Scanner;

/**
 *
 * @author samara
 */
public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;
    private Dependentes []dependentes;
    private Endereco []endereco;

    public Funcionario(int matricula, double salario, Dependentes[] dependentes, String nome, int cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
        this.dependentes = dependentes;
    }
    
    public void adicionaEndereco(){
        String tipo;
        int cep;
        double dist;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a qtde de endereços");
        int qtde = s.nextInt();
        this.endereco = new Endereco[qtde];
        for (int i = 0; i < this.endereco.length; i++) {
            System.out.println("Qual o tipo de endereço (" + i + ")");
            tipo = s.next();
            System.out.println("Digite o cep");
            cep = s.nextInt();
            System.out.println("Digite a distância");
            dist = s.nextDouble();
            this.endereco[i] = new Endereco(tipo, cep, dist);
        }        
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public Dependentes[] getDependentes() {
        return dependentes;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDependentes(Dependentes[] dependentes) {
        this.dependentes = dependentes;
    }
    
    public double calculaBonus(){
        if(this.dependentes.length < 2) {
            return salario + (salario* 0.2);
        }else{
            return salario + (salario* 0.4);
        }
    }

    public Endereco[] getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco[] endereco) {
        this.endereco = endereco;
    }





}

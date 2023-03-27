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
public class Principal {

    public static void main(String args[]) {
        String nome, grauParentesco;
        int cpf;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a quantidade de dependentes: ");
        int qt = s.nextInt();
        Dependentes[] dependentes = new Dependentes[qt];
        for (int i = 0; i < dependentes.length; i++) {
            System.out.println("Qual o nome do dependente (" + i + ")");
            nome = s.next();
            System.out.println("Digite o cpf");
            cpf = s.nextInt();
            System.out.println("Digite o grau de parentesco");
            grauParentesco = s.next();
            dependentes[i] = new Dependentes(grauParentesco, nome, cpf);
        }
        System.out.println("Digite a matricula do funcionário");
        int matricula = s.nextInt();
        System.out.println("Digite o salário");
        double salario = s.nextDouble();
        System.out.println("Qual o nome do funcionário");
        nome = s.next();
        System.out.println("Digite o cpf");
        cpf = s.nextInt();
        Funcionario func = new Funcionario(matricula, salario, dependentes, nome, cpf);
        func.adicionaEndereco();
        double retorno = func.calculaBonus();
        Endereco []teste = func.getEndereco();
        boolean r;
        for(int i=0;i<teste.length;i++){
           r = teste[i].retornarValeTransporte();
           if (r == true) System.out.println("Vc tem vale zé");
           else System.out.println("No way");
        }
        System.out.println("Retorno");
        System.out.println(retorno);
    }

}

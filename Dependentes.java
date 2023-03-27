/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo;

/**
 *
 * @author samara
 */
public class Dependentes extends Pessoa {
    private String parentesco;

    public Dependentes(String parentesco, String nome, int cpf) {
        super(nome, cpf);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    
    public void verificarGrau(String parentesco){
        if(parentesco == "pai" || parentesco == "mae" || parentesco == "irmao")
            System.out.println("Parentesco de de primeiro grau");
        else{
            System.out.println("segundo grau de parentesco ");
        }
    }
    
}

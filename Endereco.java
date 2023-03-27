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
public class Endereco {
    private String tipo;
    private int cep;
    private double dist;

    public Endereco(String tipo, int cep, double dist) {
        this.tipo = tipo;
        this.cep = cep;
        this.dist = dist;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }
    
    public boolean retornarValeTransporte(){
        if (this.dist>25000) return true;
        else return false;
    }
    
}

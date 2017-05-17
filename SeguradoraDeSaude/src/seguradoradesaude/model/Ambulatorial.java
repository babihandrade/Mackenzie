/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.model;

/**
 *
 * @author 31687059
 */
public class Ambulatorial extends Procedimento{
    
    private int qtdTecnicos;

    public Ambulatorial(String nome, PlanoDeSaude plano, int qtd) {
        super(nome, plano);
        this.qtdTecnicos = qtd;
    }
    

    public int getQtdTecnicos() {
        return qtdTecnicos;
    }

    public void setQtdTecnicos(int qtdTecnicos) {
        this.qtdTecnicos = qtdTecnicos;
    }

    @Override
    public String toString() {
        return "Ambulatorial{" + "qtdTecnicos=" + qtdTecnicos + '}';
    } 
    
}

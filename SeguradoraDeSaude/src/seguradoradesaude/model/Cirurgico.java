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
public class Cirurgico extends Procedimento{
    
    private int qtdMedico;

    public Cirurgico(String nome, PlanoDeSaude plano, int qtd) {
        super(nome, plano);
        this.qtdMedico = qtd;
    }

    public int getQtdMedico() {
        return qtdMedico;
    }

    public void setQtdMedico(int qtdMedico) {
        this.qtdMedico = qtdMedico;
    }

    @Override
    public String toString() {
        return "Cirurgico{" + "qtdMedico=" + qtdMedico + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import java.util.ArrayList;
import seguradoradesaude.model.Operadora;
import seguradoradesaude.model.PlanoDeSaude;
import seguradoradesaude.model.Procedimento;
import seguradoradesaude.model.Segurado;

/**
 *
 * @author Bárbara
 */
public class ControllerPlanoDeSaude {

    private PlanoDeSaude plano;

    public PlanoDeSaude getPlano() {
        return plano;
    }

    public ControllerPlanoDeSaude(String nome, Operadora operadora) {
        this.plano = new PlanoDeSaude(nome, operadora);
    }

    public void adicionaSegurado(Segurado segurado) {
        ArrayList<Segurado> temp = new ArrayList();
        temp = this.plano.getListaDeSegurados();
        temp.add(segurado);
        this.plano.setListaDeSegurados(temp);
    }

    public void removeSegurado(Segurado segurado) {
        ArrayList<Segurado> temp = new ArrayList();
        temp = this.plano.getListaDeSegurados();
        if (temp.contains(segurado)) {
            temp.remove(segurado);
        } else {
            System.out.println("O segurado não está na lista");
        }
        this.plano.setListaDeSegurados(temp);
    }

    public void adicionaProcedimento(Procedimento procedimento) {
        ArrayList<Procedimento> temp = new ArrayList();
        temp = this.plano.getProcedimentos();
        temp.add(procedimento);
        this.plano.setProcedimentos(temp);
    }

    public void removeProcedimento(Procedimento procedimento) {
        ArrayList<Procedimento> temp = new ArrayList ();
        temp = this.plano.getProcedimentos();
        if (temp.contains(procedimento)) {
            temp.remove(procedimento);
        } else {
            System.out.println("O procedimento não está na lista");
        }
        this.plano.setProcedimentos(temp);
    }

    public void alteraNome(String nome) {
        this.plano.setNome(nome);
    }

    public void alteraOperadora(Operadora operadora) {
        this.plano.setOperadora(operadora);
    }
    
    public void exibePlano(){
        System.out.println(this.plano.toString());}

}

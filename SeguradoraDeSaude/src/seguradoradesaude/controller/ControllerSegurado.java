/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import java.util.ArrayList;
import seguradoradesaude.model.Autorizacao;
import seguradoradesaude.model.PlanoDeSaude;
import seguradoradesaude.model.Segurado;

/**
 *
 * @author 31687059
 */
public class ControllerSegurado {
    
    private Segurado segurado;

    public Segurado getSegurado() {
        return segurado;
    }
    
    public ControllerSegurado(String nome, long cpf, PlanoDeSaude plano, ControllerPlanoDeSaude cp) {
        this.segurado = new Segurado(nome, cpf, plano);
        cp.adicionaSegurado(this.segurado);

    }

    public void adicionarPlano(PlanoDeSaude plano,ControllerPlanoDeSaude cp) {
        ArrayList<PlanoDeSaude> temp = new ArrayList();
        temp = this.segurado.getListaDePlanos();
        temp.add(plano);
        this.segurado.setListaDePlanos(temp);
        cp.adicionaSegurado(this.segurado);
    }

    public void removePlano(PlanoDeSaude plano) {
        ArrayList<PlanoDeSaude> temp = new ArrayList();
        temp = this.segurado.getListaDePlanos();
        if (temp.contains(plano)) {
            temp.remove(plano);
        } else {
            System.out.println("O plano de saúde não está na lista");
        }
        this.segurado.setListaDePlanos(temp);
    }

    public void adicionarAutorizacao(Autorizacao autorizacao) {
        ArrayList<Autorizacao> temp = new ArrayList();
        temp = this.segurado.getAutorizacoes();
        temp.add(autorizacao);
        this.segurado.setAutorizacoes(temp);
    }

    public void removeAutorizacao(Autorizacao autorizacao) {
        ArrayList<Autorizacao> temp = new ArrayList();
        temp = this.segurado.getAutorizacoes();
        if (temp.contains(autorizacao)) {
            temp.remove(autorizacao);
        } else {
            System.out.println("A autorizacao não está na lista");
        }
        this.segurado.setAutorizacoes(temp);
    }

    public void exibirSegurado() {
        System.out.println(this.segurado.toString());
    }

}

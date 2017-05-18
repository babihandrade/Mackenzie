/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import seguradoradesaude.model.Ambulatorial;
import seguradoradesaude.model.PlanoDeSaude;

/**
 *
 * @author Bárbara
 */
public class ControllerAmbulatorial {
    private Ambulatorial ambulatorio;

    public Ambulatorial getAmbulatorio() {
        return ambulatorio;
    }

    public ControllerAmbulatorial(String nome, PlanoDeSaude plano, int qtd) {
        this.ambulatorio = new Ambulatorial(nome, plano, qtd);
    }

    public void alteraQtdTecnicos(int qtd) {
        this.ambulatorio.setQtdTecnicos(qtd);
    }

    public void exibeAmbulatorio() {
        System.out.println(this.ambulatorio.toString());
    }
}

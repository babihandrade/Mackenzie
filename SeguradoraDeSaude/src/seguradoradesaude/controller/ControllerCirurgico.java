/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import seguradoradesaude.model.Cirurgico;
import seguradoradesaude.model.PlanoDeSaude;

/**
 *
 * @author Bárbara
 */
public class ControllerCirurgico {

    private Cirurgico cirurgico;

    public Cirurgico getCirurgico() {
        return cirurgico;
    }

    public ControllerCirurgico(String nome, PlanoDeSaude plano, int qtd) {
        this.cirurgico = new Cirurgico(nome, plano, qtd);

    }

    public void alteraQtdMedicos(int qtd) {
        this.cirurgico.setQtdMedico(qtd);
    }

    public void exibeCentroCirurgico() {
        System.out.println(this.cirurgico.toString());
    }
}

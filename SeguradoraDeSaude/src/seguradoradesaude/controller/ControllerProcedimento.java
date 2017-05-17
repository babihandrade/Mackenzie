/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import java.util.ArrayList;
import seguradoradesaude.model.PlanoDeSaude;
import seguradoradesaude.model.Procedimento;

/**
 *
 * @author Bárbara
 */
public class ControllerProcedimento {

    private Procedimento procedimento;

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public ControllerProcedimento(String nome, PlanoDeSaude plano) {
        this.procedimento = new Procedimento(nome, plano);
    }

    public void adicionarPlano(PlanoDeSaude plano) {
        ArrayList<PlanoDeSaude> temp = new ArrayList();
        temp = this.procedimento.getPlanos();
        temp.add(plano);
        this.procedimento.setPlanos(temp);
    }

    public void removePlano(PlanoDeSaude plano) {
        ArrayList<PlanoDeSaude> temp = new ArrayList();
        temp = this.procedimento.getPlanos();
        if (temp.contains(plano)) {
            temp.remove(plano);
        } else {
            System.out.println("O plano de saúde não está na lista");
        }
        this.procedimento.setPlanos(temp);
    }

    public void alteraNome(String nome) {
        this.procedimento.setNome(nome);
    }

    public void exibeProcedimento() {
        System.out.println(this.procedimento.toString());
    }
}

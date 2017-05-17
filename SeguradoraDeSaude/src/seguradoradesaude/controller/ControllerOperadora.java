/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import java.util.ArrayList;
import seguradoradesaude.model.Operadora;
import seguradoradesaude.model.PlanoDeSaude;

/**
 *
 * @author 31687059
 */
public class ControllerOperadora {

    private Operadora operadora;

    public Operadora getOperadora() {
        return operadora;
    }

    public ControllerOperadora(String nome) {
        this.operadora = new Operadora(nome); 
    }

    public void adicionarPlanos(PlanoDeSaude plano) {
        ArrayList<PlanoDeSaude>  temp = new ArrayList();
        temp = this.operadora.getPlanos();
        temp.add(plano);
        this.operadora.setPlanos(temp);
    }

    public void removePlanos(PlanoDeSaude plano) {
        ArrayList<PlanoDeSaude> temp = new ArrayList();
        temp = this.operadora.getPlanos();
        if (temp.contains(plano)) {
            temp.remove(plano);
        } else {
            System.out.println("O plano de saúde não está na lista");
        }
        this.operadora.setPlanos(temp);
    }

    public void alteraNome(String nome) {
        this.operadora.setNome(nome);
    }
    
    public void exibeOperadora(){
        System.out.println(this.operadora.toString());
    }
}

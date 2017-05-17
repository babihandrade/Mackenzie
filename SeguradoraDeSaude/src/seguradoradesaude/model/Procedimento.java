/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.model;

import java.util.ArrayList;

/**
 *
 * @author Bárbara
 */
public class Procedimento {

    private String nome;
    private ArrayList<PlanoDeSaude> planos = new ArrayList();

    public Procedimento(String nome, PlanoDeSaude plano) {
        this.nome = nome;
        this.planos.add(plano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<PlanoDeSaude> getPlanos() {
        return planos;
    }

    public void setPlanos(ArrayList<PlanoDeSaude> planos) {
        this.planos = planos;
    }

    public void adicionaPlanos(PlanoDeSaude plano) {
        this.planos.add(plano);
    }

    @Override
    public String toString() {
        String tmp = "Planos:\n";
        tmp = planos.stream().map((temp) -> temp.toString()+"\n").reduce(tmp, String::concat);
        return "Procedimento{" + "\nNome= " + nome + tmp+ '}';
    }

}

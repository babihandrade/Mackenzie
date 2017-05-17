/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.model;

import java.util.ArrayList;

/**
 *
 * @author 31687059
 */
public class PlanoDeSaude {

    private String nome;
    private ArrayList<Procedimento> procedimentos;
    private ArrayList<Segurado> listaDeSegurados;
    private Operadora operadora;

    public PlanoDeSaude(String nome, Operadora operadora) {
        this.nome = nome;
        this.operadora = operadora;

    }

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(ArrayList<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public ArrayList<Segurado> getListaDeSegurados() {
        return listaDeSegurados;
    }

    public void setListaDeSegurados(ArrayList<Segurado> ListaDeSegurados) {
        this.listaDeSegurados = ListaDeSegurados;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String tmpSegurados = "Segurados:\n";
        String tmpProcedimentos = "Procedimentos:\n";
        tmpSegurados = listaDeSegurados.stream().map((temp) -> temp + "\n").reduce(tmpSegurados, String::concat);
        tmpProcedimentos = procedimentos.stream().map((temp) -> temp + "\n").reduce(tmpProcedimentos, String::concat);
        return "PlanoDeSaude{" + "\nnome=" + nome + "\n"+tmpProcedimentos+"\n"+tmpSegurados+ "\nOperadora=" + operadora + '}';
    }

}

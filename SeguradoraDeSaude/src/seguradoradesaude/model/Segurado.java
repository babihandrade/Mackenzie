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
public class Segurado {

    private String nome;
    private long cpf;
    private ArrayList<PlanoDeSaude> listaDePlanos = new ArrayList();
    private ArrayList<Autorizacao> autorizacoes = new ArrayList();

    public Segurado(String nome, long cpf, PlanoDeSaude plano) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaDePlanos.add(plano);
    }

    public Segurado(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public ArrayList<Autorizacao> getAutorizacoes() {
        return autorizacoes;
    }

    public void setAutorizacoes(ArrayList<Autorizacao> autorizacoes) {
        this.autorizacoes = autorizacoes;
    }

    public ArrayList<PlanoDeSaude> getListaDePlanos() {
        return listaDePlanos;
    }

    public void setListaDePlanos(ArrayList<PlanoDeSaude> listaDePlanos) {
        this.listaDePlanos = listaDePlanos;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        String tmpPlanos = "Planos:\n";
        String tmpAutorizacoes = "Autorizações:\n";
        tmpPlanos = listaDePlanos.stream().map((temp) -> temp.toString()+"\n").reduce(tmpPlanos, String::concat);
 
        tmpAutorizacoes = autorizacoes.stream().map((temp) -> temp.toString()+"\n").reduce(tmpAutorizacoes, String::concat);
 
        return "Segurado{" + "\nNome= " + nome + "\nCPF= " + cpf +"\n"+ tmpPlanos + "\n" + tmpAutorizacoes + '}';
    }
 
}

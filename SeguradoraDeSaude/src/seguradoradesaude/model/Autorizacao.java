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
public class Autorizacao {

    private String dataDaAvaliacao;
    private Segurado segurado;
    private Estado estado = Estado.Pendente;
    private Local local;
    private ArrayList<ItemDeProcedimentos> itensProcedimento = new ArrayList();

    public Autorizacao(String dataDaAvaliacao, Segurado segurado, Local local, ItemDeProcedimentos itemProcedimento) {
        this.dataDaAvaliacao = dataDaAvaliacao;
        this.segurado = segurado;
        this.local = local;
        this.itensProcedimento.add(itemProcedimento);
    }

    public String getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(String dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public ArrayList<ItemDeProcedimentos> getItensProcedimento() {
        return itensProcedimento;
    }

    public void setItensProcedimento(ArrayList<ItemDeProcedimentos> itensProcedimento) {
        this.itensProcedimento = itensProcedimento;
    }

    public void autorizar() {
        this.estado = Estado.Autorizado;
    }

    public void negar() {
        this.estado = Estado.Negado;
    }

    public void pendente() {
        this.estado = estado.Pendente;
    }

    @Override
    public String toString() {
        String tmp  = "Procedimentos: ";
        tmp = itensProcedimento.stream().map((temp) -> "\n" + temp.getProcedimento().getNome()).reduce(tmp, String::concat);
        return "Autorizacao{" + "dataDaAvaliacao=" + dataDaAvaliacao +
                "\nSegurado=" + segurado + "\nEstado=" + estado + "\nLocal=" + local +"\n"+ tmp+"}";

    }

}

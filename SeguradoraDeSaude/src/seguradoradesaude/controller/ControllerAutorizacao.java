/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import java.util.ArrayList;
import seguradoradesaude.model.Autorizacao;
import seguradoradesaude.model.ItemDeProcedimentos;
import seguradoradesaude.model.Local;
import seguradoradesaude.model.Segurado;

/**
 *
 * @author Bárbara
 */
public class ControllerAutorizacao {

    private Autorizacao autorizacao;

    public Autorizacao getAutorizacao() {
        return autorizacao;
    }

    public ControllerAutorizacao(String data, Local local, Segurado segurado, ItemDeProcedimentos item) {
        this.autorizacao = new Autorizacao(data, segurado, local, item);

    }

    public void alteraData(String data) {
        this.autorizacao.setDataDaAvaliacao(data);
    }

    public void alteraSegurado(Segurado segurado) {
        this.autorizacao.setSegurado(segurado);
    }

    public void adicionaItemProcedimento(ItemDeProcedimentos item) {
        ArrayList<ItemDeProcedimentos> array =  new ArrayList();
        array = this.autorizacao.getItensProcedimento();
        array.add(item);
        this.autorizacao.setItensProcedimento(array);
    }

    public void alteraEstado(int opcao) {
        switch (opcao) {
            case 1:
                this.autorizacao.autorizar();
                break;
            case 0:
                this.autorizacao.negar();
                break;
            case 2:
                this.autorizacao.pendente();
                break;
            default:
                System.out.println("Opção Inválida!\n");
        }
        System.out.println(this.autorizacao.getEstado());
    }

    public void alteraLocal( Local local) {
        this.autorizacao.setLocal(local);
    }

    public void exibeAutorizacao() {
        System.out.println(this.autorizacao.toString());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import seguradoradesaude.model.ItemDeProcedimentos;
import seguradoradesaude.model.Procedimento;

/**
 *
 * @author Bárbara
 */
public class ControllerItemDeProcedimento {

    private ItemDeProcedimentos itemProcedimento;

    public ItemDeProcedimentos getItemProcedimento() {
        return itemProcedimento;
    }

    public ControllerItemDeProcedimento(Procedimento procedimento,int qtd) {
        this.itemProcedimento = new ItemDeProcedimentos(procedimento, qtd);
    }

    public void alteraQtd(int qtd) {
        this.itemProcedimento.setQuantidade(qtd);
    }

    public void alteraProcedimento(Procedimento procedimento) {
        this.itemProcedimento.setProcedimento(procedimento);
    }

    public void exibeItemProcedimento() {
        System.out.println(this.itemProcedimento.toString());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.model;

/**
 *
 * @author WorkFlow
 */
public class ItemDeProcedimentos {
    private Procedimento procedimento;
    private double quantidade;

    public ItemDeProcedimentos(Procedimento procedimento, double quantidade) {
        this.procedimento = procedimento;
        this.quantidade = quantidade;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemDeProcedimentos{" + "\nProcedimento= " + procedimento + "\nQuantidade= " + quantidade + '}';
    }
    
    
}


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
public class Operadora {

    private String nome;
    private ArrayList<PlanoDeSaude> planos = new ArrayList();

    public Operadora(String nome) {
        this.nome = nome;
    }

    public ArrayList<PlanoDeSaude> getPlanos() {
        return planos;
    }

    public void setPlanos(ArrayList<PlanoDeSaude> planos) {
        this.planos = planos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String tmp = "Planos: ";
           for (PlanoDeSaude temp : planos) {
			tmp +="\n"+ temp.toString();
		}
        return "Operadora{" + "nome= " + nome +"\n"+ tmp+'}';
    }
    
    

}

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
public class Hospital extends Local {

    private int qtdDeMedico;
    private ArrayList<Cirurgico> centrosCirurgicos = new ArrayList();

    public Hospital(String CEP, int qtdMedico) {
        super(CEP);
        this.qtdDeMedico = qtdMedico;
    }

    public int getQtdDeMedico() {
        return qtdDeMedico;
    }

    public void setQtdDeMedico(int qtdDeMedico) {
        this.qtdDeMedico = qtdDeMedico;
    }

    public ArrayList<Cirurgico> getCentrosCirurgicos() {
        return centrosCirurgicos;
    }

    public void setCentrosCirurgicos(ArrayList<Cirurgico> centrosCirurgicos) {
        this.centrosCirurgicos = centrosCirurgicos;
    }

    @Override
    public String toString() {
        String tmp = "Centros Cirúrgicos: ";
        for (Cirurgico temp : centrosCirurgicos) {
            tmp += "\n" + temp.toString();
        }
        return "Hospital{" + "\nQuantidade De Médicos=" + qtdDeMedico + tmp + '}';
    }

}

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
public class Clinica extends Local {

    private String medicoResponsavel;
    private ArrayList<Ambulatorial> ambulatorios = new ArrayList();

    public Clinica(String CEP, String medico) {
        super(CEP);
        this.medicoResponsavel = medico;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public ArrayList<Ambulatorial> getAmbulatorios() {
        return ambulatorios;
    }

    public void setAmbulatorios(ArrayList<Ambulatorial> ambulatorios) {
        this.ambulatorios = ambulatorios;
    }

    @Override
    public String toString() {
        return "Clinica{" + "medicoResponsavel=" + medicoResponsavel + ", ambulatorios=" + ambulatorios + '}';
    }
    
}

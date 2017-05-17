/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import java.util.ArrayList;
import seguradoradesaude.model.Ambulatorial;
import seguradoradesaude.model.Clinica;

/**
 *
 * @author Bárbara
 */
public class ControllerClinica {

    private Clinica clinica;

    public Clinica getClinica() {
        return clinica;
    }
    
    public ControllerClinica(String cep, String medico) {
        this.clinica = new Clinica(cep, medico);
    }

    public void adicionaAmbulatorio(Ambulatorial ambulatorio) {
        ArrayList<Ambulatorial> temp = new ArrayList ();
        temp = this.clinica.getAmbulatorios();
        temp.add(ambulatorio);
        this.clinica.setAmbulatorios(temp);
    }

    public void alteraMedicoResp(String medico) {
        this.clinica.setMedicoResponsavel(medico);
    }

    public void alteraLocal(String cep) {
        this.clinica.setCEP(cep);
    }
}

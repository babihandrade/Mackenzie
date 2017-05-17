/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import java.util.ArrayList;
import seguradoradesaude.model.Cirurgico;
import seguradoradesaude.model.Hospital;

/**
 *
 * @author Bárbara
 */
public class ControllerHospital {
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }
    
    public ControllerHospital(String cep, int qtd) {
        this.hospital = new Hospital(cep, qtd);
    }

    public void adicionaCentroCirurgico(Cirurgico cirurgico) {
        ArrayList<Cirurgico> temp = new ArrayList();
        temp = this.hospital.getCentrosCirurgicos();
        temp.add(cirurgico);
        this.hospital.setCentrosCirurgicos(temp);
    }

    public void alteraQtdMedicos(int qtd) {
        this.hospital.setQtdDeMedico(qtd);
    }

    public void exibeHospital() {
        System.out.println(this.hospital.toString());
    }
}

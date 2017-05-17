/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.controller;

import seguradoradesaude.model.Local;

/**
 *
 * @author Bárbara
 */
public class ControllerLocal {

    private Local local;

    public Local getLocal() {
        return local;
    }

    public ControllerLocal(String cep) {
        this.local = new Local(cep);
    }

    public void alteraLocal( String cep) {
        this.local.setCEP(cep);
    }

    public void exibeLocal() {
        System.out.println(this.local.toString());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.model;

/**
 *
 * @author 31687059
 */
public class Local {
    private String CEP;

    public Local(String CEP) {
        this.CEP = CEP;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Local{" + "CEP = " + CEP + '}';
    }
    
    
}

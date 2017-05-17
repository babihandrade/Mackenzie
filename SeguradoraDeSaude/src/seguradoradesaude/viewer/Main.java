/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradoradesaude.viewer;

import seguradoradesaude.controller.ControllerHospital;
import seguradoradesaude.controller.ControllerClinica;
import seguradoradesaude.controller.ControllerPlanoDeSaude;
import seguradoradesaude.controller.ControllerItemDeProcedimento;
import seguradoradesaude.controller.ControllerProcedimento;
import seguradoradesaude.controller.ControllerOperadora;
import seguradoradesaude.controller.ControllerCirurgico;
import seguradoradesaude.controller.ControllerLocal;
import seguradoradesaude.controller.ControllerAmbulatorial;

/**
 *
 * @author 31687059
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ControllerOperadora cOperadora = new ControllerOperadora("Amil");
        ControllerPlanoDeSaude cPlano = new ControllerPlanoDeSaude("Dix", cOperadora.getOperadora());
        //ControllerSegurado cSegurado = new ControllerSegurado("Bruno", 123456789, cPlano.getPlano(), cPlano);
        ControllerAmbulatorial cAmbulatorio = new ControllerAmbulatorial("Barueri", cPlano.getPlano(), 10);
        ControllerLocal cLocal = new ControllerLocal("12345-678");
        ControllerProcedimento cProcedimento = new ControllerProcedimento("Anestesia", cPlano.getPlano());

        ControllerCirurgico cCirurgico = new ControllerCirurgico("HCFMUSP", cPlano.getPlano(), 50);
        ControllerClinica cClinica = new ControllerClinica("Ortopedia", "12345-678");
        cClinica.adicionaAmbulatorio(cAmbulatorio.getAmbulatorio());
        ControllerHospital cHospital = new ControllerHospital("98765-432", 200);
        cHospital.adicionaCentroCirurgico(cCirurgico.getCirurgico());
        ControllerItemDeProcedimento cItemProc = new ControllerItemDeProcedimento(cProcedimento.getProcedimento(), 2);
        //ControllerAutorizacao cAutorizacao = new ControllerAutorizacao("08/05/2017", cLocal.getLocal(),
                //cSegurado.getSegurado(), cItemProc.getItemProcedimento());

        cOperadora.exibeOperadora();
        cPlano.exibePlano();
        //cSegurado.exibirSegurado();
        cAmbulatorio.exibeAmbulatorio();
        cLocal.exibeLocal();
        cProcedimento.exibeProcedimento();
        cCirurgico.exibeCentroCirurgico();
        cHospital.exibeHospital();
        cItemProc.exibeItemProcedimento();
        //cAutorizacao.exibeAutorizacao();
        
        

        /*
        
        
        Procedimento proc1 = new Procedimento("Tesoura Cirurgica", p1);
        proc1.adicionaPlanos(p2);
        Procedimento proc2 = new Procedimento("Touca Cirurgica", p1);
        proc2.adicionaPlanos(p2);
        Procedimento proc3 = new Procedimento("Luva Cirurgica", p1);        
        
        ItemDeProcedimentos item1 = new ItemDeProcedimentos(proc1,3);
        ItemDeProcedimentos item2 = new ItemDeProcedimentos(proc2,12);
        ItemDeProcedimentos item3 = new ItemDeProcedimentos(proc3,24);
        
        Local local1 = new Local("123455");
        Local local2 = new Local("965421");
        
        Segurado s1 = new Segurado("Bruno", 123456789, p1);
        s1.setListaDePlanos(p2);
        Segurado s2 = new Segurado("Bárbara", 123456789, p2);
        
        Autorizacao aut1 = new Autorizacao("20/05/2017",s2,local1,item1);
        Autorizacao aut2 = new Autorizacao("21/04/2017",s1,local1,item1);
        
        System.out.println("\n\n----Dados-----\nCliente: " + s1.getNome() + "\n"
                + s1.getListaDePlanos());
        
        System.out.println("\n\n----Dados-----\nCliente: " + s2.getNome() + "\n"
                + s2.getListaDePlanos() + "\n\n\n");
        
        System.out.println("Procedimentos: " + aut1.getItensProcedimento() + "\n"
                + "Cliente: " + aut1.getSegurado().getNome() + "\n"
                + "Data: " + aut1.getDataDaAvaliacao() + "\n"
                + "Status: " + aut1.getEstado());
        
        System.out.println("------------Atualizando Autorização--------\nNovo Status:");
        
        aut1.setEstado(Estado.Autorizado);
        
        System.out.println("Procedimento: " + aut1.getItensProcedimento() + "\n"
                + "Cliente: " + aut1.getSegurado().getNome() + "\n"
                + "Data: " + aut1.getDataDaAvaliacao() + "\n"
                + "Status: " + aut1.getEstado());
         */
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewebserviceimc;

import clientewebserviceimc.controllers.ControllerIMC;
import clientewebserviceimc.services.ServiceIMC;
import clientewebserviceimc.views.Tela;

/**
 *
 * @author caioc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tela janela = new Tela();
        janela.setVisible(true);
        ControllerIMC controller = new ControllerIMC(janela);
    }
    
}

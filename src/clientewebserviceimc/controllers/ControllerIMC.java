/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewebserviceimc.controllers;

import clientewebserviceimc.services.ServiceIMC;
import clientewebserviceimc.views.Tela;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author caioc
 */
public class ControllerIMC {
    private Tela janela;
    private JTextField campoAltura;
    private JTextField campoPeso;
    private JLabel labelResultado;
    private JButton botaoCalcular;
    private JComboBox comboSexo;
    
    public ControllerIMC(Tela frame) {
        janela = frame;
        campoAltura = janela.getCampoAltura();
        campoPeso = janela.getCampoPeso();
        labelResultado = janela.getLabelResultado();
        botaoCalcular = janela.getBotaoCalcular();
        comboSexo = janela.getComboSexo();
        inicializarAcoes();
    }
    
    private void inicializarAcoes() {
        comboSexo.addItem("Masculino");
        comboSexo.addItem("Feminino");
        
        botaoCalcular.addActionListener((e) -> {
            double altura = Double.parseDouble(campoAltura.getText());
            double peso = Double.parseDouble(campoPeso.getText());
            double resultado = ServiceIMC.getIMC(altura, peso);
            labelResultado.setText(Double.toString(resultado));
        });
    }
}

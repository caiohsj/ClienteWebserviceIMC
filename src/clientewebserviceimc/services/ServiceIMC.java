/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewebserviceimc.services;

import clientewebserviceimc.WebserviceIMC;
import clientewebserviceimc.WebserviceIMCService;

/**
 *
 * @author Caio Henrique
 */
public class ServiceIMC {

    public static double getIMC(double altura, double peso) {
        WebserviceIMCService service = new WebserviceIMCService();
        WebserviceIMC port = service.getWebserviceIMCPort();
        return port.getIMC(altura, peso);
    }
    
}

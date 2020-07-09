/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import UI.uiPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Giulia
 */
public class main {
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        uiPrincipal principal = new uiPrincipal();
        principal.setVisible(true);
        principal.setTitle("Simulador de Corridas de Fórmula 1");
        principal.toFront();  
    }
}

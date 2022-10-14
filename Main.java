/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sietemedio;

import javax.swing.JFrame;
import sietemedio.gui.Principal;
import sietemedio.gui.VentanaJugadores;

/**
 *
 * @author paloitparis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se crea un objeto de la ventanaJugadores
         VentanaJugadores ventanaJugadores = new VentanaJugadores();
         
         //Si el parámetro es falso el usuario no puede cambiar el tamaño del marco.
         ventanaJugadores.setResizable(false);
         
         //Los componentes deben estar visibles asi que la ventana debe de estarlo tambien
         //de lo contrario la ventana se centrará respecto la pantalla.
         
         //Si se le pasa null como parámetro se posiciona en el centro de la pantalla.
         ventanaJugadores.setLocationRelativeTo(null);
         
         //Indica si el control está visible
         //Se especifica true para mostrar el control
         ventanaJugadores.setVisible(true);
        
     
    }
    
}

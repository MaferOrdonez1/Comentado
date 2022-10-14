/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sietemedio;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

/**
 *
 * @author paloitparis
 */
//Crear un boton con sus especificaciones
public class Carta extends JButton {
    
    private final double valor;

    public Carta(String rutaImagen, double valor) {
        
        //Llamar al constructor de JButton
        super();
        
        //Implementa un borde de línea de grosor arbitrario y de un solo color.
        LineBorder lineBorder = new LineBorder(new Color(117, 175, 255, 0), 1, true);
        
        //Coloca diferentes bordes a un componente visible, con las
        //especificaciones del objeto lineborder a los botones
        this.setBorder(lineBorder);
        
        
        Image imagen = new ImageIcon(rutaImagen).getImage();
        //Ajustar la imagen 
        Image imagenEscalada = imagen.getScaledInstance(85, 121, java.awt.Image.SCALE_SMOOTH);
        
        //Permite alojar la imagen en un Jlabel 
        this.setIcon(new ImageIcon(imagenEscalada));
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    

}

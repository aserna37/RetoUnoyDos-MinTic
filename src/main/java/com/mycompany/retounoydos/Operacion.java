/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounoydos;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Operacion {
    double numero1;
    double numero2;
    double respuesta;
    
    public Operacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null,"El valor es: " + this.respuesta, "Resultado de la Operación",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
}

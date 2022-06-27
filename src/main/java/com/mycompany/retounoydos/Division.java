/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounoydos;

import java.text.DecimalFormat;


/**
 *
 * @author USER
 */
public class Division extends Operacion{
    
    double division;
    
    public Division(int numero1, int numero2){
    super(numero1,numero2);
    this.division = numero1 / numero2;
    //DecimalFormat formato = new DecimalFormat("#.00");
    this.respuesta = this.division;
        
    }
}

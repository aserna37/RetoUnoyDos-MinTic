/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounoydos;

/**
 *
 * @author USER
 */
public class ClsMultiplicacion extends ClsOperacion {
    
    double multiplicacion;
    
    public ClsMultiplicacion(double numero1, double numero2){
    super(numero1,numero2);
    this.multiplicacion = numero1 * numero2;
    this.respuesta = this.multiplicacion;
    }
    
}

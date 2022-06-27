/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounoydos;

/**
 *
 * @author USER
 */
public class Resta extends Operacion {
    
    double resta;
    
    public Resta(double numero1, double numero2){
    super(numero1,numero2);
    this.resta = numero1 - numero2;
    this.respuesta = this.resta;
    }
}

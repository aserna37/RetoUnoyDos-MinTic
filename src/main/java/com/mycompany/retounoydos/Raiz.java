/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounoydos;

/**
 *
 * @author USER
 */
public class Raiz extends Operacion{
    
    double raiz;
        
    public Raiz(int numero1, int numero2){
    super(numero1,numero2);
    this.raiz = Math.sqrt(numero1);
    //DecimalFormat formato = new DecimalFormat("#.00");
    this.respuesta = this.raiz;
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounoydos;

/**
 *
 * @author USER
 */
public class Potencia extends Operacion{
    
    double potencia;
    
    public Potencia(int numero1, int numero2){
    super(numero1,numero2);
    this.potencia = Math.pow(numero1, numero2);
    this.respuesta = this.potencia;
        
    }
    
}

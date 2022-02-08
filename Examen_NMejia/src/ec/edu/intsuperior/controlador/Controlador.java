/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

/**
 *
 * @author Nelson
 */
// Tipode Dato 
public class Controlador {
    
    Administrador administrador = new Administrador(this);
    Estudiante estudiante = new Estudiante(this);
    Loggin loggin= new Loggin(this);
    
}

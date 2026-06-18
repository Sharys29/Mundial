/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;

import java.time.LocalDate;

import personas.Persona;

/**
 *
 * @author sharys
 */




public class Jugador extends Persona {
   
   private int numero;
   private String posicion; 

   //Metodo getter
    public int getNumero() {
        return numero;
    }


    public String getPosicion() {
        return posicion;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Jugador( String nombre,String nacionalidad, LocalDate fechaNaci, int numero, String posicion ) {
        super(nombre, nacionalidad, fechaNaci);
        this.numero = numero;
        this.posicion = posicion;
        
    }
   
}
    
    
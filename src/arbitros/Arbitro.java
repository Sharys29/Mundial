/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitros;

import java.time.LocalDate;
import personas.Persona;

/**
 *
 * @author UTN
 */
public class Arbitro extends Persona {
    private String categoria;

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public Arbitro(String categoria, String nombre, String nacionalidad, LocalDate fechaNaci) {
        super(nombre, nacionalidad, fechaNaci);
        this.categoria = categoria;
    }
    
       @Override
    public String toString() {
        return "Arbitro{nombre=" + getNombre() + ", categoria=" + categoria + '}';
    }
}
   

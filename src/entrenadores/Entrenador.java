/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;
import java.time.LocalDate;
import personas.Persona;
/**
 *
 * @author josea
 */
public class Entrenador extends Persona{
    private int experiencia;

    public Entrenador(int experiencia,String nombre, String nacionalidad, LocalDate fechaNaci) {
        super(nombre, nacionalidad, fechaNaci);
        this.experiencia=experiencia;
    }

    public int getExperiencia(){
        return this.experiencia;
    }
    
    public void setExperiencia(int experiencia){
        this.experiencia=experiencia;
    
    }
} 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;
import personas.Persona;
/**
 *
 * @author josea
 */
public class Entrenador extends Persona{
    private int experiencia;
    
    public int getExperiencia(){
        return this.experiencia;
    }
    
    public int setExperiencia(int experiencia){
        this.experiencia=experiencia;
    }
}

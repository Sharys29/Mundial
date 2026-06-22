/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;
/**
 *
 * @author josea
 */
public class Persona {
    protected String nombre;
    protected String nacionalidad;
    protected LocalDate fechaNaci;
    
    public String getNombre(){
        return this.nombre;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public LocalDate getFecha(){
        return this.fechaNaci;
    }
    public int calcularEdad(){
        LocalDate hoy =LocalDate.now();
        return java.time.Period.between(fechaNaci, hoy).getYears();
    }
        
    public Persona(String nombre,String nacionalidad,LocalDate fechaNaci){
        this.nombre = nombre;
        this.nacionalidad=nacionalidad;
        this.fechaNaci=fechaNaci;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fechaNaci=" + fechaNaci + '}';
    }
    
    
           
}

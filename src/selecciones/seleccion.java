/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selecciones;

import entrenadores.Entrenador;
import jugadores.Jugador;

/**
 *
 * @author UTN
 */
public class seleccion {
  private String     nombre;
    private String     grupo;
    private Entrenador entrenador;
    private Jugador[]  jugadores;

    public seleccion(String nombre, String grupo, Entrenador entrenador, Jugador[] jugadores) {
        this.nombre     = nombre;
        this.grupo      = grupo;
        this.entrenador = entrenador;
        this.jugadores  = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Seleccion{nombre=" + nombre + ", grupo=" + grupo + ", entrenador=" + entrenador + '}';
    }
}



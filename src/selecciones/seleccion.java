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

    private final Jugador[] Jugadores;
    public enum grupo{
        A,B,C,D,E,F,G,H,I
    }
  private String     nombre;
    private grupo     grupo;
    private Entrenador entrenador;
    private Jugador[]  jugadores;
    private int contador;

    public seleccion(String nombre, grupo grupo, Entrenador entrenador, int capacidad) {
        this.nombre     = nombre;
        this.grupo      = grupo;
        this.entrenador = entrenador;
        this.Jugadores = new Jugador[capacidad];
        this.contador = 0;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(grupo grupo) {
        this.grupo = grupo;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Jugador[] getJugadores() {
        return Jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public grupo getGrupo() {
        return grupo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public int getContador() {
        return contador;
    }

   public void agregarJugador(Jugador jugador) {
        if (contador < jugadores.length) {
            jugadores[contador] = jugador;
            contador++;
        }
    }
   public void eliminarJugador(Jugador jugador) {
        for (int i = 0; i < contador; i++) {
            if (jugadores[i].equals(jugador)) {
                // Desplazar los jugadores restantes
                for (int j = i; j < contador - 1; j++) {
                    jugadores[j] = jugadores[j + 1];
                }
                jugadores[contador - 1] = null;
                contador--;
                return;
            }
        }
    }

      @Override
    public String toString() {
        return "Seleccion{nombre=" + nombre + ", grupo=" + grupo +
               ", entrenador=" + entrenador + ", jugadores=" + contador + '}';
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;
import arbitros.Arbitro;
import selecciones.seleccion;
import resultados.Resultado;
/**
 *
 * @author josea
 */
public class Partido {
    private seleccion seleccionLocal;
    private seleccion seleccionVisitante;
    private String estadio;
    private String fecha;
    private String hora;
    private Arbitro arbitro;
    private Resultado resultado;

    // Constructor
    public Partido(
            seleccion seleccionLocal, 
            seleccion seleccionVisitante,
            String estadio, String fecha, String hora,
            Arbitro arbitro, Resultado resultado) {
        this.seleccionLocal = seleccionLocal;
        this.seleccionVisitante = seleccionVisitante;
        this.estadio = estadio;
        this.fecha = fecha;
        this.hora = hora;
        this.arbitro = arbitro;
        this.resultado = resultado;
    }

    // Getters y Setters
    public seleccion getSeleccionLocal(){
        return seleccionLocal; 
    }
    public void setSeleccionLocal(seleccion seleccionLocal){ 
        this.seleccionLocal = seleccionLocal; 
    }

    public seleccion getSeleccionVisitante(){ 
        return seleccionVisitante; 
    }
    public void setSeleccionVisitante(seleccion seleccionVisitante){ 
        this.seleccionVisitante = seleccionVisitante; 
    }

    public String getEstadio(){ 
        return estadio; 
    }
    public void setEstadio(String estadio){
        this.estadio = estadio;
    }

    public String getFecha(){
        return fecha; 
    }
    public void setFecha(String fecha){
        this.fecha = fecha; 
    }

    public String getHora(){
        return hora; 
    }
    public void setHora(String hora){
        this.hora = hora; 
    }

    public Arbitro getArbitro(){
        return arbitro; 
    }
    public void setArbitro(Arbitro arbitro){
        this.arbitro = arbitro; 
    }

    public Resultado getResultado(){
        return resultado;
    }
    public void setResultado(Resultado resultado){ 
        this.resultado = resultado; 
    }
    
    
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;
import selecciones.seleccion;
/**
 *
 * @author josea
 */
public class Resultado {
    private seleccion selecccionLocal;
    private seleccion seleccionVisitante;
    private int golesLocal;
    private int golesVisitante;
    
    public Resultado(){
        this.selecccionLocal=null;
        this.seleccionVisitante=null;
        this.golesLocal=0;
        this.golesVisitante=0;
    }

    public Resultado(seleccion selecccionLocal, seleccion seleccionVisitante, int golesLocal, int golesVisitante) {
        this.selecccionLocal = selecccionLocal;
        this.seleccionVisitante = seleccionVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    
    

    public seleccion getSelecccionLocal() {
        return selecccionLocal;
    }

    public seleccion getSeleccionVisitante() {
        return seleccionVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setSelecccionLocal(seleccion selecccionLocal) {
        this.selecccionLocal = selecccionLocal;
    }

    public void setSeleccionVisitante(seleccion seleccionVisitante) {
        this.seleccionVisitante = seleccionVisitante;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
    public boolean empate(){
        return golesLocal == golesVisitante;
    }
    
    public int diferenciaGoles(){
        return Math.abs(golesLocal-golesVisitante);
    }
    
    public int totalGoles(){
        return golesLocal+golesVisitante;
    }
    
    public boolean ambosMarcan(){
        return golesLocal> 0 && golesVisitante > 0;
    }
    
    public seleccion getSeleccionGanadora(){
        if (empate()) return null;
        return golesLocal>golesVisitante ? selecccionLocal:seleccionVisitante;
    }
    
    public String getMarcador(){
        return golesLocal + "-"+golesVisitante;
    }

    @Override
    public String toString() {
        String ganador=empate()
                ? "Empate"
                :"Ganador"+getSeleccionGanadora();
        return "Resultado{" + 
                "Marcador:"+getMarcador()+
                ",totalGoles:"+totalGoles()+
                ",diferencia:"+diferenciaGoles()+
                ",ambos marcaron:"+ambosMarcan()+
                ","+ganador + "}";
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.TDA.listas.ListaEnlazada;
import modelo.Simulacion;

/**
 *
 * @author Estefania Jean Encalada
 */
public class SimulacionControl {
    private Simulacion simulacion;
    private ListaEnlazada<Simulacion> simulaciones;//lista Objeto

    //constructor 
    public SimulacionControl(){
        this.simulaciones= new ListaEnlazada<>();//inicializa
        this.simulacion= new Simulacion();
    }

    public ListaEnlazada<Simulacion> getSimulaciones() {
        return simulaciones;
    }

    public void setSimulaciones(ListaEnlazada<Simulacion> simulaciones) {
        this.simulaciones = simulaciones;
    }

    //guardar lista
    public Boolean guardar(){
        if(simulacion !=null){
            simulaciones.add(simulacion);
            return true;
        }
        return false;
    }
    //obtener objeto boleto
    public Simulacion getSimulacion() {
        if (simulacion == null) {
            simulacion = new Simulacion();
        }
        return simulacion ;
    } 
    
    public void setSimulacion(Simulacion simulaciones) {
        this.simulacion = simulaciones;
    }
 
    
    
    
    
    
    
}

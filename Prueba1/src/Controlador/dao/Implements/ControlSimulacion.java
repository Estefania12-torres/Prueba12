/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.dao.Implements;

import Controlador.TDA.listas.ListaEnlazada;
import modelo.Simulacion;
import Controlador.dao.DaoImplements;




/**
 *
 * @author Usuario
 */
public class ControlSimulacion extends DaoImplements<Simulacion> {
    
    private Simulacion simulacion = new Simulacion();
    private ListaEnlazada<Simulacion> simulaciones = new ListaEnlazada<>();

    public ControlSimulacion() {
        super(Simulacion.class);
    }

    public ControlSimulacion(Simulacion simulacion, Class<Simulacion> clazz) {
        super(clazz);
        this.simulacion = simulacion;
    }

    public ListaEnlazada<Simulacion> getSimulaciones() {
        if (simulaciones.isEmpty()) {
            simulaciones = this.all();
        }
        return simulaciones;

    }

    public void setSimulaciones(ListaEnlazada<Simulacion> simulaciones) {
        this.simulaciones = simulaciones;
    }

    public Boolean guardar() {
        if (simulacion != null) {
            simulaciones.add(simulacion);
            simulacion = null;
            return true;
        }
        return false;
    }

    public Simulacion getSimulacion() {
        if (simulacion == null) {
            simulacion = new Simulacion();
        }
        return simulacion;
    }

    public void setPasajero(Simulacion simulacion) {
        this.simulacion = simulacion;
    }

    public Boolean guardar(Simulacion simulacion) {
        simulacion.setId(all().getLength());
        return persist(simulacion);
    }

    
}

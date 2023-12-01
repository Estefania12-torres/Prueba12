/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.TDA.listas.ListaEnlazada;
import modelo.Tramite;

/**
 *
 * @author Estefania Jean Encalada
 */
public class TramiteControl {
private Tramite tramite;
private ListaEnlazada<Tramite> tramites; // Lista de objetos Tramite

// Constructor
public TramiteControl() {
    this.tramites = new ListaEnlazada<>(); // Inicializa la lista
    this.tramite = new Tramite(); // Inicializa un nuevo Tramite
}


   public ListaEnlazada<Tramite> getTramites() {
    return tramites;
}

public void setTramites(ListaEnlazada<Tramite> tramites) {
    this.tramites = tramites;
}

// Guardar tramite en la lista
public Boolean guardar() {
    if (tramite != null) {
        tramites.add(tramite);
        return true;
    }
    return false;
}

// Obtener el objeto Tramite actual
public Tramite getTramite() {
    if (tramite == null) {
        tramite = new Tramite();
    }
    return tramite;
}

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }



}

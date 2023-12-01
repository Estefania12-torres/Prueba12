/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.dao.Implements;

import Controlador.TDA.listas.ListaEnlazada;
import modelo.Tramite;
import Controlador.dao.DaoImplements;

/**
 *
 * @author Usuario
 */
public class ControlTramite extends DaoImplements<Tramite> {
    private Tramite tramite = new Tramite();
private ListaEnlazada<Tramite> tramites = new ListaEnlazada<>();

public ControlTramite() {
    super(Tramite.class);
}

public ControlTramite(Tramite tramite, Class<Tramite> clazz) {
    super(clazz);
    this.tramite = tramite;
}

public ListaEnlazada<Tramite> getTramites() {
    if (tramites.isEmpty()) {
        tramites = this.all();
    }
    return tramites;
}

public void setTramites(ListaEnlazada<Tramite> tramites) {
    this.tramites = tramites;
}

public Boolean guardar() {
    if (tramite != null) {
        tramites.add(tramite);
        tramite = null;
        return true;
    }
    return false;
}

public Tramite getTramite() {
    if (tramite == null) {
        tramite = new Tramite();
    }
    return tramite;
}

}

    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.dao.Implements;

import Controlador.TDA.listas.ListaEnlazada;
import Controlador.dao.DaoImplements;
import modelo.Ventanilla;

/**
 *
 * @author Usuario
 */
public class ControlVentanilla extends DaoImplements<Ventanilla>{
    
    private Ventanilla ventanilla = new Ventanilla();
    private ListaEnlazada<Ventanilla> ventanillas = new ListaEnlazada<>();

public ControlVentanilla() {
    super(Ventanilla.class);
}

public ControlVentanilla(Ventanilla ventanilla, Class<Ventanilla> clazz) {
    super(clazz);
    this.ventanilla = ventanilla;
}

public ListaEnlazada<Ventanilla> getVentanillas() {
    if (ventanillas.isEmpty()) {
        ventanillas = this.all();
    }
    return ventanillas;
}

public void setVentanillas(ListaEnlazada<Ventanilla> ventanillas) {
    this.ventanillas = ventanillas;
}

    public Boolean guardar() {
    if (ventanilla != null) {
        ventanillas.add(ventanilla);
        ventanilla = null;
        return true;
    }
    return false;
}

public Ventanilla getVentanilla() {
    if (ventanilla == null) {
        ventanilla = new Ventanilla();
    }
    return ventanilla;
}

public void setVentanilla(Ventanilla ventanilla) {
    this.ventanilla = ventanilla;
}

public Boolean guardar(Ventanilla ventanilla) {
    ventanilla.setId(all().getLength());
    return persist(ventanilla);
}
    
}
